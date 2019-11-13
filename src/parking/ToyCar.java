package parking;

public class ToyCar implements Parkable{
	@Override
	public void park() {
		System.out.println("ToyCar: 주차됨");
	}
}
