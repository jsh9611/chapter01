package chapter01;

public class GuGuDan02 {

	public static void main(String[] args) {
		int i = 1;
		while(i < 10) {
			int j = 1;
			
			while(j < 10) {
				int result = i*j;
				System.out.print(j + " X " + i + " = " + result + "  ");
				j++;
				
			}
			
	
			i++;
			System.out.println("-------------------------");
		}

	}

}
