/**
 * 7)	Fibonacijev niz 
 */

import java.util.Scanner;

public class Zadatak7 {
	public static void main(String[] args) {
		int i = 2;
		int a = 1;
		int b = 1;
		int fibN = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj n ");
		int brojN = in.nextInt();

		while (i < brojN) {

			fibN = a + b;
			a = b;
			b = fibN;
			i++;
		}
		if (brojN > 2) {
			fibN = a + b;
		} else if (brojN == 0)
			fibN = 0;
		else
			fibN = 1;
		System.out.println(fibN);
	}

}
	
	


