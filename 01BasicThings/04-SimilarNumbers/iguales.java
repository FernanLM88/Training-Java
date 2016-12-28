/*
Pedir dos números y decir si son iguales o no. 

Ask 2 numbers and evaluate if are the same number
*/

import java.util.Scanner;
public class iguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduzca el primer numero: ");
		n1 = leer.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		n2 = leer.nextInt();
		System.out.println((n1==n2)? "Los numeros son iguales": "Los numeros son diferentes");

	}

}