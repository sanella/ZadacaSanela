public class Zadatak5 {

	public static void main(String[] args) {

		System.out.println(pripremiPravougaonik(9, 4)); // ovo je najjednostavniji nacin jer imam mogucnost da proslijedim strin za graficki interfac ili nesto drugo
						
	}

	public static String pripremiPravougaonik(int visina, int sirina) {

		String str = "";

		str = pripremiPrviIliZadnjiRed(sirina) + "\n";

		for (int i = 2; i < visina; i++) {

			str += pripremiSrednjiRed(sirina) + "\n";

		}

		str += pripremiPrviIliZadnjiRed(sirina);

		return str;

	}

	public static String pripremiPrviIliZadnjiRed(int sirina) {

		String str = "";

		str = pripremiProizvoljanRed(sirina, '+', '-');

		return str;

	}

	public static String pripremiSrednjiRed(int sirina) {

		String str = "";

		str = pripremiProizvoljanRed(sirina, '|', ' ');

		return str;

	}

	public static String pripremiProizvoljanRed(int sirina, char c1, char c2) { // ovdje opsiujem kako ce se redati karakteri
																				

		String str = "";

		str += c1;

		for (int i = 2; i < sirina; i++) {

			str += c2;

		}

		str += c1;

		return str;

	}

}