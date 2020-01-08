package polymorphism2;

public class Cat {
	private float jumpHeight;
	private int distanceStrolled;
	private String soundMade;
	private String tothair;
	
	

	

	public Cat(float jumpHeight, int distanceStrolled, String soundMade) {
		super();
		this.jumpHeight = jumpHeight;
		this.distanceStrolled = distanceStrolled;
		this.soundMade = soundMade;
	}
	

	public float getJumpHeight() {
		return jumpHeight;
	}


	public void setJumpHeight(float jumpHeight) {
		this.jumpHeight = jumpHeight;
	}


	public int getDistanceStrolled() {
		return distanceStrolled;
	}


	public void setDistanceStrolled(int distanceStrolled) {
		this.distanceStrolled = distanceStrolled;
	}


	public String getSoundMade() {
		return soundMade;
	}


	public void setSoundMade(String soundMade) {
		this.soundMade = soundMade;
	}


	public void generateEnergy() {
		// TODO Auto-generated method stub
		
		if(jumpHeight>=10.75)
		{
			float tot =(float)(jumpHeight/10.75);
			tot =(float)(jumpHeight+(tot*7.2));
			System.out.println(tot+"joules for every 10.75m jouls");
		}
		if(distanceStrolled>=172)
		{
			float tot =(float)(distanceStrolled/9.83);
			tot =(float)(distanceStrolled+(tot*12.35));
			System.out.println("distanceStrolled for"+tothair+ "jouls");
			
		}
		else
		{
			System.out.println("distanceStrolled"+distanceStrolled);
		}
		String a[]=soundMade.split(" ");
		int count=0;
		for(int i = 0;i<a.length;i++)
		{
			if("meow".equals(a[i]))
			{
				count++;
				
				
			}
			if(count>27)
			{
				float tot=count/5;
				System.out.println(tot*15+"joules for every 5 'meows'");
			}
			else
			{
				System.out.println("There is no word 'meow'");
			}
		}
		
		
	}

}
