/*
 * Author: Khaled Mahmud
 * Year: 2022
 */
public class Palindromzahl{
	
	public static int spiegeln(int zahl) {
		int reverse = 0;
		int remendar = 0;
		
		do {
			remendar = zahl % 10;
			reverse = reverse * 10 + remendar;
			zahl = zahl / 10;
			
		}while (zahl>0);
	
	return reverse;
		
	}
	
	public static int spiegelAddieren(int zahl) {
		int r = spiegeln(zahl);
		int summe = zahl + r;
		
		return summe;
	}
	
	public static boolean palindromTest(int zahl) {
		int r = spiegeln(zahl);
		
			if (zahl == r)
				return true;
			else 
				return false;
	}

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		int s= spiegeln(n);
		int a= spiegelAddieren(n);
		boolean b= palindromTest(n);
		
		if(b == true)
		{
			System.out.println(s);
			System.out.println(a);
			System.out.println(n);
		}
		else {
			
		System.out.println(s);
		System.out.println(a);
		
		do  {
			n = a;
			s = spiegeln(n);
			a = spiegelAddieren(n);
			b = palindromTest(n);
		} while (b != true);
		
		System.out.println(n);
		}
	}

}
