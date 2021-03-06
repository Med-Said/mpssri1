package expose;

public class Enseignant extends Personne{
	private String matiere;
	private int nbrClasse;
	private int nbrHoraire;
	
	public Enseignant(String nom, String prenom){
		super(nom, prenom);
	}
	
	public Enseignant(String nom, String prenom, String adresse, String mail, int tel, String matiere, int nbrClasse, int nbrHoraire){
		super(nom,prenom,adresse,mail,tel);
		this.matiere = matiere;
		this.nbrClasse = nbrClasse;
		this.nbrHoraire = nbrHoraire;
	}
	
	public String decrit(){
		
		return "\tEnseignant\n" +  super.decrit();
		
	}
	
	public String toString(){
		return super.toString() + "\nMatiere : " + this.matiere + "\nNombre de classes : " + this.nbrClasse + "\nNombre d'horaires : " + this.nbrHoraire;
	}
	
}
