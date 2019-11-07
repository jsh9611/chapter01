package chapter01;

public class Relation {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		boolean r1 = a == b; // 논리연산은 bool이 무조건 와야한다
		System.out.println(r1);
		
		boolean r2 = a != b;
		System.out.println(r2);
		System.out.println(a != b);
		
		System.out.println(a > b);
		System.out.println(a < b);
		
		System.out.println(a >= b);
		System.out.println(a <= b);
		

	}

}
