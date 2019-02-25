package gestionContacts;

public class Carnet implements Moninterface{

	private String proprietaire;
	private Groupe[] groupes;
	private int taille;
	int compteur = 0; 
	
	
	public Carnet(String proprietaire, int taille){
		this.proprietaire = proprietaire;
		this.taille = taille;
		groupes = new Groupe[taille];
	}
	
	
	@Override
	public boolean ajouter(Object obj) {
		if( obj instanceof Groupe && this.compteur < this.taille && obj != null){
				groupes[compteur] = (Groupe) obj;
				compteur++;
				return true;
		}
			return false;
	}

	@Override
	public int chercher(Object obj) {
		if(obj instanceof Groupe && obj != null){
			Groupe groupe = (Groupe) obj;
			for(int i = 0; i<taille; i++){
				if(groupes[i].equals(groupe)){
					return i;
				}
			}
		}
		return -1;
	}
	
	
	public boolean ajouter(Personne personne, Groupe groupe){
		return groupe.ajouter(personne);
	}
	
	public int chercher(Personne personne, Groupe groupe){
		return groupe.chercher(personne);
	}
	
	
	
	
	
	
	
	
	
	public String getProprietaire() {
		return proprietaire;
	}




	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}




	public Groupe[] getGroupes() {
		return groupes;
	}




	public void setGroupes(Groupe[] groupes) {
		this.groupes = groupes;
	}




	public int getTaille() {
		return taille;
	}




	public void setTaille(int taille) {
		this.taille = taille;
	}


}