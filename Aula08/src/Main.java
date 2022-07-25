import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula08, calcule a area do trapezio, tipo double
		//Jonas Valereo  - Técnico em Informática
		
		//declarando as variaveis tipo double
		
		double b, B, h, area;
		
		
		//declarando o comando Locale, formatação de localidade internacional
		
		Locale.setDefault(Locale.US);
		
		//declarando o objeto do tipo scanner, try
		
		try (Scanner vet = new Scanner(System.in)) {
			
			//declarando o codigo entrada de dado no console
			
			System.out.println("Digite a base menor: ");
			b = vet.nextDouble();
			System.out.println("Digite a base maior: ");
			B = vet.nextDouble();
			System.out.println("Digite a altura: ");
			h = vet.nextDouble();
			
			//saida do objeto Scanner
			
			vet.close();
			
		}
	
		//declarando a variavel area do trapezio
		
		area = (b + B ) / 2 * h;
		
		//imprimir saida de dados no console, concatenação
		
	     System.out.println("O valor da area do trapezio = " + area);
	     
	     //saida da aplicação
	     
	     System.exit(0);
	     
	     //fim do programa
	}

}
