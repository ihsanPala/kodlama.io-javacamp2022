package ödev;

public class switchdemo {

	public static void main(String[] args) {
		char grade = 'H';

		switch (grade) {
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B':
			System.out.println("Çok güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldiniz");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");

		}

	}

}
