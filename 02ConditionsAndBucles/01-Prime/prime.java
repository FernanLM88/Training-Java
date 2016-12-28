/*
Programa que pida un número entero y positivo por teclado y diga si el número introducido es primo o no.
Los errores se capturarán mediante excepciones. 

Ask a number integer and positive. Indicate if are primme. Capture the errors using exceptions.
*/
import java.util.*;

public class prime {
    
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int n=0;
		boolean primo=true,positivo=true;
		do{
			System.out.println("Introduzca un numero:");
			//Por si el número es negativo...
			if(positivo==false)
			{
				System.out.println("El número es negativo, por favor, Introduzca un número positivo");
			}
			try
			{	
				//Pido el número				
				n = leer.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("Esta última petición solo acepta enteros positivos");
			}
			catch(Exception e)
			{
				System.out.println("Algo estás haciendo mal");
			}
			// Asumo que el número es negativo, por si la condición del bucle no se cumple.
			positivo = false;
		} while (n<0);
		if(n>0)
		{
			for (int c=2;c<n; c++)
			{
				if(n%c==0) 
				{	
					primo = false;
					break;
				}
			}
			System.out.println((primo==true) ? "El número es primo" : "el número no es primo");
		}	
		
	}

}
