package record;

public class Max {
	private byte matchesPlayed1;
	private byte numOfWins1;
	private byte numOfLosses1;
	private float avgLapSpeed1;
	private float maxLapSpeed1;
	private float avgThrowDistance1;
	private float maxThrowDistance1;

	public Max(byte matchesPlayed1, byte numOfWins1, byte numOfLosses1, float avgLapSpeed1, float maxLapSpeed1,
			float avgThrowDistance1, float maxThrowDistance1) {
		super();
		this.matchesPlayed1 = matchesPlayed1;
		this.numOfWins1 = numOfWins1;
		this.numOfLosses1 = numOfLosses1;
		this.avgLapSpeed1 = avgLapSpeed1;
		this.maxLapSpeed1 = maxLapSpeed1;
		this.avgThrowDistance1 = avgThrowDistance1;
		this.maxThrowDistance1 = maxThrowDistance1;
	}

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("No of matchesPlayed"+matchesPlayed1);
		System.out.println("No of Wins"+ numOfWins1);
		System.out.println("No of Losses"+numOfLosses1);
		System.out.println("Average speed"+avgLapSpeed1);
		System.out.println("Maxmimm speed"+maxLapSpeed1);
		System.out.println("Average Distance"+avgThrowDistance1);
		System.out.println("Maximum Distance"+maxThrowDistance1);
		

		
	}

	

}
