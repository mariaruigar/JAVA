package Ejercicios_1;

import java.util.Scanner;

public class ConversorDolarEuro1_39 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Dame una cantidad en euros y te lo convierto a doláres");
		double euro=sc.nextDouble();
		double dolares= euro*0.86;
		System.out.printf(euro + " € " + " son " + dolares + " $%.2f%n");
		

	}

}
