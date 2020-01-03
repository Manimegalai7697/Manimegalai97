package com.inheritance;


import java.util.Scanner;

public class Dinosaur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String species;
		String locomotionType;
		boolean hasHeatResistance;
		Scanner s=new Scanner(System.in);
		species=s.nextLine();
		locomotionType=s.nextLine();
		hasHeatResistance  =s.nextBoolean();
		LavaDino l=new LavaDino(species,locomotionType,hasHeatResistance);
		      l.display(species,locomotionType,hasHeatResistance);
		
		 l.display(species,locomotionType,hasHeatResistance);
		
		
		
		

	}

}
