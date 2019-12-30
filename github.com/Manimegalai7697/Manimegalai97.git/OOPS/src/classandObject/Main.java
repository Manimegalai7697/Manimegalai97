package classandObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		int num1 = Integer.parseInt(br.readLine()); 
		int num2 = Integer.parseInt(br.readLine());
		Addition add = new Addition(num1,num2);
		Addition add1 = new Addition();
		
		

	}

}
