/*
Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo
siguiente.


Ask any hour, any minute and any seconds and show the time in seconds.
*/
import java.util.Scanner;
public class hours {

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int hora=0, minutos=0, segundos=0,seg;
		boolean intentos=true;
		do
		{
			//Si intentos falso muestra el fallo
			if(intentos==false) System.out.println("hora mal introducido, por favor vuelva a introducir la hora");
			//Pedir la hora
			System.out.println("Introduzca la hora");
			hora = leer.nextInt();
			//Por si falla, intentos la volveremos "falsa"
			intentos = false;
			//Si la hora no está entre las horas correctas, vuelve a pedir la hora
		} while (hora<0||hora>24);
		intentos=true;
		do
		{
			//Si los minutos no está entre los minutos correctas, vuelve a pedir los minutos
			if(intentos==false) System.out.println("minuto mal introducido, por favor vuelva a introducir el minuto");
			//Pedir el minuto
			System.out.println("Introduzca la minutos");
			minutos = leer.nextInt();
			//Por si los minutos no es correcto, intentos la volveremos "falsa"
			intentos = false;
		} while (minutos<0 || minutos>60);
		intentos=true;
		do
		{
			//Si los segundos no está entre los segundos correctas, vuelve a pedir los segundos
			if(intentos==false) System.out.println("segundos mal introducido, por favor vuelva a introducir los segundos ");
			System.out.println("Introduzca la segundos");
			//Pedir lossegundos
			segundos = leer.nextInt();
			//Por si los minutos no es correcto, intentos la volveremos "falsa"
			intentos = false;

		} while (segundos<0 || segundos>60);

		segundos = ++segundos;
		System.out.println("La hora siguiente es: "+hora+":"+minutos+":"+segundos);
	}

}
