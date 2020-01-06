package inheritance5;

public class LavaDino {
	public class Lavadino extends Dinosaur {
		protected boolean canbreathfire;
		protected boolean hasheatresistance;


		public Lavadino(String species, String consumptiontype, boolean canbreathfire, boolean hasheatresistance) {
		super(species, consumptiontype);
		this.canbreathfire = canbreathfire;
		this.hasheatresistance = hasheatresistance;
		}


		public boolean isCanbreathfire() {
		return canbreathfire;
		}


		public void setCanbreathfire(boolean canbreathfire) {
		this.canbreathfire = canbreathfire;
		}


		public boolean isHasheatresistance() {
		return hasheatresistance;
		}


		public void setHasheatresistance(boolean hasheatresistance) {
		this.hasheatresistance = hasheatresistance;
		}


		public void displaydinodetails()
		{
		System.out.println("Dino species details about LavaDino");
		if(canbreathfire==true)
		{
		System.out.println(species+" breath fire");
		}
		else {
		System.out.println(species+" can't breath fire");
		}
		if(hasheatresistance==true)
		{
		System.out.println("It is Resistent to heat ");
		}
		else {
		System.out.println("It is not Resistent to heat ");
		}
		}

}
}