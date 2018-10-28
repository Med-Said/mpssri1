package gestionContacts;

public class Carnet implements Moninterface{

	private String proprietaire;
	private Groupe[] groupes;
	private int taille;
	int compteur = 0; 
	
	
	public Carnet(String proprietaire, int taille){
		this.proprietaire = proprietaire;
		this.taille = taille;
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




	@Override
	public boolean ajouter(Object obj) {
		if( obj instanceof Groupe && this.compteur < this.taille){
			groupes[compteur] = (Groupe) obj;
			compteur++;
			return true;
		}
		else
			return false;
	}

	@Override
	public int chercher(Object obj) {
		if(obj instanceof Groupe){
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
}
