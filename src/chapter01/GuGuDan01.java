package chapter01;

public class GuGuDan01 {

	public static void main(String[] args) {
		
		
		for(int i =1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				int result = i*j;
				System.out.println(i + " X " + j + " = " + result);
			}
			System.out.println("----------");
		}
		
		
		
		/*
		 * int i = 1; while(i < 10) { int j = 1; while(j < 10) { int result = i*j;
		 * System.out.println(i + " X " + j + " = " + result); j++;
		 * 
		 * }
		 * 
		 * 
		 * i++; System.out.println("-------------------------"); }
		 */
	}

}
