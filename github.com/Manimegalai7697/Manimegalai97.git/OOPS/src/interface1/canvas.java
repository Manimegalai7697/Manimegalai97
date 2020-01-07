package interface1;


public class canvas implements ipaint {
	protected String typeOfPaint;
	protected int canvasSize;


	public canvas(String typeOfPaint, int canvasSize) {
		super();
		this.typeOfPaint = typeOfPaint;
		this.canvasSize = canvasSize;
	}


	public String getTypeOfPaint() {
		return typeOfPaint;
	}


	public void setTypeOfPaint(String typeOfPaint) {
		this.typeOfPaint = typeOfPaint;
	}


	public int getCanvasSize() {
		return canvasSize;
	}


	public void setCanvasSize(int canvasSize) {
		this.canvasSize = canvasSize;
	}


	@Override
	public void paint() {
		// TODO Auto-generated method stub
		
	}


	
	

}
