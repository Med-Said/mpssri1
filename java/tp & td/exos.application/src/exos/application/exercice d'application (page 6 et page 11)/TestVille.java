package exos.application;

//Suite de l'exercice d'application 2 (page 11)

public class TestVille {

	public static void main(String[] args) {
		
		Ville v1 = new Ville("Bombry",700);
		Ville v2 = new Ville("Riyade",3000);
		Ville v3 = new Ville ("Bengerdane",4000);
		
		Pays p1 = new Pays(3);
		
		p1.ajouterVille(v1);
		p1.ajouterVille(v2);
		p1.ajouterVille(v3);
		
		//affichage
		
		System.out.println("Nom Ville : " + p1.TV[2].getNomVille() + "\nNombre d'habitans : " + p1.TV[2].getNbrHabitans());
	}

}
