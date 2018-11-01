package exoG2;

public class Plombier extends Personne{

	public Plombier(String nom) {
		super(nom);
	}
	
	public String affiche(){
		return super.affiche() + "Plombier";
	}

}
