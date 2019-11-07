package chapter01;

public class Arith {

	public static void main(String[] args) {
		/**
		 * 산술연산다(이항연산자)
		 */
		int a = 3;
		int b = 7;

		int r1 = a + b;
		System.out.println(r1);

		int r2 = a - b;
		System.out.println(r2);

		int r3 = a * b;
		System.out.println(r3);

		int r4 = a / b;
		System.out.println(r4);

		int r5 = a % b;
		System.out.println(r5);

		// int op(연산자 operator) int => int
		System.out.println(10 / 3);

		// int op double => double
		System.out.println(10 / 3.);

		// 주의
		System.out.println((double) 10 / 3); // 10. / 3 == 10.0 / 3
		System.out.println((double) (10 / 3)); // 서순 체크가 중요. 3을 double로 출력

		/*
		 * 증감연산자(단항연산자) ++,--
		 */
		int n = 1;
		
		
		n++; // n = n+1;        후위
		System.out.println(n);

		n--; // n = n - 1;
		System.out.println(n);

		++n;             // 전위
		
		// 참고 (산술연산자는 다음과 같이 축약형을 쓸 수 있다)
		n += 10; // n = n + 10;
		System.out.println(n);

		n -= 10; // n = n - 10;
		System.out.println(n);
		
		n *= 10; // n = n * 10;
		System.out.println(n);
		
	}

}
