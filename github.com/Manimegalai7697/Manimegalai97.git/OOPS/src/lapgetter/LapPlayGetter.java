package lapgetter;

public class LapPlayGetter {

	public LapPlayGetter(byte lapNo, byte throwsMade, String fastestPlayer, float fastestTime) {
		
		this.lapNo = lapNo;
		this.throwsMade = throwsMade;
		this.fastestPlayer = fastestPlayer;
		this.fastestTime = fastestTime;
		}
		public byte lapNo ;
		public byte throwsMade;
		public String fastestPlayer;
		public float fastestTime;
		public Byte getLapNo() {
		return lapNo;
		}
		public void setLapNo(byte lapNo) {
		this.lapNo = lapNo;
		}
		public Byte getThrowsMade() {
		return throwsMade;
		}
		public void setThrowsMade(byte throwsMade) {
		this.throwsMade = throwsMade;
		}
		public String getFastestPlayer() {
		return fastestPlayer;
		}
		public void setFastestPlayer(String fastestPlayer) {
		this.fastestPlayer = fastestPlayer;
		}
		public float getFastestTime() {
		return fastestTime;
		}
		public void setFastestTime(float fastestTime) {
		this.fastestTime = fastestTime;
		}
}
