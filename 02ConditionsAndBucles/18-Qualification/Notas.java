/*
Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

Having 6 notes, write the number of students approved, conditioned (= 4) and suspended.
*/
import java.util.*;
public class Notas {

	public static void main(String[] args)
  	{
		Scanner leer = new Scanner(System.in);
		int n=0; //numero
		boolean bien = true;//Para mensaje de error
		int i=0; //Contador
		int aprob=0; //cantidad aprobados
		do
		{
			if(bien==false) System.out.println("La nota introducida no es correcta");
			System.out.println("Introducir una nota: ");
			n = leer.nextInt();
			//n = Integer.parseInt(leer.readline());
			if(n<0 || n>10)
			{
				bien=false;                                
			} else{
				bien=true;
                                i++;
			}
			if(n>4) aprob++;
		}while(n<0 || n>10 || i!=5);
		System.out.println("Hay "+aprob+" aprobados.");
	}
}

