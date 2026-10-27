package EjerciciosBucles;

import java.util.Random;

public class dados_3_61 {

	public static void main(String[] args) {
		Random aleatorio= new Random();
		System.out.println("Lanzamiento de dados (1 al 6)");
		//Tiramos dos dados de 6 caras cada uno, utilizamos el bucle for
		for(int i= 1; i<=2; i++) {
			//aleatorio next.int(6), genera numeros del 0 al 5
			//Si le sumamos 1, conseguimos numeros del 1 al 6.
			int dado= aleatorio.nextInt(6) + 1;
			
			System.out.println("Tirada " + i + " ha salido " + dado);
			
	}

}
}