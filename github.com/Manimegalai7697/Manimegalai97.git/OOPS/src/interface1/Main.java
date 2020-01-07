package interface1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner m = new Scanner(System.in);
		System.out.println("Enter Type of paint");
		String TypeOfPaint=m.next();
		System.out.println("Enter Canvas size");
		int CanvasSize=m.nextInt();
		System.out.println("Enter the choice");
		System.out.println("1.Water Canvas \n 2.Glass Canvas \n 3.Oil Canvas");
		int n=m.nextInt();
		//ipaint c=new ipaint(TypeOfPaint,CanvasSize);
		//c.paint();
		switch(n)
		{
		case 1:
			RegularCanvas rc= new RegularCanvas(TypeOfPaint,CanvasSize);
			rc.paint();
			break;
		case 2:
			GlassCanvas gc = new GlassCanvas(TypeOfPaint,CanvasSize);
			gc.paint();
			break;
		case 3:
			OilCanvas oc = new OilCanvas(TypeOfPaint,CanvasSize);
			oc.paint();
			break;
			
		}
		
		
		
	}

}
