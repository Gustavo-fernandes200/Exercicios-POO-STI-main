#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Usage: $0 lista_de_ficheiros"
  echo "e.g.,"
  echo "    $0 POO-jupyter/*.ipynb"
fi

for f in $*
do
  echo $f
#   jupyter-nbconvert $f --to slides --SlidesExporter.reveal_scroll=True 
#   jupyter-nbconvert $f --to html 
  jupyter-nbconvert $f --to pdf
done
