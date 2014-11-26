import java.util.Scanner;


public class Zadatak3 {
public static void main(String[] args) { //kvadratna funkcija ako su koeficijenti realnog tipa (-10 do 10)
	Scanner in = new Scanner(System.in);
	System.out.println("tri broja");
	int brojA = in.nextInt();
	int brojB = in.nextInt();
	int brojC = in.nextInt();
	
	if ( brojA >= -10 && brojA <= 10 && brojB >= -10 && brojB <= 10 && brojC >= -10 && brojC <= 10) {
		System.out.println("Unesi vrijednost x:  ");
		int brojX = in.nextInt();
		int funkcija = brojA * brojX * brojX + brojB * brojX + brojC;
		System.out.println("Vrijednost f-je za uneseno X je:  " + funkcija);
	}
	else {
		System.out.println("Koeficienti a, b, c nisu u zadanom intervalu");
	}
}
}
