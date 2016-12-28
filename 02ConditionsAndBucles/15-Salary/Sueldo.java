/*
Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.

Ask for 10 salaries. Show the sum and how many there are over 1000 €
*/
import java.util.Scanner;
public class Sueldo
{

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n=0, suma=0, cantmil=0,i=0; //Número introducido		
		do
		{
			System.out.println("sueldo del trabajador numero "+i+" : ");
			n = leer.nextInt();
			if(n>=1000)
			{
				cantmil++;	
			}
			
			if(n>0)
			{
				i++;
				suma = suma + n;	
			}
		}while(i<10);
		System.out.println("La cantidad de sueldos superiores a 1000e: "+cantmil);
		System.out.println("La suma de todos los sueldos es: "+suma);
	}
}
