package gestionContacts;

public class Morale extends Personne{
	private String activite;
	private String nature;

	public Morale(String nom, String adresse, String email, int tel, String activite, String nature) {
		super(nom, adresse, email, tel);
		this.activite = activite;
		this.nature = nature;
	}

	@Override
	public String toStirng() {
		return "Nom : " + this.getNom() + "Adresse : " + this.getAdresse() + "E-mail : " + this.getEmail() + "Tel : " + this.getTel()
				+ "Activite : " + this.activite + "Nature ; " + this.nature;
	}
	
}
