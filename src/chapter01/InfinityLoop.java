package chapter01;

public class InfinityLoop {

	public static void main(String[] args) {
		//무한루프는 while로 보통
		
		
//		/*
//		 * int i = 0; int sum = 0; while( true ) { sum += i; if(sum >= 5000) { break; }
//		 * i++; } System.out.println(sum);
//		 */		
	
		
		int i = 0;
		int sum = 0;
		for (;;) {
			sum += i;
			if(sum >= 5000) {
				break;
			}
			i++;
		}
		System.out.println(sum);
	
	}

	
	
}
