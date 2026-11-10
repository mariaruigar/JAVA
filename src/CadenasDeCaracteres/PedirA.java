package CadenasDeCaracteres;

import java.util.Scanner;

public class PedirA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra =sc.next();
		for (int i=0; i<=letra.length(); i++) {
			char caracter=letra.charAt(i);
			System.out.println(caracter);
			
		}
		

	}

}
