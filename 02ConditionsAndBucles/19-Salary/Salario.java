/*
Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.

Ask for a N number, enter N salaries, and show the maximum salary.
*/
import java.util.*;
public class Salario
{

	public static void main(String[] args)
  	{
		Scanner leer = new Scanner(System.in);
		int n=0; //numero
		int max=0;
		int sueldoActual;
		System.out.println("Introduzca un número de sueldos");
		for (i=0;i<n ;i++ )
		{
				System.out.println("Introduzca el sueldo "+i+":");
				SueldoActual = leer.nextInt();
				if(max<SueldoActual) max=SueldoActual;
		}
		System.out.println("Introduzca el sueldo máximo es: "+max);
		
	}
}

