/*
	Pedir dos números y mostrarlos ordenados de mayor a menor. 

	Ask 2 nunbers and sort from higher to lower
*/

import java.util.Scanner;
public class ordenar {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduzca el primer numero: ");
		n1 = leer.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		n2 = leer.nextInt();
		if(n1>=n2)
		{
			System.out.println(n1 +" " +n2);
		}
		else
		{
			System.out.println(n2 +" " +n1);
		}
	}

}
