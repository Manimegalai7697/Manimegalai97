package play;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
				
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		String str1,str2;
		 str1 = br.readLine();
		 str2 = br.readLine();
		 Player p= new Player(str1,str2);

	}

}
