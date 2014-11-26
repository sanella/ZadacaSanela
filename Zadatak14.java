import java.util.Scanner;

/**
 * Napisati prog koji korisnik unosi dva broja a ispisuje treci broj koji
 * ispisuje njamanju moguucu str trougla a + b > c b + c > a c + a > b
 * 
 * @author Sanela
 *
 */
public class Zadatak14 {
	public static void main(String[] args) {

		System.out.println("Unesi dvije stranice  ");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c;
		for (c = 1; c < a + b; c++) {
			if (a + b > c && b + c > a && c + a > b) {
				System.out.println("najmanja mogua stranica je: " + c);
				return;
			}
			if (a + b < c || b + c < a || c + a < b) {
				System.out.println("Kombinacija nije moguca");
				return;
			}

		}

	}
}
