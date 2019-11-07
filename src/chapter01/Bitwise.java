package chapter01;

public class Bitwise {

	public static void main(String[] args) {
		System.out.println(7 & 4); // 사진의 필터나 노이즈를 제거할 때 사용한다.
		System.out.println(7 | 4);
		System.out.println(7 >> 3);
		System.out.println(7 << 3);
	}

}

// 1의 보수, 2의 보수
/*
 * 1. 증감연산자   ++, --
 * 2. 산술 연산자  *, %, /, +, -
 * 3. 관계 연산자 >, <, >=, <=, ==, !=
 * 4. 논리연산자 ||, &&, !
 */