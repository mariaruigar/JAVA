package EjerciciosMétodos;

public class Palidromo5_36 {

	public static boolean esPalindromo(String cadena) {
		for(int i=0; i<cadena.length()/2;i++) {
			//Vamos comparando los pares de caracteres
			if(cadena.charAt(i)!=cadena.charAt(cadena.length()-(1+i))) {
				//Si entro aqui no es palindromo
				return false;
	}
	
		}
	}
	
	public static void main(String[] args) {
		String palindromo= "Anita lava la tina";
		String palindromoSaneado=palindromo.toLowerCase().replaceAll(" ", "");
		
		//Aqui sabemos si es o no palindromo
		if(esPalindromo(palindromoSaneado)) {
			System.out.println("Es palindromo");
			
		}else {
			System.out.println("No es palindromo");
		}
		
		
		
			}
			
		

	

}
