package com.inheritance;

public class Lava {
	protected String species;
	private String locomotionType;

	
	
	public Lava(String species,String locomotionType ) {
		super();
		
		this.species=species;
		this.locomotionType=locomotionType;
	}

	

	public String getSpecies() {
		return species;
	}



	public void setSpecies(String species) {
		this.species = species;
	}



	public String getLocomotionType() {
		return locomotionType;
	}



	public void setLocomotionType(String locomotionType) {
		this.locomotionType = locomotionType;
	}



	public void display(String species,String locomotionType,boolean hasHeatResistance) {
		// TODO Auto-generated method stub
		
		System.out.println("Species" + this.species);
		System.out.println("LocomotionType" + this.locomotionType);
		
		
	}

}
