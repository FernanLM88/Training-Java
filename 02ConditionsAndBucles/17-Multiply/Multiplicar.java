/*
Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.

Request a number (between 0 and 10) and display the multiplication table of that number.
*/
import java.util.*;
public class Multiplicar
{
	
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		int n=0; //numero
		boolean bien = true;
		int multi;
		do
		{
			if(bien==false) System.out.println("la edad introducida no es correcta");
			System.out.println("Introducir un numero: ");
			n = leer.nextInt();
			//Por si se introduce mal pongo la variable en false para que vuelva a saltar
			//el mensaje.
			bien=false;

		}while(n<0 || n>10);
		for(int c=0; c<=10;c++)
		{
			multi = n * c;
			System.out.println(n+" x "+c+" = "+multi);
		}
	}
}

