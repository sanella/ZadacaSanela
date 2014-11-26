import java.util.Scanner;

/**
 * Traziti od korisnika broj a zatim ispisati sumu cifara tog broja. Npr ako
 * korisnik unese
 * 
 * 123 program treba ispisati 6 jer je 1 + 2 + 3 = 6
 * 
 * @author Sanela
 *
 */
public class Zadatak12 {
	public static void main(String[] args) {

		System.out.println("Unesi broj ");
		Scanner in = new Scanner(System.in);
		int broj = in.nextInt();
		int zbir = 0;
		int ostatak = 0;
		
		do {
			ostatak = broj % 10;
			zbir = zbir + ostatak;
			broj = broj / 10;
		} while (broj != 0);
		
		System.out.println(zbir);

	}
}
