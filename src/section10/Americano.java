package section10;



public class Americano extends Espresso {
	
	public int water;
	
	public Americano(String bean, int water) {
		super(bean);
		this.brand = brand;
		this.water = water;
		
	}
	@Override
	public void printInfo() {
		
		super.printInfo();
		
		System.out.println("water: " + water);
	}
}
