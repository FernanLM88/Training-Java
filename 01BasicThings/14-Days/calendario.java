/*
Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28,
30 y 31 días. Sin años bisiestos.

Ask a day, month and year. Indicate if the date is correct and how many days have the month.

*/
import java.util.Scanner;
public class calendario {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int dia, mes, ano;
		do
		{
			System.out.println("Insertar Dia");
			dia = leer.nextInt();
		}while(dia>32 || dia<0);
		do
		{
			System.out.println("Insertar número de mes");
			mes = leer.nextInt();
		}while(mes>13 || mes<0);
		do
		{
			System.out.println("Insertar Año");
			ano = leer.nextInt();
		}while(ano>2017 || ano<0);
		switch(mes)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(dia<=31)
				{
					System.out.println("Fecha es correcta");
				}
				else
				{
					System.out.println("Fecha es incorrecta");
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(dia<=30)
				{
					System.out.println("Fecha es correcta");
				}
				else
				{
					System.out.println("Fecha es incorrecta");
				}
			break;
			default:
				if(dia<=28)
				{
					System.out.println("Fecha es correcta");
				}
				else
				{
					System.out.println("Fecha es incorrecta");
				}
			break;
		}
	}

}
