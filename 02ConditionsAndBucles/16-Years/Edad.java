/*
Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos 
mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.

With the ages and heights of 5 students, show the average age and height, the number of students
Over 18, and the number of students who are more than 1.75.
*/


import java.util.*;
public class Edad
{
	
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		int edad=0; //Edad
		int i=0; // Incrementador para controlar el número de alumnos
		int mayored=0; //Contador de mayores de edad
		int masuno=0; //Contador de mayores de 1.75.
		float medad=0; //Contador de edades para hacer las medias
		float mest=0; //Contador de estaturas para hacer las medias
		float estmed,est;
		boolean bien=true;; 
		/*Comprobadores de si la edad y la estatura están bien introducidas para generar mensajes
		de error*/
		do
		{
			do
			{
				if(bien==false) System.out.println("la edad introducida no es correcta");
				
				System.out.println("Introducir edad del alumno: "+i+" : ");
				edad = leer.nextInt();
				//Por si se introduce mal pongo la variable en false para que vuelva a saltar
				//el mensaje.
				bien=false;
			}while(edad<0 || edad>112);
			//Reinicializo la variable para que a primera hora no salga el mensaje de error.
			bien=true;
			do
			{
				if(bien==false) System.out.println("la estatura introducida no es correcta");
				System.out.println("Introducir estatura del alumno: "+i+" : ");
				est = leer.nextFloat();
				//Por si se introduce mal pongo la variable en false para que vuelva a saltar
				//el mensaje.
				bien=false;
			}while(est<0.5 || est>2.5);

			// sumo las edades para hacer después la media:
			medad= medad + edad;
			// sumo las edades para hacer después la media:
			mest= mest + est;
			//Si estatura es mayor de 1.75, aumenta el contador de más uno			
			if(est>1.74) masuno++;
			//Si edad es mayor de 18, aumenta el contador de más uno
			if(edad>17) mayored++;
			i++;
		}while(i<5);
		medad = medad/5;
		mest = mest/5;
		System.out.println("Hay "+mayored+" mayores de 18 años");
		System.out.println("Hay "+masuno+" más altos de 1.75");
		System.out.println("La edad media es: "+medad);
		System.out.println("La estatura media es: "+mest);
	}
}

