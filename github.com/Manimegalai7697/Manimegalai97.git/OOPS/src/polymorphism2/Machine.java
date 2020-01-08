package polymorphism2;

public class Machine {
	private float distanceStrolled;
	private float energy;
	private float remainingEnergy;
	private float totenergy;
	private String tremenergy;
	public float getTotenergy()
	{
		return totenergy;
	}

	

	public float getDistanceStrolled() {
		return distanceStrolled;
	}



	public void setDistanceStrolled(float distanceStrolled) {
		this.distanceStrolled = distanceStrolled;
	}



	public float getEnergy() {
		return energy;
	}



	public void setEnergy(float energy) {
		this.energy = energy;
	}



	public float getRemainingEnergy() {
		return remainingEnergy;
	}



	public void setRemainingEnergy(float remainingEnergy) {
		this.remainingEnergy = remainingEnergy;
	}



	public void setTotenergy(float totenergy) {
		this.totenergy = totenergy;
	}



	public Machine(float distanceStrolled, float energy, float remainingEnergy) {
		super();
		this.distanceStrolled = distanceStrolled;
		this.energy = energy;
		this.remainingEnergy = remainingEnergy;
		this.totenergy = totenergy;
	}

	public void addEnergy(float energyReserve, float energy) {
		// TODO Auto-generated method stub
		float totenergy = energyReserve+energy;
		System.out.println("TotalEnergy:"+totenergy);
		
	}

	public void runfan(float remainingEnergy, Object totenergy) {
		// TODO Auto-generated method stub
		//float tremenergy=totenergy-remainingEnergy;
		System.out.println("Runfan for remainingEnergy:"+tremenergy);
		
	}
	

}
