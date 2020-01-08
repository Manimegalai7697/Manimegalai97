package polymorphism3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the passenger name: ");
		String passengerName=sc.next();
		System.out.println("Enter the passenger Email-ID: ");
		String emailID=sc.next();
		System.out.println("Enter the passenger mobile no.: ");
		int mobileNo=sc.nextInt();
		System.out.println("Enter the passenger travel date: ");
		String dateOfTravel=sc.next();
		System.out.println("Enter the no of passenger: ");
		int noofp=sc.nextInt();
		System.out.println("Enter the price: ");
		int price=sc.nextInt();
		System.out.println("Is Sleeper: ");
		boolean issleeper=sc.nextBoolean();
		System.out.println("Is AC: ");
		boolean isac=sc.nextBoolean();
		System.out.println("Is WiFi: ");
		boolean wifi=sc.nextBoolean();
		System.out.println("Enter no of children: ");
		int nfchild=sc.nextInt();
		BusTicketBooking btb=new BusTicketBooking(noofp, price,issleeper,isac,wifi,nfchild);
		btb.bookTicket(noofp,price);
		btb.bookTicket(noofp, price,issleeper,isac);
		btb.bookTicket(noofp, price,issleeper,isac,wifi,nfchild);

	}

}
