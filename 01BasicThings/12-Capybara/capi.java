/*
 Pedir un número entre 0 y 9.999, decir si es capicúa. 

 Ask for a number between 0 and 9,999 say if are capybara
*/
import java.util.Scanner;
public class capi {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		int n, num=0;
		do
		{
			System.out.println("Insertar un número entre 1 y 9999");
			n = leer.nextInt();
		}while(n>9999 || n<0);
		do{ 
			num = num*10 + n%10; 
			n /= 10; 
		}while(n > 0); 
			System.out.println(num);
	}

}
