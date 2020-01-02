package lapgetset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		byte lapno=Byte.parseByte(br.readLine());
		byte throwsMade=Byte.parseByte(br.readLine());
		String fastestPlayer=br.readLine();
		float fastestTime=Float.parseFloat(br.readLine());
		Lap lp=new Lap(lapno,throwsMade,fastestPlayer,fastestTime);
		Lap lp1=new Lap();
		System.out.println("Lapno "+lp.getLapno1());
		System.out.println("Throws made "+lp.getThrowsMade1());
		System.out.println("Fastest Player "+lp.getFastestPlayer1());
		System.out.println("Fastest time "+lp.getFastestTime1());
		
		
		
	}

		

	}


