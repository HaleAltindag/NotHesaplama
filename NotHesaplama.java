import java.util.Scanner;


public class Ders6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 Karþýlaþtýrma operatörleri
	 a == b -- > esit mi (esitse true deðilse false)
	 a != b -- > eþit deðil mi (esit deðilse true eþitse false)
	 a > b --- > a b den büyük mu (büyükse true deðilse false )
	 a < b --- > a b den küçük mü (kücükse true deðilse false)
	 a <= b ---- > a b ye eþit veya b den küçük mü (öyleyse true deðilse false)
	 a >= b ---- > a b ye esit veya b den büyük mü (öyleyse true deðilse false)
	 
	 if (kosul) {
	 
	 if bloðu
	 Burada koþul saðlanýnca iþlemler yapýlýyor ...
	 */
	
		System.out.println("Sonuç = " + (5 == 5));
		System.out.println("Sonuç = " + (5 != 4));
		System.out.println("Sonuç = " + (10 <= 2));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz");
		
		int note = scan.nextInt();
		
		if (note >= 60) {
		
		System.out.println("Dersten geçtiniz... ");
		
		}
		
		else {
			
		System.out.println("Dersten kaldýnýz...");
		
		
		}
	}
	

}
