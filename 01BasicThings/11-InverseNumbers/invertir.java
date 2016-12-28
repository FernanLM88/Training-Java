/*
Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés. 

Ask for a number between 0 and 9999 and show reverse, Example: 1234 -> 4321

*/
import java.util.Scanner;
public class invertir {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		int n, num=0, reserva;
		do
		{
			System.out.println("Insertar un número entre 1 y 9999");
			n = leer.nextInt();
		}while(n>9999 || n<0);
		reserva = n;
		do{
			num = num*10 + n%10;
			n /= 10;
		}while(n > 0);
		System.out.println((num==reserva)? "El número es capicua" : "el número no es capicua");
	}

}
