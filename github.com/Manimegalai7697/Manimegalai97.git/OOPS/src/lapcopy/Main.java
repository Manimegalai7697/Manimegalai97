package lapcopy;

import java.io.IOException;
import java.util.Scanner;





public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		LapManager2 manager = new LapManager2();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		byte lapNo ;
		byte throwsMade;
		String fastestPlayer;
		float fastestTime;
		LapPlaygetset l[] = new LapPlaygetset[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter Lap Number");
		lapNo=sc.nextByte();
		System.out.println("Enter Maximum throws");
		throwsMade=sc.nextByte();
		System.out.println("Enter Player name");
		fastestPlayer=sc.next();
		System.out.println("Enter  Best time");
		fastestTime=sc.nextFloat();
		l[i]=new LapPlaygetset(lapNo,throwsMade,fastestPlayer,fastestTime);

		}
		manager.displayAllLaps(l);
		
		manager.displayFastestInLap(l,(byte)103);
		manager.displayMaximumThrows(l);

		}


	}


