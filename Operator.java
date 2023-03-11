//*13020210097
//*Umi Zunnurain
//*Rabu/03/2023

/* Contoh pengoperasian variabel bertype dasar */

public class Operator {
  
  public static void main (String[] args) {
	   // TODO Auto-generated method stub
		/* Kamus */
			boolean Booll, Bool2, TF;
			int i,j, hsl ;
			float x,y,res;
		/* algoritma */
			System.out.println("Silahkan baca teksnya dan tambahkan perintah program dibawah ini untuk menampilkan output program");
				

				Booll = true; Bool2 = false;
				TF = Booll && Bool2 ; /* Boolean AND */
				TF = Booll || Bool2 ; /* Boolean OR */
				TF = ! Booll ; /* NOT */
				TF = Booll  ^Bool2 ; /* XOR */
				/* operasi numerik */
				i = 5; j = 2;
				hsl = i+j;
				hsl = i - j;
				hsl = i / j;
				hsl = i * j;
				hsl = i /j;     /* pembagian bilangan bulat */
				hsl = i%j;	   /* sisa modulo */

				/* operasi numerik */
				x = 5 ; y = 5;
				res = x + y;
				res = x - y;
				res = x / y;
				res = x * y;
				
				/* operasi relasional numerik */
				 TF = (i==j);
				 TF = (i!=j);
				 TF = (i < j);
				 TF = (i > j);
				 TF = (i<=j);
				 TF = (i>=j);
				
				/* operasi relasional numerik */
				TF = (x != y);
				TF = (x < y);
				TF = (x > y);
				TF = (x <= y);
				TF = (x >= y);

				System.out.println("Nilai hs1 = " +hsl);
				// Menampilkan hasil nilai dari hsl
				System.out.println("Nilai res = " + res);
				// Menampilkan hasil nilai dari res
				System.out.println("Nilai tf = " + TF);
				// Menampilkan hasil nilai dari TF
   }
}




