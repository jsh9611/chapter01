package chapter01;

public class VarTest {

	public static void main(String[] args) {
		final double PI = 3.14;
		/* 엔터
		 * 기본타입(Primitive type)
		 */
		
		//정수
		byte b = 1;
		short s = 10;
		int i = 2000;
		long l = 1234567890L; //L을 붙여서 long 타입 쓴다는걸 알려줌.
							  //쓸모없는 변수 아니야? 이클립스가 체크해줌
		
		//실수
		float f = 3.14f;
		double d = 3.14;
		
		//문자
		char c = 'A';
		char c2 = 65;
		
		//불린
		boolean bool = true;
		boolean bool2 = false;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);

		System.out.println(f);
		System.out.println(d);
	
		System.out.println(c);
		System.out.println(c2);
		
		System.out.println(bool);
		System.out.println(bool2);
		
		/*
		 * 	참조형(Reference type)
		 */
		
		//문자열은 기본 타입이 아니다.
		//문자열은 기본타입 char가 모여있는 String이라는 클레스의 객체이다.
		String str = "Hello";
		System.out.println(str.length());
		
		/*
		 * 지역 변수 초기화
		 */
		
		// 지역변수 {~~~} 블럭 안의 변수는 끝나면 메모리에서 사라짐.
		// 지역변수는 초기화가 되어야 한다.
		// 그렇지 않으면 오류
		
		int j = 0;
		
		System.out.println(j);

		/*
		 * 상수
		 */
		final int NUMBER = 10;
		System.out.println(NUMBER);
		// final이 있으면 변수에 그만 집어넣어라. 아니면 오류뜸 보통 대문자로 변수
		
		// 초기화할 때 final이 붙어있는 변수는
		// 초기화 이후엔 값을 대입할 수 없다.
		
		// number = 100;
	}

}
