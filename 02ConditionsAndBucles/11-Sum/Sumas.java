/*
Pedir 15 números y escribir la suma total

Order 15 numbers and write the total sum
*/

import java.util.Scanner;
public class Sumas
{

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n, cantidad=0;
		for(c=0;c<15;c++)
		{
			System.out.println("Introduzca el "+c" numero:");
			n = leer.nextInt();
			cantidad = cantidad +n;
		}
		System.out.println("La suma de todos los numeros es: "+cantidad);
	}
}
