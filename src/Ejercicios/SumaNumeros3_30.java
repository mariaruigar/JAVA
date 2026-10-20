package Ejercicios;

import java.util.Scanner;

public class SumaNumeros3_30 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		//Pedimos un numero y tenemos que mostrar su suma 1 hasta N
		System.out.print("Dime un numero y te muestro su suma");
		//Variable igualadora
		int suma=0;
		int num = sc.nextInt();
		
		//do...while
		int j=1;
		do	{
			suma=suma+j;
			j++;
			
		}while (j<=num);
		
		System.out.printf("%n%nLa suma de los %d primeros numeros %d, " + "hecho con do...while ", num, suma);
		
		//while
		int i=1;
		//Reiniciamos la base acumuladora
		suma=0;
		while(i<=num) {
			//Primero sumo 1, luego 2, luego 3
			suma=suma+i;
			i++;
		}
		System.out.printf("%n%nLa suma de los %d primeros numeros %d," + "hecho con while", num, suma);
		
		//for
		
		for(int k=1;k<=num; k++) {
		
		}System.out.printf("%n%nLa suma de los %d primeros numeros %d," + "hecho con for", num, suma);
sc.close();
		
	}

}
