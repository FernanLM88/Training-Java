/*
Pedir un número N, y mostrar todos los números del 1 al N.

Request an N number, and display all numbers from 1 to N.
*/
import java.util.Scanner;
public class contar
{

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n;
		boolean negativo=false;
		do {
			if(negativo==true) System.out.println("El número debe de ser mayor de 0");
			System.out.print("Introduzca un numero: ");
			n = leer.nextInt();
			negativo=true;
		} while (n<=0);

		for(int c=0;c<=n;c++)	System.out.println(c);
	}
}
