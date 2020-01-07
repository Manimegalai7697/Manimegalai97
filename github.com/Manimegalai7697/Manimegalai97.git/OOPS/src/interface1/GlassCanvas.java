package interface1;

public class GlassCanvas extends canvas implements ipaint {
	
	public GlassCanvas(String typeOfPaint,int canvasSize) {
		super(typeOfPaint,canvasSize);
	}
	public void paint()
	{
		if(typeOfPaint.equals("Glass"))
		{
			System.out.println("Can Paint"+canvasSize);
		}
		else
		{
			System.out.println("Can't Paint");
		}
	}

}
