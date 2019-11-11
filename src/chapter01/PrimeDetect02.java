package chapter01;

import java.util.*; // Scanner 클래스를 사용하기 위함

public class PrimeDetect02 {

	public static void main(String[] args) {
		int j = 1;
		while( j <= 500000 ) {
			int num = j;
			boolean result = isPrime(num);
			if(result == true) {
				System.out.println(num);
			}
			j++;
		}		
	}
	
	
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
}
