package chapter01;

import java.util.*; // Scanner 클래스를 사용하기 위함

public class PrimeDetect01 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;

//	while    소수가 아닌거만 찾으면 된다.
//		ㆍㆍㆍ  
		int n = 2;
		if (num != 1) {

			while (n < num) {
				if (num % n == 0) {
					isPrime = false;
					break;
				}
				System.out.println(n);
				n++;
			}
		} else {
			isPrime = false;
		}

		if (isPrime == true) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");

		}
//	Scanner closeScanner

	}
}


/*
 * while(i<num) { int result = num % 1; if(result==0) { isPrime = false; break;
 * } i++ }
 */