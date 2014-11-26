import java.util.Scanner;


public class Zadatak4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Skup A");
	int brojA = in.nextInt();
	int brojB = in.nextInt();
	System.out.println("Skup B");
	int brojC = in.nextInt();
	int brojD = in.nextInt();
	
	if ( brojB < brojC ){
		System.out.println("skupovi se ne sijeku ");
	} else {
	
	if ( brojA >= brojC ) {
		System.out.println("prvi broj presjeka stanja je " + brojA);
	} else {
		System.out.println("prvi broj presjeka stanja je " + brojC);
	}
	
	if ( brojB <= brojD ) {
		System.out.println("zadnji broj presjeka stanja je " + brojB);
	} else {
		System.out.println("zadnji broj presjeka stanja je " + brojD);
	} 
	
	if ( brojA >= brojC && brojB >= brojD) {
		
		System.out.println("skup B je sadrzan u skupu A ");
		}
	if ( brojA <= brojC && brojB <= brojD) {
		
		System.out.println("skup A je sadrzan u skupu B ");
		}
	
		
	}
}
}
