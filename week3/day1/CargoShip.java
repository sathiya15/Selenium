package week3.day1;

public class CargoShip extends  Ship {

	public void cargoCapacityinTons(int capacity) {
		System.out.println("cargoCapacityinTons: " +capacity);

	}
	public static void main(String[] args) {
		CargoShip cargo = new CargoShip();
		cargo.cargoCapacityinTons(1000);
		cargo.shipbuiltYear("2000");
		cargo.shipName("Naval Ship");
		
	}
}
