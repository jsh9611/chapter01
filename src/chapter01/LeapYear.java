package chapter01;

public class LeapYear {

	public static void main(String[] args) {
		// 1. 4로 나누어서 나머지가 0인 해는 윤년.
		// 2. 4로 나누어서 나머지가 0인 아닌 해 중에 100으로 나누어서 나머지가 0인 해는 윤년이다.
		// 3. 4로 나누어서 나머지가 0인 해 중에 100으로 나누어서 나머지가 0이 아닌 해 중에
		// 400으로 나누어서 나머지가 0인 해는 윤년이다.
		// 4. 4로 나누어서 나머지가 0인 해 중에 100으로 나누어서 나머지가 0이 아닌 해 중에
		// 400으로 나누어서 나머지가 0이 아닌 해는 윤년이 아니다.

		// 4의 배수
		// 100의 배수는 아니며
		// 400의 배수이다.

		int year = 2004;
		if (year % 4 != 0) {
			System.out.println("윤년이 아닙니다.");
		} else {
			if (year % 400 == 0) {
				System.out.println("윤년입니다.");
			} else {
				if (year % 100 == 0) {
					System.out.println("윤년이 아닙입니다.");
				} else {
					System.out.println("윤년이 ㅇ니다.");
				}
			}
		}
		if (year % 4 != 0) {
			System.out.println(year + "년은 윤년이 아닙니다.");
		} else if (year % 100 != 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else if (year % 400 != 0) {
			System.out.println(year + "년은 윤년이 아닙니다.");
		} else {
			System.out.println(year + "년은 윤년입니다.");
		}
	}

}