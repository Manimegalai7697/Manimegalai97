package polymorphism1;

public class Machine {
	public int produceShoePolish (int coalPrice)
	{
		int i = 0;
		if(coalPrice==5)
		{
			i=100;
		}
		else if(coalPrice>5)
		{
			i=(coalPrice/5)*100;
			
		}
		else if(coalPrice<5)
		{
			i=0;
			System.out.println("Not Efficient");
		}
		return i;
		
	}
	public float produceShoePolish(float hairStrand)
	{
		float k=0;
		if(hairStrand==(float)9.83)
		{
			k=100;
		
	}
		else if(hairStrand>9.83)
		{
			k=(float)((hairStrand/9.83)*100);
		}
		else if(hairStrand<9.83)
		{
			k=0;
			System.out.println("Not Efficient");
		}
		return k;

}
}

