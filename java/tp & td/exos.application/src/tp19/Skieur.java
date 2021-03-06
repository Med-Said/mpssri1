package tp19;

//2
public class Skieur extends Personne{
	protected boolean forfait;
//	erreure : l'IDE n'a pas accepte la structure
	
	public Skieur(String nom, int age, boolean forfait){
		super(nom,age);
		//si nous commentons "super(nom,age)" : l'IDE demande la definition du constructeur de la classe personne
		this.forfait = forfait;
	}
	
	public boolean getForfait(){
		return this.forfait;
	}
//	
	public String toString(){
		if(forfait){
			return super.toString() + " a un forfait" ;
		}else{
			return super.toString() + " n'a pas un forfait";

		}
		//3, on ne peut pas acceder a les attributs si ont declare private sans passer par les getterurs
		//mais en changant le modificateur d'acces a protected nous aurons la possibite d'acces au attributs.
	}
}
