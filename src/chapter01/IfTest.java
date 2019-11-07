package chapter01;

public class IfTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;

		// ==============
		int diff = 0;
		if (a > b) {
			// int diff이 아닌이유: 밖에꺼를 갖다 쓰겠다.
			diff = a - b;
		} else {
			diff = b - a;
		}
		
		System.out.println(diff);
	}

}
