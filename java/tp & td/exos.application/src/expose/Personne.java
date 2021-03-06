package expose;

public class Personne {
	
	//attributs
	
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected String mail;
	protected int tel;
	
	private String prive;
	
	//constructeur
	
	public Personne(){
		
	}
	
	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, String addresse, String mail, int tel){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = addresse;
		this.mail = mail;
		this.tel = tel;
	}
	
	
	//methodes
//	protected void whoIma(){
//		System.out.println(this.getClass());
//	}
	
	protected String decrit(){
		return  "Nom : " + this.nom + ",\t Prenom : " + this.prenom;
	}
	
	public String toString(){
		return "\nNom : " + this.nom + "\nPrenom : " + this.prenom + "\nAdresse : " + this.adresse
				+ "\nMail : " + this.mail + "\nTel : " + this.tel;
	}
}