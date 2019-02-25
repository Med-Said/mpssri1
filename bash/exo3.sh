#!/bin/bash

echo "1. afficher le repertoire courant"
echo "2. se deplacer dans un repertoire"
echo "3. afficher le contenu du repertoire courant"
echo "4. afficher le contenu d'un repertoire"
echo "5. quitter"

read -p "choix : " choix

echo "*********************resultats*********************"

case $choix in
	1)
		echo $(pwd);;
	2)
		echo "voici la list des repertoires dans votre
		repertoire courant $(pwd)"
		echo $(ls -l | egrep "^d"| cut -d" " -f9)
		read -p "saisissez le nom du repertoire : " rep
		cd $rep
		echo "repertoire courant $(pwd)"
		;;
	3)
		echo $(ls);;
	4)
		
		echo "voici la list des repertoires dans votre
		repertoire courant $(pwd)"
		echo $(ls -l | egrep "^d"| cut -d" " -f9)
		read -p "saisissez le nom du repertoire : " rep
		ls $rep
		;;
	5)
		echo "au revoir";;
	*)
		echo  "erreur!"
esac
