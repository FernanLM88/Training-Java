/*
Pedir un número e indicar si es positivo o negativo

Ask for a number and evaluate if are possitive or negative
*/
import java.util.Scanner;
public class comprobar {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String msg; //Message if are possitive or negative
		int n; //Number to ask

		//Indrude a number
		System.out.println("Introduzca un numero: ");
		n = leer.nextInt(); //Pick up the number and save on N
		if(n>0) //If N is higher that 0
			msg="El número es positivo"; //Number possitive
		else //If N is lower that 0
			msg="El número es negativo"; //Number Negative
		if(n==0) //if N is 0
			msg="El número es cero"; //Number is zero
		System.out.println(msg); //print msg
		
	}

}
