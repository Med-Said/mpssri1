package tp19;

public class Skieur extends Personne{
	protected boolean forfait;
	
	public Skieur(String nom, int age, boolean forfait){
		super(nom,age);
		this.forfait = forfait;
	}
	
	public String toString(){
		if(forfait){
			return super.toString() + " a un forfait";
		}else{
			return super.toString() + " n'a pas de forfait";
		}
		//3, on ne peut pas acceder a les attributs si ont declarer private sans passer par les getterurs
		//mais en changant le modificateur d'acces a protected on aura la possibite de le faire.
	}
}
