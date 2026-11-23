import java.util.Scanner;

public class Piscina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PRECIO = 4.50;

		System.out.print("Edad: ");
		int edad = sc.nextInt();
		System.out.print("Numero de entradas: ");
		int entradas = sc.nextInt();

		String tipo;
		if (edad < 14) {
			tipo = "infantil";
		} else if (edad >= 65) {
			tipo = "senior";
		}

		double total = (entradas * PRECIO);
		double totalEntradas= total / 2;
		if (tipo.equals("infantil") || tipo.equals("senior")) {
			 
		}

		System.out.println("Tarifa: " + tipo);
		System.out.printf("Total: %.2f euros%n", totalEntradas);
		
		sc.close();
}

}