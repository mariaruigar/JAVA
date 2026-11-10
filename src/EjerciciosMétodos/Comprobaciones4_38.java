package EjerciciosMétodos;

import java.util.Scanner;

public class Comprobaciones4_38 {
	
	public static boolean esPar(int numero) {
		if (numero%2==0) {
					return true;
		}else {
					return false;
				}
	}
	
	public static boolean esPositivo(int numero) {
		if (numero>=0) {
					return true;
							
				}else {
					return false;
				}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Dame dos numeros: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
				
			System.out.println("El número " + a + " es" + ((esPar(a)) ? "par" : "impar"));	
				
			System.out.println("El número "+ a + " es" + ((esPositivo(a))? "positivo" : "impar"));	
				
				if (a%b==0 || b%a==0) {
					System.out.print(a + "y" + b + " son múltiplos");
				}else {
					System.out.print(a + "y" + b + " no son múltiplos.");
				}
			}

		}

	


