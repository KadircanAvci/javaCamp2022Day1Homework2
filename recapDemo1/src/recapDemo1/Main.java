package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 30;
		int sayi2 = 22;
		int sayi3 = 11;
			
		int buyukSayi = sayi1;
		
		if (sayi2 > buyukSayi) {
			buyukSayi = sayi2;
		}
		
		if(sayi3 > buyukSayi) {
			
			buyukSayi = sayi3;
			
		}
		
		System.out.println("EN büyük sayi = "+buyukSayi);
	}

}
