package mukemmelSayi;

public class Main {

	public static void main(String[] args) {

		int number = 1;
		int remainder;
		int total = 0;
		boolean isPerfectNumber = false;
		
		if(number <= 1) {
			System.out.println("Geçersiz sayı girdiniz");
			return;
		}
		
		for (int i = 1; i < 6; i++) {

			if (number % i == 0) {
				total = total + i;
			}

		}
		if (number == total) {
			isPerfectNumber = true;
		}
		if (isPerfectNumber) {
			System.out.println("Sayı mükemmeldir");
		} else {
			System.out.println("Sayı mükemmel değildir");
		}

	}

}
