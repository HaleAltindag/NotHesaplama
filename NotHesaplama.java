import java.util.Scanner;


public class Ders6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 Kar��la�t�rma operat�rleri
	 a == b -- > esit mi (esitse true de�ilse false)
	 a != b -- > e�it de�il mi (esit de�ilse true e�itse false)
	 a > b --- > a b den b�y�k mu (b�y�kse true de�ilse false )
	 a < b --- > a b den k���k m� (k�c�kse true de�ilse false)
	 a <= b ---- > a b ye e�it veya b den k���k m� (�yleyse true de�ilse false)
	 a >= b ---- > a b ye esit veya b den b�y�k m� (�yleyse true de�ilse false)
	 
	 if (kosul) {
	 
	 if blo�u
	 Burada ko�ul sa�lan�nca i�lemler yap�l�yor ...
	 */
	
		System.out.println("Sonu� = " + (5 == 5));
		System.out.println("Sonu� = " + (5 != 4));
		System.out.println("Sonu� = " + (10 <= 2));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz");
		
		int note = scan.nextInt();
		
		if (note >= 60) {
		
		System.out.println("Dersten ge�tiniz... ");
		
		}
		
		else {
			
		System.out.println("Dersten kald�n�z...");
		
		
		}
	}
	

}
