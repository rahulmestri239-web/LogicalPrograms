package mathematical;

public class PrintPrimeNumbers {

	public static void main(String[] args) {

		System.out.println("Prime numbers from 1 to 100:");

		for (int number = 2; number <= 100; number++) {
			boolean isPrime = true;

			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(number + " ");
			}
		}
	}
}


