#!/bin/bash

echo "*********************resultats*********************"

#ajouter les fichiers modifies dans les derniere 24 h dans le dossier 'archive'
for i in $(find ./ -mtime -1)
do
	if [ -f "$i" ]
	then # fichier
	    cp $i archive
		
	else #repertoire 
	  cp -r $i archive
	fi
done

#compression le dossier archive

tar -caf archive.tar ./archive/



