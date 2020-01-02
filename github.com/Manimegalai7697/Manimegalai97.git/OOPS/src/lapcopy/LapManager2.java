package lapcopy;

public class LapManager2 {
	public void displayAllLaps(LapPlaygetset[] l)    
	{
	System.out.println("Lap number\tMaxmimum throws\tPlayer Name\tTiming\n");
	for(LapPlaygetset m:l)
	{
	System.out.println(String.format("%-10s\t%-10s\t%-20s\t%-20s",m.lapNo,m.throwsMade,m.fastestPlayer,m.fastestTime));

	}
	
	}
	public void  displayFastestInLap(LapPlaygetset[] lapList,byte lapNo)

	{
	float max=1000;
	String fperson="";

	for(LapPlaygetset m:lapList)
	{
	  if((lapNo==m.lapNo)&&(max>m.fastestTime))
	  {
	  max=m.fastestTime;
	  fperson=m.fastestPlayer;
	  }
	 }
	System.out.println("\nFastest Player :"+fperson+"\nFastest time :"+max+"\n\n");

	}

	                                             
	    public void displayMaximumThrows(LapPlaygetset[] laplist)
	    {
	    byte max=0;

	for(LapPlaygetset m:laplist)
	{
	  if((max<m.throwsMade))
	  {
	  max=m.throwsMade;
	  }
	}
	System.out.println("Max throws :"+max);

	} 

}
