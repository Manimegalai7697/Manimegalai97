package polymorphism3;

public class BusTicketBooking {
	private int noofp1;
	private  int price1;
	private boolean issleeper1;
	private boolean isac1;
	private boolean wifi1;
	private int nfchild1;
	
	public BusTicketBooking(int noofp1, int price1, boolean issleeper1, boolean isac1, boolean wifi1,
			int nfchild1) {
		super();
		this.noofp1 = noofp1;
		this.price1 = price1;
		this.issleeper1 = issleeper1;
		this.isac1 = isac1;
		this.wifi1 = wifi1;
		this.nfchild1 = nfchild1;
	}


	public int getNoofp1() {
		return noofp1;
	}


	public void setNoofp1(int noofp1) {
		this.noofp1 = noofp1;
	}


	public int getPrice1() {
		return price1;
	}


	public void setPrice1(int price1) {
		this.price1 = price1;
	}


	public boolean isIssleeper1() {
		return issleeper1;
	}


	public void setIssleeper1(boolean issleeper1) {
		this.issleeper1 = issleeper1;
	}


	public boolean isIsac1() {
		return isac1;
	}


	public void setIsac1(boolean isac1) {
		this.isac1 = isac1;
	}


	public boolean isWifi1() {
		return wifi1;
	}


	public void setWifi1(boolean wifi1) {
		this.wifi1 = wifi1;
	}


	public int isNfchild1() {
		return nfchild1;
	}


	public void setNfchild1(int nfchild1) {
		this.nfchild1 = nfchild1;
	}


	public void bookTicket(int noofp1, int price1) {
		// TODO Auto-generated method stub
		int totamt=noofp1*price1;
		System.out.println("Total amount: passenger and price"+totamt);
	}


	public void bookTicket(int noofp1, int price1, boolean issleeper1, boolean isac1) {
		// TODO Auto-generated method stub
		int tots = 0;
		int totamt=noofp1*price1;
		if(issleeper1==true)
		{
			tots=totamt+250;
		}
		if(isac1==true)
		{
			tots=totamt+350;
		}
		System.out.println("Total amount: passenger and price and ac or sleeper  "+tots);
	}
	public void bookTicket(int noofp1, int price1, boolean issleeper1, boolean isac1,boolean wifi1,int nfchild1)
	{
		
		int tots = 0;
		int totamt=noofp1*price1;
		if(issleeper1==true)
		{
			tots=totamt+250;
		}
		if(isac1==true)
		{
			tots=totamt+350;
		}
		if(wifi1==true)
		{
			tots=totamt+250;
		}
		System.out.println("Total amount: passenger and price and ac or sleeper or wifi "+tots);
	}
	
	

}
