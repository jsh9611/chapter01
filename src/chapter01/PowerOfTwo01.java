package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("숫자를 입력하시오 : ");
		  int power = scanner.nextInt(); // blocking
//		int power = 3;
		
		int result = 1;
		int i = 0;

		while(i<power) {
			result = result * 2;
			System.out.println(result);
			i++;
		}
		System.out.println("2의 " + power + "승은 " + result + "입니다.");
	}

}
