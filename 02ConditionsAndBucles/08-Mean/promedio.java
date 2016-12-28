/*
Pedir números hasta que se introduzca uno negativo, y calcular la media.

Ask for numbers until you enter a negative, and calculate the mean.
*/
import java.util.Scanner;
public class promedio
{

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n, cantidad=0;
		double media=0;
		do {
			System.out.println("Introduzca un numero:");
			n = leer.nextInt();
			if(n>0)
			{
				cantidad++;
				media = media +n;
			}
			System.out.println("El numero introducido es "+n);
		} while (n>0);
		media = media/cantidad;
		System.out.println("Numero negativo detectado, la media de numeros introducidos es: "+media);
	}
}
