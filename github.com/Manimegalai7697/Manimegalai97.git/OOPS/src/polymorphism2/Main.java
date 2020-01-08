package polymorphism2;

import java.util.Scanner;



public class Main {

	private static Object totenergy;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter energy reserve:");
		float  energyReserve = s.nextFloat();
		System.out.println("Enter energy :");
		float energy =s.nextFloat();
		System.out.println("Enter remainingEnergy:");
		float remainingEnergy = s.nextFloat();
		System.out.println("Enter Jumpheight:");
		float jumpHeight = s.nextFloat();
		System.out.println("Enter DistanceStrolled:");
		int distanceStrolled = s.nextInt();
		System.out.println("Enter string:");
		String soundsMade=s.next();
		
		Machine mac = new Machine(energyReserve,energy,remainingEnergy);
		mac.addEnergy(energyReserve,energy);
		mac.runfan(remainingEnergy,totenergy);
		Cat cat=new Cat(jumpHeight,distanceStrolled,soundsMade);
		cat.generateEnergy();
	}
	



	

}

