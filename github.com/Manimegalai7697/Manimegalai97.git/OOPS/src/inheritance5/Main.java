package inheritance5;

import java.util.Scanner;

import com.inheritance.LavaDino;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Dinosaur 2.LavaDino \n 3.Dragon Dinosaur \n 4.Shark Dianosaur \n 5.Lizard Dino"
				+ "\n 6.Dragondinov2");
		System.out.println("Enter type: ");
		int n = sc.nextInt();
		System.out.println("Enter species:");
		String species=sc.next();
		System.out.println("Enter Consumption:");
		String consumptiontype=sc.next();
		switch(n)
		{
		case 1:

		Dinosaur dino=new Dinosaur(species,consumptiontype);
		dino.displaydinodetails();
		break;
		case 2:
		System.out.println("Is breath fire: ");
		boolean canbreathfire=sc.nextBoolean();
		System.out.println("Has heat Resistence: ");
		boolean hasheatresistance=sc.nextBoolean();
		LavaDino ld=new LavaDino(species,consumptiontype,canbreathfire,hasheatresistance);
		ld.displaydinodetails();
		break;
		case 3:
		System.out.println("Breathes fire?(y/n):");
		boolean canbreathfire1=sc.nextBoolean();
		System.out.println("Is heat Resistence?(y/n):");
		boolean hasheatresistance1=sc.nextBoolean();
		System.out.println("Enter no of wings:");
		int noofwings=sc.nextInt();
		System.out.println("Enter no of Scales:");
		int noofscales=sc.nextInt();
		System.out.println("Can fly:");
		boolean canfly=sc.hasNextBoolean();
		DragonDino dd=new DragonDino(species,consumptiontype,canbreathfire1,hasheatresistance1,noofwings,noofscales,canfly);
		dd.displaydinodetails();
		break;
		case 4:
		System.out.println("Breathes fire?(y/n):");
		boolean canbreathfire2=sc.nextBoolean();
		System.out.println("Is heat Resistence?(y/n):");
		boolean hasheatresistance2=sc.nextBoolean();
		System.out.println("Enter no of wings:");
		int noofwings2=sc.nextInt();
		System.out.println("Enter no of Scales:");
		int noofscales2=sc.nextInt();
		System.out.println("Can fly:");
		boolean canfly2=sc.nextBoolean();
		System.out.println("Enter no of Fins:");
		int nooffins=sc.nextInt();
		System.out.println("Enter no of gills:");
		int noofgills=sc.nextInt();
		System.out.println("Can Swim:");
		boolean canswim=sc.nextBoolean();
		SharkDino sd=new SharkDino(species,consumptiontype,canbreathfire2,hasheatresistance2,noofwings2,noofscales2,canswim);
		sd.displaydinodetails();
		break;
		case 5:

		System.out.println("Is breath fire: ");
		boolean canbreathfire3=sc.nextBoolean();
		System.out.println("Has heat Resistence: ");
		boolean hasheatresistance3=sc.nextBoolean();
		System.out.println("Enter no of claws:");
		int noofclaw=sc.nextInt();
		System.out.println("Enter no of legs:");
		int nooflegs=sc.nextInt();
		System.out.println("Can Run:");
		boolean canrun=sc.nextBoolean();
		LizardDino lzd=new LizardDino(species,consumptiontype,canbreathfire3,hasheatresistance3,noofclaw,nooflegs,canrun);
		lzd.displaydinodetails();
		break;
		case 6:
		System.out.println("Breathes fire:");
		boolean canbreathfire4=sc.nextBoolean();

		System.out.println("Enter no of wings:");
		int noofwings4=sc.nextInt();
		System.out.println("Is heat Resistence:");
		boolean hasheatresistance4=sc.nextBoolean();
		System.out.println("Enter no of Scales:");
		int noofscales4=sc.nextInt();
		System.out.println("Can fly:");
		boolean canfly4=sc.nextBoolean();
		System.out.println("Enter the ability name:");
		String abilityname=sc.next();
		System.out.println("Enter ability Description:");
		String abilitydescription=sc.next();
		DragonDinov2 dd2=new DragonDinov2(species,consumptiontype,canbreathfire4,hasheatresistance4,noofwings4,noofscales4,canfly4,
		abilityname,abilitydescription);
		dd2.displaydinoability();
		break;

		}


		}

		
		

	}

