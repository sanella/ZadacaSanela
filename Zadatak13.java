import java.util.Scanner;

/**
 * Napisati program koji ucitava broj od korisnika a zatim ispisuje taj broj ali
 * bez nula
 * 
 * koje se pojavljuju u broju. Npr za unos 10200304005 program treba ispisati
 * 12345.
 * 
 * Prisjetiti se da broj % 10 daje zadnju cifru nekog broja. I da ako neki broj
 * okrenete pa
 * 
 * ga opet okrenete dobijete taj isti broj.
 * 
 * @author Sanela
 *
 */
public class Zadatak13 {
	public static void main(String[] args) {

		System.out.println("Unesi broj ");
		Scanner in = new Scanner(System.in);
		int broj = in.nextInt();
		int zbir = 0;
		int ostatak = 0;

		while (broj != 0) {
//ispitujem da li je broj jednak nuli
			if (broj % 10 != 0) { //da li je ostatak modul jednak nuli
				zbir = zbir * 10; // ako nije prebacujem ga na prvo mjesto
				ostatak = broj % 10; // ostata je sada jednak 
				zbir = (zbir + ostatak);
				broj = broj / 10;
			}
			if (broj % 10 == 0) {
				broj = broj / 10;
			}

		}

		int zbir1 = 0;
		int ostatak1 = 0;
		while (zbir != 0) {

			zbir1 = zbir1 * 10;
			ostatak1 = zbir % 10;
			zbir1 = (zbir1 + ostatak1);
			zbir = zbir / 10;
		}
		System.out.println(zbir1);
	}
}
