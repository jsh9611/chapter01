package chapter01;

import java.util.Scanner; // crtl + Shift + O

public class NHelloWorld2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // blocking
		
//		int i = 0;
//		while(i<number ) {
//			System.out.println(i);
//			i++;
//		}
		for(int i =0; i < number; i++) {
			System.out.println("Hello world");
		}
		
		
		System.out.println(number);
		
		scanner.close();

	}

}
