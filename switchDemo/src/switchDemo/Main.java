package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");  // B ve C için aynı yanıtın gelmesini sağladık.
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

	}

}
