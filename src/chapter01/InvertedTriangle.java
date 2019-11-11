package chapter01;

public class InvertedTriangle {

	public static void main(String[] args) {
		for(int i = 0; i<6; i++) {
			
			for(int j = 7; j > i+1; j--) {
				
				System.out.print("*");
		}
			System.out.print("\n");
		}
	}

}