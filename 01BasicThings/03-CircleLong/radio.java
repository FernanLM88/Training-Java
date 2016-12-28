/*
Pedir el radio de una circunferencia y calcular su longitud.

Ask the ratio of a circle and calculate the length.
*/


import java.util.Scanner;
public class radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado;
		int r;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca el radio: ");
		r = leer.nextInt();
		resultado = 2* Math.PI*r;
		System.out.println("El área del círculo es: "+resultado);	
	}

}
