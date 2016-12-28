/*
Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene

Ask for a number between 0 and 9,999 and say how many digits have
*/

import java.util.Scanner;
public class cifra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n,cifras=0;
		do
		{
			System.out.println("Insertar un número entre 1 y 9999");
			n = leer.nextInt();
		}while(n>9999 || n<0);
		System.out.println("el número "+n+" tiene...");
		do
		{
			n=n/10;
			cifras++;
		}while(n!=0);
		System.out.println(cifras +" cifras");
	}

}
