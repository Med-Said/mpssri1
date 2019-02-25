package gestionContacts;

import java.util.Arrays;

// question 3

public  class Groupe implements Moninterface {
	
	private String nom;
	private Personne[] membres;
	public int taille;
	public int compteur = 0; //compteur
	
	public Groupe(String nom, int taille){
		this.nom = nom;
		this.taille = taille;
		membres = new Personne[taille];
		
	}

	public Personne[] getMembres(){
		return this.membres;
	}
	
	public boolean ajouter(Object obj){
		if( obj instanceof Personne && this.compteur < this.taille && obj != null){
			membres[compteur] = (Personne) obj;
			compteur++;
			return true;
		}
		else
			return false;
	}
	
	public int chercher(Object obj){
		if(obj instanceof Personne){
			Personne personne = (Personne) obj;
			for(int i = 0; i<taille; i++){
				if(membres[i].equals(personne)){
					return i;
				}
			}
		}
		return -1;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Groupe && obj != null){
			Groupe groupe = (Groupe) obj;
			if(this.nom.equals(groupe.nom))
				return true;
		}
		return false;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setMembres(Personne[] membres) {
		this.membres = membres;
	}

	@Override
	public String toString() {
		
		//recuperation des information  des membres du groupe,
		String pers  = "";//les informatin des personnes.
		for(int i =0; i < compteur; i++){
			 pers += "Information du membre " + i + ":\nNom : " + this.membres[i].getNom()
					+ "\nEmail : " + this.membres[i].getEmail() + "\nAdresse : " + this.membres[i].getAdresse()
					+ "\nTel : " + this.membres[i].getTel() + "\n\n";
		}
		
		return "Nom du Groupe : " + nom + "\ntaille : " + taille + "\n\nNombre de membres : " + compteur + "\n" + pers;
		
	}
	
	
	
	
	
}

















