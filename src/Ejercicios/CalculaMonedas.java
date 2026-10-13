package Ejercicios;

import java.util.Scanner;

public class CalculaMonedas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Queremos saber cuantas monedas hay de cada tipo y la suma total de todas las monedas
		
		//Pedimos las monedas de cada tipo
		System.out.print("Monedas de 2$: ");
		int monedas2e=sc.nextInt();
		System.out.print("Monedas de 1$: ");
		int monedas1e=sc.nextInt();
		System.out.print("Monedas de 50 cents: ");
		int monedas50c=sc.nextInt();
		System.out.print("Monedas de 20 cents: ");
		int monedas20c=sc.nextInt();
		System.out.print("Monedas de 10 cents: ");
		int monedas10c=sc.nextInt();
		
		
		//Lo sumamos todo en centimos
		int totalCentimos= (monedas2e * 200) + (monedas1e * 100) + (monedas50c * 50) + (monedas20c * 20) + (monedas10c * 10);
		
		//Una vez tenenmos todos los centimos lo dividimos en euros
		int euros= totalCentimos / 100;
		int centimos= totalCentimos % 100;
		
		System.out.printf("%d euros %d centimos", euros, centimos);
		
		

		
	
		
		
		
		sc.close();

	}

}
