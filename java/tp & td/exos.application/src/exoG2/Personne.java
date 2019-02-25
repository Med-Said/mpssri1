package exoG2;

public class Personne {
	protected String nom;
	
	public Personne(String nom){
		this.nom = nom;
	}
	
	public String affiche(){
		return "Je suis " + nom + " le ";
	}
}
