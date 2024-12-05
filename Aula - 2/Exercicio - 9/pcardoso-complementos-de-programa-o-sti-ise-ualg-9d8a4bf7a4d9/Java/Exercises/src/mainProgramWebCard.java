
public class mainProgramWebCard {

	public static void main(String[] args) {
		WebCard wcs[] = new WebCard[4];
		
		wcs[0] = new ChristmasCard("Pedro");
		wcs[1] = new BirthdayCard("Margarida");
		wcs[2] = new ChristmasCard("Cl√°udia");
		wcs[3] = new BirthdayCard("Jo„o");
		
		for( WebCard wc : wcs){
			wc.showMessage();
		}
	}
}
