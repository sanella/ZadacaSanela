import java.util.Scanner;

/**
 * 
 * 
 * Unesi dva broja, provjeriti da lije 
 * @author Sanela
 *
 */
public class Zadatak15 {
public static void main(String[] args) {
	System.out.println("Unesi dvije stranice  ");
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	//tri if petlje . Ako je c >a i C>b.
	double c =Math.sqrt(a * a + b * b);
	System.out.println(c);
}
}
