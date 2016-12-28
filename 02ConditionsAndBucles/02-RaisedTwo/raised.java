/*
Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.

Ask any number and show this number raised to two. Repeat the process while the number is possitive.
*/
import java.util.*;
public class programa
{

	public static void main(String[] args)
	{
		int n=-1;
		boolean fallo=false;
		do {
			try
			{
				Scanner leer = new Scanner(System.in);
				System.out.println("Introduzca un numero:");
				n = leer.nextInt();
				System.out.println("El cuadrado de "+n+" es "+Math.pow(n,2)+";");
				fallo=false;
			}
			catch(InputMismatchException e)
			{				
				System.out.println("El programa solo acepta números;");
				fallo=true;
			}
			catch(Exception e)
			{
				System.out.println("Ha tenido que haber algún tipo de error");
				fallo=true;										
			}
			if($n>=0) fallo=true;
		} while(fallo==true);
	}
}
