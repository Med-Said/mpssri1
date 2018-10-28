package partie2;

import java.util.Scanner;

public class TestFact {
	public static void main(String[] args) {
		
		Scanner printf = new Scanner(System.in);
		
		System.out.println("n : ");
		int n = printf.nextInt();
		
		System.out.println(fact(n));
		
	}
	
	public static int fact(int n){
		if(n ==0 || n ==1){
			return 1;
		}	
		else {
			return   n*(fact(n-1)) ;
		}
	}
}
