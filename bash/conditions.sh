#!/bin/bash

#ex 1
if [[ 5 -lt 6 ]]; then
	echo "vrai"
else
	echo "faux"
fi


#exe 2

echo "vous aimez linux ?"
read answer

if [[ $answer == "oui" ]]; then
	echo "vous etes mignon"
else
	echo "vous allez mourir tres prochainement"
fi