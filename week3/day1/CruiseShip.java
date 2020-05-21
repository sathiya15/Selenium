package week3.day1;



public class CruiseShip extends Ship {
	
	public void maximumPassengers(int max) {
		System.out.println("Cruiseship maximum Passengers are: "+max);
	
	}

	public void cruiseCategory(String category) {
		System.out.println("Cruiseship  category is: "+category);
		

	}
	public static void main(String[] args) {
		CruiseShip cs = new CruiseShip();
		
		cs.shipbuiltYear("2000");
		cs.cruiseCategory("premium");
		cs.maximumPassengers(1000);
		cs.shipName("Naval Ship");
		
		
		
	}
}
