/*
Diseñar un programa que muestre el producto de los 10 primeros números impares.

Design a program that shows the product of the first 10 odd numbers.
*/

public class impares
{

	public static void main(String[] args)
  {
	int producto=1;
		System.out.println("Los impares a calcular son:");
		for(int c=0;c<10;c++)
		{
			c++;
			System.out.println(c);
			producto = producto*c;		
		}
		System.out.println("El prodcuto de los números es: "+producto);
	}
}
