import java.util.Scanner;

/**
 * Od korisnika traziti da unese recenicu (sa razmacima) i odredeno slovo. Na
 * konzolu
 * 
 * ispisati istu redenicu bez tog slova.
 * 
 * Primjer:
 * 
 * Unesite recenicu:
 * 
 * PeoplE are strange when you’re a stranger.
 * 
 * Unesite slovo:
 * 
 * E
 * 
 * Popl ar strang whn you’r a strangr
 * 
 * Napomena
 * 
 * U ovom slucaju ne pravimo razliku izmedu malog i velikog slova
 * 
 * @author Sanela
 *
 */
public class zadatak11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String prazno = "";

		String recenica;
		System.out.println("Unesi recenicu ");
		recenica = in.nextLine();

		String slovo;
		System.out.println("Unesi slovo ");
		slovo = in.next();

		if (slovo.length() > 1) {
			System.out.println("niste pravilno unijeli slovo");
			return;
		}

		if (recenica.contains(slovo)) {
			recenica = recenica.replaceAll(slovo.toLowerCase(), prazno);
			recenica = recenica.replaceAll(slovo.toUpperCase(), prazno);
			System.out.println(recenica);
		}

	}
}
