/*
Ask the numbers of any equation of 2nd degree, and show their real solutions. If they do not exist, you must indicate it.

Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo. 
*/
import java.util.Scanner;
public class segundogrado {

	public static void main(String[] args) {

		double a=0, b=0, c=0;
		Scanner teclado = new Scanner(System.in);
		do
		{
			System.out.println("Introduzca la variable A:");
			a = teclado.nextDouble();
			if(a<=0) System.out.println("A tiene que ser mayor de 0");
		}while(a<=0);

		do
		{
			System.out.println("Introduzca la variable B:");
			b = teclado.nextDouble();
			if(b<=0) System.out.println("B tiene que ser mayor de 0");
		}while(b<=0);

		do
		{
			System.out.println("Introduzca la variable C:");
			c = teclado.nextDouble();
			if(c<=0) System.out.println("C tiene que ser mayor de 0");;
		}while(c<=0);

		double resMas = (-b + Math.sqrt((b*b)-(4*a*c))) / (2 * a);
		double resMenos = (-b - Math.sqrt((b*b)-(4*a*c))) / (2 * a);
		boolean bien = true;
		System.out.println((resMas>0)? "El resultado sumando es: "+ resMas : "El resultado sumando da un número negativo");
		System.out.println((resMenos>0)? "El resultado restando es: "+ resMenos : "El resultado restando da un número negativo");
	}
	
}
