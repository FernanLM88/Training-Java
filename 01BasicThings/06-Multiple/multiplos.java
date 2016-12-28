/*
Pedir dos números y decir si uno es múltiplo del otro. 

Ask two numbers and indicate if are multiples
*/

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n1, n2; //The two numbers
		
		//Asking for the number 1
		System.out.println("Introduzca el primer numero: ");
		n1 = leer.nextInt();

		//Asking for the number 2
		System.out.println("Introduzca el segundo numero: ");
		n2 = leer.nextInt();
		
		//Evaluating, if n1 % n2 is 0... the number are multiple, until, they aren't.
		System.out.println((n1%n2==0)? "Los números son múltiplos": "Los números son múltiplos");

	}
}