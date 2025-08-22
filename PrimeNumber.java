package firstweek.day1;

public class PrimeNumber {
	public static void main(String[] args) {

		int n = 10;

		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("prime no");
		} else {
			System.out.println("not a prime no");
		}
	}

}
