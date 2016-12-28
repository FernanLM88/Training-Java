/*

Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.

Ask numbers while the number is not 0. Indicate if ar even or odd

*/
import java.util.Scanner;
public class Evens
{

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduzca un numero:");
			n = leer.nextInt();
			System.out.println((n%2==0)? "El número "+n+" es par" : "El número "+n+" es impar");
		} while (n!=0);
		System.out.println("El número es 0 saliendo del programa...");
	}

}
