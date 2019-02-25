package expose;

public class Etudiant extends Personne{
	private String classe;
	private String identifiant;
	
	
//	public Etudiant(String nom, String prenom){
//		super(nom,prenom);
//	}
//	
//	public Etudiant(String nom, String prenom, String adresse, String mail, int tel, String classe, String identifiant){
//		super(nom,prenom,adresse,mail,tel);
//		this.classe = classe;
//		this.identifiant = identifiant;
//	}
	
	public String decrit(){
		
		return "\tEtudiant\n" +  super.decrit();
		
	}
	
	public String toString(){
		return  super.toString() + "\nClasse : " + this.classe + "\nIdentifiant : " + this.identifiant;
	}
}
