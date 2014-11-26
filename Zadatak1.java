import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("unesi mjesec rodjenja");
		int brojA = in.nextInt();
		System.out.println("Unesi dan rodjenja");
		int brojB = in.nextInt();

		if (brojA == 1 && brojB >= 20 && brojB <= 31) { // AQUARISU
			System.out.println("Aquarius");
		}

		if (brojA == 2 && brojB >= 1 && brojB <= 18) {
			System.out.println("Aquarius");
		}

		if (brojA == 2 && brojB >= 19 && brojB <= 29) { // PISECES
			System.out.println("Pisces");
		}

		if (brojA == 3 && brojB >= 1 && brojB <= 20) {
			System.out.println("Pisces");
		}

		if (brojA == 3 && brojB >= 21 && brojB <= 31) { // Aries
			System.out.println("Aries");
		}

		if (brojA == 4 && brojB >= 1 && brojB <= 19) {
			System.out.println("Aries");
		}

		if (brojA == 4 && brojB >= 20 && brojB <= 30) { // TAURUS
			System.out.println("Taurus");
		}

		if (brojA == 5 && brojB >= 1 && brojB <= 20) {
			System.out.println("Taurus");
		}

		if (brojA == 5 && brojB >= 21 && brojB <= 31) { // GEMINI
			System.out.println("Gemini");
		}
		if (brojA == 6 && brojB >= 1 && brojB <= 20) {
			System.out.println("Gemini");
		}

		if (brojA == 6 && brojB >= 21 && brojB <= 30) { // CANCER
			System.out.println("Cancer");
		}

		if (brojA == 7 && brojB >= 1 && brojB <= 22) {
			System.out.println("Cancer");
		}
		if (brojA == 7 && brojB >= 23 && brojB <= 31) { // LEO
			System.out.println("Leo");
		}

		if (brojA == 8 && brojB >= 1 && brojB <= 22) {
			System.out.println("Leo");
		}

		if (brojA == 8 && brojB >= 23 && brojB <= 31) { // VIRGO
			System.out.println("Virgo");
		}

		if (brojA == 9 && brojB >= 1 && brojB <= 22) {
			System.out.println("Virgo");
		}
		if (brojA == 9 && brojB >= 23 && brojB <= 30) { // Libra
			System.out.println("Libra");
		}

		if (brojA == 10 && brojB >= 1 && brojB <= 22) {
			System.out.println("Libra");
		}

		if (brojA == 10 && brojB >= 23 && brojB <= 31) { // SCORPIO
			System.out.println("Scorpio");
		}

		if (brojA == 11 && brojB >= 1 && brojB <= 21) {
			System.out.println("Scorpio");
		}
		if (brojA == 11 && brojB >= 22 && brojB <= 30) { // Sagittarius
			System.out.println("Sagittarius");
		}

		if (brojA == 12 && brojB >= 1 && brojB <= 21) {
			System.out.println("Sagittarius");
		}

		if (brojA == 12 && brojB >= 22 && brojB <= 31) { // Capricorn
			System.out.println("Capricorn");
		}

		if (brojA == 1 && brojB >= 1 && brojB <= 19) {
			System.out.println("Capricorn");
		}

	}
}
