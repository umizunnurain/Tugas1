//*13020210097
//*Umi Zunnurain
//*Rabu/03/2023

import java.util.Scanner;

/*contoh membaca integer menggunakan Class Scanner*/

public class BacaData {
	
		/**
		*
		* @param args
		*/

		public static void main (String[] args) {

			// TODO Auto-general method stub
		/* kamus */

		int a;
		Scanner masukan;
		/* Program */
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner (System.in);
		a = masukan.nextInt ();
		 /* coba ketik : masukan.nextInt(); Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}
