package chapter01;

public class GuGuDan1 {

	public static void main(String[] args) {
		int i = 1;
		while(i < 10) {
			int j = 1;
			while(j < 10) {
				int result = i*j;
				System.out.println(i + " X " + j + " = " + result);
				j++;
				
			}
			
	
			i++;
			System.out.println("-------------------------");
		}

	}

}
