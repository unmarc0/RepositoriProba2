package futbol;

import java.util.Scanner;

public class Conversio {

	public static void main(String[] args) {


		
		//Inicializamos classe scanner
		Scanner teclado = new Scanner(System.in);
		//Variables
		

		String resultat;
		
		String caracter= "";
		char opcio = 'A';
		
		
		
		
		String preguntaeuros = "Cuantos euros desea convertir?";
		String conversiontext = "Escriba 'A' si desea convertir a DOLARES\nEscriba 'B' si desea convertir a LIBRAS";

		
		//Elegir opción
	
		System.out.println(preguntaeuros);
		double euros = teclado.nextDouble();
		 
		 //Variables conversoras
		double eurodolarC = (euros * 1.18);
		double eurolibraC = (euros * 0.9);
		
		//Imprimimnos syso explicando lo que se debe hacer, introducir 'A' o 'B'
		System.out.println(conversiontext);
		caracter = teclado.next();
			
		//Convertimos string a char.
		
		char resposta = caracter.charAt(0);
		System.out.println(resposta);
		
		//Comparamos si ha salido A o B
		
		resultat = (resposta==opcio)? "El resultat en dolars es de " + eurodolarC : "El resultat en libres es de " + eurolibraC;
		System.out.println(resultat);	
		
	}

}





