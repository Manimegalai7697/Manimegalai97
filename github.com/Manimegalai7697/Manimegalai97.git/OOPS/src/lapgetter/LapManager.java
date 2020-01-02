package lapgetter;

public class LapManager {
	public void displayAllLaps(LapPlayGetter[] lapList)    
	{
	System.out.println("Lap number\tMaxmimum throws\tPlayer Name\tTiming\n");
	for(LapPlayGetter m:lapList)
	{
	System.out.println(String.format("%-10s\t%-10s\t%-20s\t%-20s",m.lapNo,m.throwsMade,m.fastestPlayer,m.fastestTime));

	}
	}

}
	


