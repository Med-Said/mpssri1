package tp19;

public class Main {
	public static void main(String[] args) {
		Personne p1 = new Personne("Med Ahmed",7);
		System.out.println(p1.toString());
		
		Skieur sk = new Skieur("Med Ahmed",7,true);
		
		System.out.println(sk.toString());
		
		Slalommeur slm = new Slalommeur("Med Ahmed",7,true);
		System.out.println(slm.toString());
	}
}
