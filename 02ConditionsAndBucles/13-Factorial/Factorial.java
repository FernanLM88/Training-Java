import java.util.*;
public class programa {

	public static void main(String[] args)
  {
		Scanner leer = new Scanner(System.in);
		int n, factorial=0;
		System.out.println("Introduzca un número:");
		n = leer.nextInt();
		for(int c=1;c<=n;c++)
		{
			factorial = factorial + c;
			System.out.print(c+ ((c!=n)? " + " : " = "));	
		}
		System.out.println(factorial);
	}
}
