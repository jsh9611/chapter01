package chapter01;

import java.util.Scanner; // crtl + shift + o

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // blocking 암것도 안했을경우 (입%력값은 녹색)

		int result = number % 3;

		if (result == 0) {
			System.out.println("입력하신 " + number + "은(는) 3의 배수 입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}

}