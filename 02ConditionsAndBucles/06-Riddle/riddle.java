/*
Pedir un número N, y luego ir pidiendo números
indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el
usuario acierta.

ASk a number N. Ask numbers and indicate if are highwer or lower respect to N. The process finish
when riddle the user's number
*/
import java.util.Scanner;
public class riddle {

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n, adivina;

		System.out.println("Introduzca el numero a adivinar:");
		n = leer.nextInt();
		do {
			System.out.println("A ver si aciertas ;) :");
			adivina = leer.nextInt();
			if (adivina>n)
			{
				System.out.println(adivina+" es mayor que el numero a adivinar");
			}
			else
			{
				System.out.println(adivina+" es menor que el numero a adivinar");
			}
		} while (adivina!=n);
		System.out.println("Enhorabuena, has adivinado el numero");
	}
}
