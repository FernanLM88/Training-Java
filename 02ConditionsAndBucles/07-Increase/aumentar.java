/*
Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

Ask for numbers until a 0 is entered, show the sum of all the numbers entered.
*/
import java.util.Scanner;
public class aumentar
{

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n, cantidad=0;
		do {
			System.out.println("Introduzca un numero:");
			n = leer.nextInt();
			cantidad = cantidad +n;
			System.out.println("El numero introducido es "+n);
		} while (n!=0);
		System.out.println("Numero 0 detectado, la suma de todos los numeros es: "+cantidad);
	}
}
