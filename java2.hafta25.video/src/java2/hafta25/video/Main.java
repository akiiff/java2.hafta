package java2.hafta25.video;

public class Main {

	public static void main(String[] args) {
		
		int toplam = topla(16,5);
		System.out.println(toplam);
		String sehir = sehirVer();
		System.out.println(sehir);
		
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
		
	}
	public static String sehirVer() {
		return "izmir";
	}

}
