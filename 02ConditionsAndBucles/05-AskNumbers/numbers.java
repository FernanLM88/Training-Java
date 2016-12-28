/*
Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.

Ask numbers and stops when the number is negative. Show how many numbers was intrude.
*/
import java.util.Scanner;
public class numbers
{
	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n, cantidad=0;
		do {
			System.out.println("Introduzca un numero:");
			n = leer.nextInt();
			if(n>0) cantidad++;
			System.out.println("El numero introducido es "+n);
		} while (n>0);
		System.out.println("Numero negativo detectado, la cantidad de numeros introducidos es: "+cantidad + " saliendo del programa...");
	}
}
