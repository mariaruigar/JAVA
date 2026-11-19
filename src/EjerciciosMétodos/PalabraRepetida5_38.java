package EjerciciosMétodos;

public class PalabraRepetida5_38 {

	
	public static boolean esRepetido(String cadena) {
		for(int i=0; i<cadena.length();i++) {
			//EL bucle de dentro compara la letra con todas las siguientes
			//Por eso sumamos el 1
		
			for(int j=i+1; j<cadena.length(); j++){
				if(cadena.charAt(i)==cadena.charAt(j)) {
					System.out.println("Hay una letra repetida, la " + cadena.charAt(j));
				}else {
					return false;
				}
					return true;
				
				
			}
			
		}
	
	
	}
	public static void main(String[] args) {
		String repetido= "PROGRAMA";
		
		if(esRepetido(repetido)) {
			System.out.println("Esta repetido");
			
		}else {
			System.out.println("No está repetido");
		}
		
		
		
		

	}

}
