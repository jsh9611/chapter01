package parking;

public class ParkingSystem {
	
//	void park(Bus bus) {
//		bus.park();
//		
//	}
//	void park(SportsCar sportsCar) {   // 이렇게 추가하려면 코드를 수정을 해야함.
//		sportsCar.park();
//  void park(Car car) {   // 이렇게 추가하려면 코드를 수정을 해야함.
//	    car.park();
//	
//		
//	}
	
	
	void park(Parkable parkable) {
		parkable.park();
	}
	
}
