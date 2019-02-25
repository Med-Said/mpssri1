package exoG2;

public class Menuisier extends Personne{

	public Menuisier(String nom) {
		super(nom);
	}

	public String affiche(){
		return super.affiche() + "Menuisier";
	}
}
