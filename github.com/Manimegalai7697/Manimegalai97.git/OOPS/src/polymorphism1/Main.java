package polymorphism1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
	
		int CoalPrice=s.nextInt();
		float hairStrand=s.nextFloat();
		
		
		Machine m = new Machine();
		System.out.println(m.produceShoePolish(CoalPrice)+"ml");
		System.out.println(m.produceShoePolish(hairStrand)+"ml");
		
		
		
		
		
		

	}

}
