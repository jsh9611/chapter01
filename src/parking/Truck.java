package parking;

public class Truck implements Parkable{
	@Override
	public void park() {
		System.out.println("Truck: 주차됨");
	}
}
