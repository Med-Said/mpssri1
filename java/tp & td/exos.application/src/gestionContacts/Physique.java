package gestionContacts;

public class Physique extends Personne{
	private String fonction;
	
	public Physique(String nom, String adresse, String email, int tel, String fonction) {
		super(nom, adresse, email, tel);
		this.fonction = fonction;
	}

	@Override
	public String toStirng() {
		return "Nom : " + this.getNom() + "Adresse : " + this.getAdresse() + "E-mail : " + this.getEmail() + "Tel : " + this.getTel()
				+ "Fonction : " + this.fonction;
	}
}
