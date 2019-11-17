package chapter01;

public class CarTest {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();
		
		
		// 자식 객체는 부모 타입으로 참조할 수 있다.
		// 객체지향 확장을 이해하기 위해서는 이것이 자연스러워야 한다.
		Car c = new Bus();
		c.run();
		
		// 오류
		// Bus b new Car();  // 자식 객체에서 부모 객체로 참조하는 것만 가능하다. 반대의 상황은 에러.
		// c.run();          // 버스는 자동차이다.o 자동차는 버스이다.x 
		Bus bus2 = new Bus();
		bus2.run();
		bus2.info();
		
		Car c2 = new Bus();
		c2.run();
		((Bus)c2).info();
		
	}

}