//*13020210097
//*Umi Zunnurain
//*Rabu/03/2023

/*Casting menggunakan tipe data Class*/
public class Casting2 {

	/**
	*  @param args
	*/
 public static void main(String[] args) {
	   //TODO Auto-genereted method stub
		int a=8, b=9;
		float d=2.f, e=3.2f;
		char g='5';
		double k=3.14;
		String n="67", m="45", l="100"; 

		a = Integer.parseInt(n); /*Konversi String ke Integer*/
		k = Double.parseDouble(m); /*Konversi String ke Double*/
		d = Float.parseFloat(l); /*Konversi String ke Float*/

		System.out.println ("a : "+a+"\nk : "+k+"\nd : "+d);
		n = String.valueOf(b); /*Konversi Integer ke String*/
		m = String.valueOf(g); /*Koversi Karakter ke Sttring*/
		l = String.valueOf(e); /*Konversi Float ke String*/

		System.out.println ("n : "+n+"\nm : "+m+"\nl : "+1);
		k = Double.valueOf(a).intValue();
		/*Konversi integer ke Double*/
		double c = Integer.valueOf(b).doubleValue();
		
		System.out.println("k : "+k+"\nc : "+c+"\nl : "+1);
	}
}