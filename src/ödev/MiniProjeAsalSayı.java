package ödev;

public class MiniProjeAsalSayı {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayi asal degildir");
			return;
		}
		if (number < 1) {
			System.out.println("Gecersiz sayi");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		// if(isPrime)=if(isPrime==true) aynı şey
		if (isPrime) {
			System.out.println("sayi asaldir");
		} else {
			System.out.println("sayi asal degildir");
		}

	}

}
