package lapgetset;

public class Lap {
	private byte lapno1,throwsMade1;
	private String fastestPlayer1;
	private float fastestTime1;
	
	public Lap(byte lapno1, byte throwsMade1, String fastestPlayer1, float fastestTime1) {
		super();
		this.lapno1 = lapno1;
		this.throwsMade1 = throwsMade1;
		this.fastestPlayer1 = fastestPlayer1;
		this.fastestTime1 = fastestTime1;
	}
	public Lap() {
		// TODO Auto-generated constructor stub
	}
	public byte getLapno1() {
		return lapno1;
	}
	public void setLapno1(byte lapno1) {
		this.lapno1 = lapno1;
	}
	public byte getThrowsMade1() {
		return throwsMade1;
	}
	public void setThrowsMade1(byte throwsMade1) {
		this.throwsMade1 = throwsMade1;
	}
	public String getFastestPlayer1() {
		return fastestPlayer1;
	}
	public void setFastestPlayer1(String fastestPlayer1) {
		this.fastestPlayer1 = fastestPlayer1;
	}
	public float getFastestTime1() {
		return fastestTime1;
	}
	public void setFastestTime1(float fastestTime1) {
		this.fastestTime1 = fastestTime1;
	}
	
	


}
