import java.util.Scanner;


public class Zadatak6 {
public static void main(String[] args) {
	int zadaniBroj = (int) (1+Math.random()*100);
	System.out.println("Zadani broj " + zadaniBroj);
	Scanner in = new Scanner(System.in);
	int i = 0;
	int BrojX = -1;
	int brojA = 0;
	
	
	do {
		System.out.println("unesi broj ");
		brojA = in.nextInt();
		i++;
		System.out.println(" broj unosa: " + i);
		if (brojA < zadaniBroj) {
			System.out.println("trazeni broj je veci ");}
		
			else if (brojA > zadaniBroj) {
				System.out.println(" trazeni broj  je manji");}
			
			if (brojA == zadaniBroj) {
				System.out.println(" Cestitamo pogodili ste");
		return;}
			
	} while (brojA != zadaniBroj);
	
}}
	

