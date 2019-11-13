package parking;

public class Bus implements Parkable{
	@Override
	public void park() {
		System.out.println("Bus: 주차됨");
	}
}
