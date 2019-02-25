package tp19;

public class Slalommeur extends Skieur{
	private double temps;
	
	public Slalommeur(String nom,int age,boolean forfait){
		super(nom,age,forfait);
		if(forfait)
			this.temps = 0;
		else
			System.out.println(super.nom + " " + " se procurer un forfait avant le début de l'épreuve");
	}

	public double getTemps() {
		return temps;
	}

	public void setTemps(double temps) {
		if(forfait)
			this.temps = temps;
		else
			this.temps = 0;
	}
	
	public String toString(){
		if(forfait)
			return super.toString() + " : " + temps + " secondes";
		else
			return super.nom + " ne peut pas participer sans forfait !";
	}
}