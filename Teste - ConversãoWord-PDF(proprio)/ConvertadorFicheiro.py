
import os
import traceback
import pdfplumber
from docx import Document
from docx.shared import Inches
from PIL import Image
import pytesseract  
import io


def save_image(image_bytes, image_path):
    
    try
        with Image.open(io.BytesIO(image_bytes)) as img:
            img.save(image_path, format="PNG")
            print(f"Imagem salva com sucesso: {image_path}")
    except Exception as e:
        print(f"Erro ao salvar a imagem {image_path}: {e}")
        traceback.print_exc()


class PDFToWordConverter:
    """Classe para converter PDF para Word."""

    def __init__(self, pdf_file_path, word_file_path, output_images_dir="images"):
        """Construtor da classe."""
        self.pdf_file_path = os.path.normpath(pdf_file_path.strip('"'))
        if not os.path.isfile(self.pdf_file_path):
            raise FileNotFoundError(f"Arquivo {self.pdf_file_path} não encontrado.")

        # Configura caminhos de saída
        self.word_file_path = os.path.normpath(word_file_path.strip('"'))
        if not self.word_file_path.endswith(".docx"):
            self.word_file_path += ".docx"
        os.makedirs(os.path.dirname(self.word_file_path), exist_ok=True)

        self.output_images_dir = os.path.normpath(output_images_dir)
        os.makedirs(self.output_images_dir, exist_ok=True)

        # Configura o caminho do executável do Tesseract (se necessário)
        pytesseract.pytesseract.tesseract_cmd = r"C:\Program Files\Tesseract-OCR\tesseract.exe"

    def extract_text_from_image(self, image_path):
        """Usa OCR para extrair texto de uma imagem."""
        try:
            with Image.open(image_path) as img:
                return pytesseract.image_to_string(img, lang="por")  # Idioma configurado para português
        except Exception as e:
            print(f"Erro ao processar OCR na imagem {image_path}: {e}")
            traceback.print_exc()
            return ""

    def convert(self):
        """Realiza a conversão do PDF para Word."""
        doc = Document()

        try:
            with pdfplumber.open(self.pdf_file_path) as pdf:
                if len(pdf.pages) == 0:
                    print("O PDF está vazio. Nenhuma página para converter.")
                    return

                for page_number, page in enumerate(pdf.pages, start=1):
                    # Adiciona cabeçalho para a página
                    doc.add_heading(f'Página {page_number}', level=1)

                    # Extrai texto da página
                    text = page.extract_text()
                    if text:
                        doc.add_paragraph(text)
                    else:
                        doc.add_paragraph("Texto não disponível para esta página.")
                        print(f"Aviso: Não foi possível extrair texto da página {page_number}.")

                    # Extrai tabelas da página
                    tables = page.extract_tables()
                    if tables:
                        doc.add_heading(f'Tabelas da Página {page_number}', level=2)
                        for table_index, table in enumerate(tables, start=1):
                            doc.add_paragraph(f'Tabela {table_index}:')
                            table_word = doc.add_table(rows=1, cols=len(table[0]))
                            table_word.style = 'Table Grid'

                            # Adiciona cabeçalhos e linhas à tabela
                            for i, header in enumerate(table[0]):
                                table_word.cell(0, i).text = str(header)
                            for row in table[1:]:
                                row_cells = table_word.add_row().cells
                                for i, cell in enumerate(row):
                                    row_cells[i].text = str(cell)

                    # Extrai imagens da página
                    for image_index, image in enumerate(page.images, start=1):
                        try:
                            image_bytes = image.get("stream").get_data()
                            image_path = os.path.join(
                                self.output_images_dir, f"page_{page_number}_image_{image_index}.png"
                            )
                            save_image(image_bytes, image_path)

                            # Adiciona a imagem ao documento Word
                            doc.add_heading(f'Imagem da Página {page_number}, Nº {image_index}', level=2)
                            doc.add_picture(image_path, width=Inches(4.0))

                            # Extrai texto da imagem usando OCR
                            ocr_text = self.extract_text_from_image(image_path)
                            if ocr_text.strip():
                                doc.add_paragraph("Texto extraído da imagem:")
                                doc.add_paragraph(ocr_text)

                        except Exception as e:
                            print(f"Erro ao processar imagem na página {page_number}: {e}")
                            traceback.print_exc()

            # Salva o documento Word
            doc.save(self.word_file_path)
            print(f"Arquivo convertido com sucesso: {self.word_file_path}")
            print(f"Imagens salvas no diretório: {self.output_images_dir}")

        except FileNotFoundError as e:
            print(f"Erro: Arquivo PDF '{self.pdf_file_path}' não encontrado.")
            traceback.print_exc()
        except PermissionError as e:
            print(f"Erro: Permissão negada para acessar o arquivo de saída '{self.word_file_path}'.")
            traceback.print_exc()
        except Exception as e:
            print(f"Ocorreu um erro inesperado: {e}")
            traceback.print_exc()


# Exemplo de uso
if __name__ == "__main__":
    pdf_file = input("Digite o caminho completo do arquivo PDF a ser convertido: ").strip()
    word_file = input(
        "Digite o caminho completo para salvar o arquivo Word (ex: C:\\Users\\ANTON\\Documents\\resultado.docx): "
    ).strip()

    # Configura nome padrão do arquivo Word, se necessário
    if not word_file.endswith(".docx"):
        word_file = os.path.join(word_file, "resultado.docx")
        print(f"Não foi especificado um nome de arquivo. Salvando como: {word_file}")

    converter = PDFToWordConverter(pdf_file, word_file)
    converter.convert()

