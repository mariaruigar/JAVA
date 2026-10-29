package EjerciciosBucles;

import java.util.Random;

public class dados_3_61 {

	public static void main(String[] args) {
		Random aleatorio= new Random();
	//	System.out.println("Lanzamiento de dados (1 al 6)");
		int numLanzamientos=100;
		int numSietes=0;
		
		//Tiramos dos dados de 6 caras cada uno, utilizamos el bucle for
		for(int i= 1; i<=numLanzamientos; i++) {
			//aleatorio next.int(6), genera numeros del 0 al 5
			//Si le sumamos 1, conseguimos numeros del 1 al 6.
			
			int dado1= aleatorio.nextInt(6)+1;
			int dado2=aleatorio.nextInt(6)+1;
			int suma=dado1 + dado2;
			if (suma==7) {
				numSietes++;
			}
			}
			//System.out.printf("%n Lanzo los dados, sale %d y %d, y juntos suman %d", dado1, dado2, suma); PARA VER COMO FUNCIONA
			System.out.println("Han salido " + numSietes + " sietes");
			System.out.printf(" Eso significa que han salido un %.2f%% de las veces ", (double)numSietes/numLanzamientos*100);
	

}
}