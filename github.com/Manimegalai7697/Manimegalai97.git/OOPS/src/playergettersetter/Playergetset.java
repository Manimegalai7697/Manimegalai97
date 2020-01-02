package playergettersetter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Playergetset {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String str1=br.readLine();
		String str2=br.readLine();
		Team t=new Team(str1,str2);
		System.out.println(t.getTeamName());
		System.out.println(t.getCityRepresented());
		


	}

}
