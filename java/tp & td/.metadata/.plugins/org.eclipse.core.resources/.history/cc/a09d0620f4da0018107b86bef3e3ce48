package gestionContacts;

public abstract class Personne {
	private String nom;
	private String adresse;
	private String email;
	private int tel;
	
	public Personne(String nom, String adresse, String email, int tel){
		this.nom = nom;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}
	
	
	
	//getters && setters
	
	
	
//question 1
//	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Personne ){
			Personne personne = (Personne) obj;
			if( this.nom.equals(personne.nom) && this.adresse.equals(personne.adresse) ){
				return true;
			}
		}
	return false;
	}
	
//	public  String toStirng(){
//		return "Nom : " + this.nom + "Adresse : " + this.adresse + "E-mail : " + this.email + "Tel : " + this.tel;
//	}
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getTel() {
		return tel;
	}



	public void setTel(int tel) {
		this.tel = tel;
	}



	public  abstract String toStirng();

	
	
	
}
