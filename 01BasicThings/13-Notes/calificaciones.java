/*
Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

Ask any number between 0 and 1 and...

If the number <5 show "Insuficiente"
If the number is 6  show "Bien"
If the number is 7 or 8 show "Notable"
If the number is 9 or 10 show "Suficiente"

*/
import java.util.Scanner;
public class calificaciones {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Insertar Nota");
			n = leer.nextInt();
		}while(n>10 || n<0);
		switch(n)
		{
			case 10:
			case 9:
				System.out.println("Sobresaliente");
			break;
			case 8:
			case 7:
				System.out.println("Notable");
			break;
			case 6:
				System.out.println("Bien");
			break;
			case 5:
				System.out.println("Suficiente");
			break;
			default:
				System.out.println("Inuficiente");
			break;
		}
	}

}
