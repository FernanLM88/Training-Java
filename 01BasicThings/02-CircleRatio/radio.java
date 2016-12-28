/*
Pedir el radio de un círculo y calcular su área. A=PI*r2. 

ASk the ratio of a circle and calculate the area: A=PI*r2. 
*/

import java.util.Scanner;
public class radio {

	public static void main(String[] args) {
		double resultado;
		double r;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca el radio: ");
		r = leer.nextDouble();
		resultado = Math.PI*Math.pow(r, 2);
		System.out.println("El área del círculo es: "+resultado);
	}

}
