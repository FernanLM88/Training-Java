/*
Pedir 5 números e indicar si alguno es múltiplo de 3. 

Ask for 5 numbers and indicate if any is a multiple of 3.
*/
import java.util.*;
public class Multiplos
{

	public static void main(String[] args)
  	{
		Scanner leer = new Scanner(System.in);
		int n;
		System.out.println("Introducir el "+i+"o número:")
		for(int i=0;i<5;i++)
		{
			n = leer.nextInt();
			if(n%3==0) System.out.println(i+"Es múltiplo de 3");
		}
	}
}

