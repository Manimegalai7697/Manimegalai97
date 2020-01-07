package interface1;

public class RegularCanvas extends canvas implements ipaint {

	

	public RegularCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		
		// TODO Auto-generated constructor stub
	}

	public void paint() {
		// TODO Auto-generated method stub
		if(typeOfPaint.equals("water"))
		{
			System.out.println("Can paint"+canvasSize);
		}
		else
		
		{
			System.out.println("Can't Paint");
		}
		
	}

}
