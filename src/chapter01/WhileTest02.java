package chapter01;

public class WhileTest02 {

	public static void main(String[] args) {
		int i = 0;
		while( i < 10) {
			
			if (i >5 ) {
				System.out.println(i);
				i++;
				continue;                  // 6에서 무한루프빠지게 된다. i++ 구문추가해줌.
				
			}
			System.out.println(i);
			i++;  // 구문 두번 해야되니 이럴거면 for문이 좋음.
		}		
	}
}
