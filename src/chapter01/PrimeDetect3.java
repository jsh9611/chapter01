package chapter01;

import java.util.*; // Scanner 클래스를 사용하기 위함

public class PrimeDetect3 {
	public static boolean isPrime(int x) {
		int i = 2;
		boolean isPrime = true;
		while (i < x) {
			int result = x % i;
			if (result == 0) {
				isPrime = false;
				break;
			}
			i++;

		}
		return isPrime;
	}
	public static void main(String[] args) {

		int j = 1;	
		while (j <= 1000) {
			
			int num = j;
			
			int i = 2;
			boolean isPrime = true;
			while(i<num) {
				int result = num%i;
				if (result==0) {
					isPrime = false;
				break;	
				}
				i++;
			}
			
			j++;
			
			if(isPrime) {
				System.out.println(num);
			}
		}
		
		
//	Scanner closeScanner

	}
	
	
}


/*
 * while(i<num) { int result = num % 1; if(result==0) { isPrime = false; break;
 * } i++ }
 */