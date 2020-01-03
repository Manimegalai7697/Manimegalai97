package abstraction;

	public class Cubical extends Planet {
		private float side;
		public Cubical(String planetName,float side) {
		super(planetName);
		this.side = side;
		}

		public float getSide() {
		return side;
		}

		public void setSide(float side) {
		this.side = side;
		}

		public void display() {
		float area = this.getSide()*this.getSide()*this.getSide();
		System.out.printf("%ekm3", area);
		}


}
