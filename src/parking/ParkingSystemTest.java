package parking;

public class ParkingSystemTest {

	public static void main(String[] args) {
		ParkingSystem ps = new ParkingSystem();

//		Bus b = new Bus();
//		ps.park(b);

		ps.park(new Bus());
		ps.park(new SportsCar()); // 버스 타입으로 해놓았으니 안되는 것.
		ps.park(new Truck());
		ps.park(new Poclain());
		ps.park(new ToyCar()); // 이게 객체지향이다. 이게 재사용
		ps.park(new Airplain());
	}

}
