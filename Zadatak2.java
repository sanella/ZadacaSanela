import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi tri broja");
		int brojA = in.nextInt();
		int brojB = in.nextInt();
		int brojC = in.nextInt();
		int sum = brojA + brojB + brojC;

		if (sum < 150 || sum > 600) {
			return;
		}

		if (brojA < brojB) {
			int brojD = brojB;
			brojB = brojA;
			brojA = brojD;
		}

		if (brojB < brojC) {
			int brojE = brojC;
			brojC = brojB;
			brojB = brojE;
		}

		if (brojA < brojB) {
			int brojD = brojB;
			brojB = brojA;
			brojA = brojD;
		}

		System.out.println("Nova vrijednost broja A: " + brojA);
		System.out.println("Nova vrijednost broja B: " + brojB);
		System.out.println("Nova vrijednost broja C: " + brojC);

		if (brojA == brojB && brojB == brojC && brojC == brojA) {
			System.out.println("broj se ponavlja tri puta");
		}

		if (brojA == brojB || brojA == brojC || brojB == brojC) {
			System.out.println("broj se ponavlja");
		}
	}
}