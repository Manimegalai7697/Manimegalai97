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

}
