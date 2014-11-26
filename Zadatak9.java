/**
 * 
 * @author Sanela
 *
 */
import java.util.Scanner;
public class Zadatak9 {
public static void main(String[] args) {
	System.out.println("Unesi broj sati ");
	Scanner in = new Scanner(System.in);
	int brojSati= in.nextInt();
	double suma1 = (double) 0.5 * brojSati + 10;
	double suma2 = (double) 0.8 * brojSati;
	
	if (suma1 < suma2) {
		System.out.println("Isplativija je firma 1 "   );}
		else if (suma2 < suma1) {
			System.out.println("Isplativija je firma 2 "  );}
	
	}
}

