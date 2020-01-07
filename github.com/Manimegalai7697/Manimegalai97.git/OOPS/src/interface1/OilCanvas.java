package interface1;

public class OilCanvas extends canvas implements ipaint {

	public OilCanvas(String typeOfPaint, int canvasSize) {
		// TODO Auto-generated constructor stub
		super(typeOfPaint,canvasSize );
	}

	public void paint() {
		// TODO Auto-generated method stub
		if(typeOfPaint.equals("oil"))
		{
			System.out.println("Can Paint"+canvasSize);
		}
		else
		{
			System.out.println("Can't Paint");
		}
		
	}

}
