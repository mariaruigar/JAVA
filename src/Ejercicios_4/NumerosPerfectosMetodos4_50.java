package Ejercicios_4;

import java.util.Scanner;

public class NumerosPerfectosMetodos4_50 {
	
	public static int sumaDivisoresPropios(int n) {
		int sumaDivisores=0;
		//Miramos hasta la mitad del numero
		for (int i=1; i<=n/2; i++) {
			//Si encuentro un divisor lo sumo
			if(n%i==0);
			sumaDivisores+=i;
		}
		return sumaDivisores;
	}
	
	public static boolean esPerfecto(int n) {
		if (sumaDivisoresPropios(n)==n)  {
			return true;
			
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número y te digo si es perfecto o no.");

		for(int i=2; i<10000; i++) {
			if(esPerfecto(i)) {
				System.out.println("El número: " + i + " es perfecto");
			}
	}	
sc.close();
	}

}
