import java.util.Scanner;

public class Zadatak8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Unesi broj n ");
		double broj = in.nextDouble();
		int i = 1;
int zbir = 0;
		if (broj % 1 == 0 && broj > 0) { // provjera da li je prirodan
			
			System.out.println("broj je prirodan " + broj);
		

for (int j = 1; j <= broj; j++){
	if (broj %j == 0) {
		zbir = zbir + j; }
	}

System.out.println(zbir);
		}
		if (broj % 1 != 0 || broj <0) // provjera ako broj nije prirodan
		{
			System.out.println("broj nije prirodan " + broj );
		}

	}
}
