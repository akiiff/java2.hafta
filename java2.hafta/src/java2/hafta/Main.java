package java2.hafta;

public class Main {

	public static void main(String[] args) {
		//sayıBulmaca metodunu çağırır.
		//Sürekli aynı kodları yazmamak için (DRY) bir adet metod oluşturulur.İhtiyaç olduğunda çağrılır.
		sayıBulmaca();
	}
	public static void sayıBulmaca() {
		int[] sayilar = new int[] { 1, 2, 4, 7, 8, 10 };
		int aranacak = 2;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varMi = true;
			}
		}

		if (varMi) {
			mesajVer("Sayı mevcuttur."+ aranacak);
		} else {
			mesajVer("Sayı mevcut değildir."+ aranacak);		}
		
	}
public static void mesajVer(String mesaj) {
	System.out.println(mesaj); 
	
}

}
