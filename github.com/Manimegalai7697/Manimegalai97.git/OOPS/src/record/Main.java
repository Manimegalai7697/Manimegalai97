package record;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		byte matchesPlayed=Byte.parseByte(br.readLine());
		byte numOfWins=Byte.parseByte(br.readLine());
		byte numOfLosses=Byte.parseByte(br.readLine());
		float avgLapSpeed=Float.parseFloat(br.readLine());
		float maxLapSpeed=Float.parseFloat(br.readLine());
		float avgThrowDistance=Float.parseFloat(br.readLine());
		float maxThrowDistance=Float.parseFloat(br.readLine());
		Max plr=new Max(matchesPlayed,numOfWins,numOfLosses,avgLapSpeed,maxLapSpeed,avgThrowDistance,maxThrowDistance);
		plr.display();	

		
		

	}

}
