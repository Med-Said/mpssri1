#!/bin/bash

echo "welcom"
#saisi des notes
i=0
declare -a notes
reponse="n"
negatif="faux"

until [ $reponse = "o" ]; do
        read -p "note : " note
	notes[$i]=$note
	read -p "quiter ? (o/n) :" reponse
	let "i+=1"

	if [ $note -lt 0 ]; then
		negatif="vrai"
		reponse="o"
	fi
done
#echo "notes :  ${notes[@]}"
nbNotes=${#notes[@]}

#calcule moye
some=0
res=${notes[@]}
for i in  $res; do
	(( some += $i ))
done

moy=$((some / nbNotes))




echo "*********************resultats*********************"
if [ $negatif != "vrai" ]; then
	echo "nombre de notes : ${#notes[@]}"
	echo "some : $some"
	echo "moyen =  $moy"
else
	echo "nombre negatif !"
fi


echo "*********************mention*********************"

case $moy in
	10|11|12)
		echo "passable";;
	13|14)
		echo "assez bien";;
	15|16)
		echo "tres bine";;
	17|18|19)
		echo "excellent";;
	20)
		echo "excellent +";;
	*)
		echo "!"
esac
