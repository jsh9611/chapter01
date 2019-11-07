package chapter01;

import java.util.Scanner;

public class SumInput01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // blocking
		int sum = 0;
		
		int a = 1;
		while (a<=number) {
			System.out.println(a);
			a++;
			sum = sum + a;
		}
		
		
		
		System.out.println(number + "까지의 합은 " + sum + "입니다.");

	}

}
