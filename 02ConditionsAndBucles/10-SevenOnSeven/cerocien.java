/*
Escribir todos los números del 100 al 0 de 7 en 7.

Write all the numbers from 100 to 0 by jumping 7 in 7  
*/
import java.util.Scanner;
public class cerocien
{

	public static void main(String[] args)
  {
		int c;
		for(c=0;c<100;c++)
		{
			System.out.println(c);
			c=c+6;
		}
	}
}
