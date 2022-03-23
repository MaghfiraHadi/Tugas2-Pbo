/* 
Nim : 13020200246
Nama:Maghfira Hadi
Hari/Tgl :Sabtu-19-2022
*/
import java.util.Scanner;

public class Konversi{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int jam,totalJ,menit,totalM,detik,totalD;

		System.out.print("Masukkan detik: ");
		totalD = input.nextInt();

		detik    = totalD %60;
		totalM   = totalD/60;
		menit    = totalM %60;
		totalJ   = totalM/60;
		jam      = totalJ %24;

		
		System.out.println("\nKonversi dari "+totalD+" detik Adalah: ");
		System.out.println(jam+ " jam:" +menit+ " menit:" +detik+ " detik");

	}

}