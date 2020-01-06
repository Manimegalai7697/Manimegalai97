package inheritance5;


	public class DragonDinov2 extends DragonDino {
		protected String abilityname;
		protected String abilitydescription;

		public DragonDinov2(String species, String consumptiontype, boolean canbreathfire, boolean hasheatresistance,
		int noofwings, int noofscales, boolean canfly, String abilityname, String abilitydescription) {
		super(species, consumptiontype, canbreathfire, hasheatresistance, noofwings, noofscales, canfly);
		this.abilityname = abilityname;
		this.abilitydescription = abilitydescription;
		}

		public void displaydinoability()
		{
		System.out.println("Ability Name:"+abilityname);
		System.out.println("Ability Description:"+abilitydescription);
		}
		


}

