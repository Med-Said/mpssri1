package exos.application;

//Exercice d'application 2 (page 11)

public class Pays {
	//attributs
	int nbrVille;
	Ville TV[];
	public int compteur = 0;
	
	//constructeur
	public Pays(int nbrVille){
		this.nbrVille = nbrVille;
		TV = new Ville[nbrVille];
	}
	
	//methodes
	public boolean ajouterVille(Ville v){
		if(compteur < nbrVille){
			TV[compteur] = v;
			compteur++;
			return true;
		}
		return false;
	}
}