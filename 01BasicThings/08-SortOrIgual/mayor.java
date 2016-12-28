/*
	Pedir dos números y decir cuál es el mayor o si son iguales. 

	Ask 2 nunmbers and print the higher or if are the same number. 
*/

import java.util.Scanner;
public class mayor {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n1, n2;
		//Asking the number 1
		System.out.println("Introduzca el primer numero: ");
		n1 = leer.nextInt();

		//Asking the number 2
		System.out.println("Introduzca el segundo numero: ");
		n2 = leer.nextInt();

		//If n1 are igual that n2...
		if(n1==n2)
		{
			//They are the same number.
			System.out.println("Los números son iguales");
		}
		else
		{
			//Until...
			//If n1 is higher than n2...
			if(n1>n2)
			{
				//N1 is the higher
				System.out.println("El número mayor es: "+n1);
			}
			else
			{
				//Until...
				//N2 is the higher
				System.out.println("El número mayor es: "+n2);
			}
		}
	}

}
