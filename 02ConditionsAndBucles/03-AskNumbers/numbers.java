/*
Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.

Ask numbers, Indicate if the number is possitive or negative. Stop the bucle when the number inserted is 0.
*/
import java.util.Scanner;
public class numebers
{
	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduzca un numero:");
			n = leer.nextInt();
			System.out.println((n>0)? "El número "+n+" es positivo" : "El número "+n+" es negativo");
		} while (n!=0);
		
		System.out.println("El número es 0 saliendo del programa...");
	}

}
