package Ejercicios;

import java.util.Scanner;

public class SegundosHms {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Pedimos los segundos al usuario
		System.out.print("Dime los segundos y te digo cuantas horas minutos y segundos son: ");
		int tiempo = sc.nextInt();
		//Pasamos los segundos a minutos, y después pasamos los minutos a horas y mostramos hh/mm/ss
		int minutos= tiempo / 60;
		int segundos= tiempo % 60;
		
		
		//Pasamos los minutos a horas
		int horas= minutos / 60;
		minutos= minutos % 60;
		
	
		System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
		sc.close();
		
	}

	
}
