package java2.hafta26.video;

public class Main {

	public static void main(String[] args) {
		int toplam = topla(1,2,3,6);
		System.out.println(toplam);
		

	}
	public static int topla(int...sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}
