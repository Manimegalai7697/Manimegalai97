package hotelInheritance;

public class DeluxRoom extends HotelRoom{
	
	private int noOfSqClaw;
	private int ratePerSqClaw;
	private boolean hasWifi;

	

	public DeluxRoom(String name, int noOfSqClaw, int ratePerSqClaw, boolean hasWifi) {
		super(name);
		this.noOfSqClaw = noOfSqClaw;
		this.ratePerSqClaw = ratePerSqClaw;
		this.hasWifi = hasWifi;
	}

	
	

	




	public int getNoOfSqClaw() {
		return noOfSqClaw;
	} 

	public void setNoOfSqClaw(int noOfSqClaw) {
		this.noOfSqClaw = noOfSqClaw;
	}

	public int getRatePerSqClaw() {
		return ratePerSqClaw;
	}

	public void setRatePerSqClaw(int ratePerSqClaw) {
		this.ratePerSqClaw = ratePerSqClaw;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	

	public void calculateTariff() {
		// TODO Auto-generated method stub
		
		System.out.println("Hotel pteradise");
		boolean a=true;
		if(Boolean.compare(hasWifi,a)==0)
		{
		int tot=ratePerSqClaw+10;
		System.out.println("Amount:"+tot);
		//System.out.println("Amount:"+ratePerSqClaw);
		}
		else if(Boolean.compare(hasWifi,a)==1)
		{
		System.out.println("Amount:"+ratePerSqClaw);
		}
		
		
	}

}
