/*
Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la
cantidad de ceros.

Ask for 10 numbers. Show the mean of the positive numbers, the mean of the negative numbers and the
Amount of zeros.

*/
import java.util.Scanner;
public class Promedios {

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n; //Número introducido
		int ceros=0; //Número de ceros
		int cpos=0; //Cantidad de positivos
		int spos=0; //Suma de los positivos
		int cneg=0; // Cantidad de negativos
		int sneg=0; // suma de negativos
		float medpos, medneg;
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Introduzca un número "+i+" : ");
			n = leer.nextInt();
			if(n==0)
			{
				ceros++;	
			}
			else
			{
				if(n>0)
				{
					cpos++;
					spos = spos + n;
				}
				else
				{
					cneg++;
						sneg = sneg + n;
				}
			}		
		}
		if(cpos>0)
		{
				medpos = spos/cpos;
				System.out.println("La media de los positivos es: "+medpos);
		}
		if(cneg>0)
		{
			medneg = sneg/cneg;			
			System.out.println("La media de los negativos es: "+medneg);	
		}	
		System.out.println("La cantidad de ceros introducidos es: "+ceros);
	}
}
