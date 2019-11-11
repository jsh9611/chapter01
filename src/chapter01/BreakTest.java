package chapter01;

public class BreakTest {

	public static void main(String[] args) {
		// 0에서 부터 계속 더해가는데, 합이 5000 이상이 될때까지 계속 더하는 프로그램
		/*
		 * int i = 0; int sum = 0;
		 * 
		 * while( sum <= 5000 ) { sum += i; i++; } System.out.println(sum);
		 */
		
		/*
		 * int sum = 0; for(int i = 0; sum < 5000; i++) { sum += i; }
		 * 
		 * System.out.println(sum);
		 */
		
		
		int i = 0;
		int sum = 0;
		while( true ) {
			sum += i;
			if(sum >= 5000) {
				break;
			}
			i++;
		}
		System.out.println(sum);
		
		
		// system.out.println("1111");
		//}
		

	}

}
