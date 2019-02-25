package exos.application;

//Exercice d'application 1 (page 6)

public class Ville {
	//attribus 
	private String nomVille;
	private int nbrHabitans;
	
	//constructeurs
	public Ville(){
		
	}
	
	public Ville(String nomVille, int nbrHabitans){
		this.nomVille = nomVille;
		this.nbrHabitans = nbrHabitans;
	}
	
	//getters
	public String getNomVille(){
		return this.nomVille;
	}
	
	public int getNbrHabitans(){
		return this.nbrHabitans;
	}
	
	//setters
	public void setNomVille(String nomVille){
		this.nomVille = nomVille;
	}
	
	public void setNbrHabitans(int nbrHabitans){
		this.nbrHabitans = nbrHabitans;
	}
}
