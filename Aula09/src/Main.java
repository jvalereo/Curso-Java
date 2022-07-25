import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula09, calcule a area do trapezio, tipo float
		//Jonas Valereo - Técnico em Informática 
		
		//declarando as variaveis tipo float
		
		float b, B, h, area;
		
		
		//declarando o comando Locale, formatação de localidade internacional
		
		Locale.setDefault(Locale.US);
		
		//declarano o objeto do tipo scanner, try
		
		try (Scanner valor = new Scanner(System.in)) {
			
			//declarando o codigo entrada de dado no console
			
			System.out.println("Digite a base menor: ");
			b = valor.nextFloat();
			System.out.println("Digite a base maior: ");
			B = valor.nextFloat();
			System.out.println("Digite a altura: ");
			h = valor.nextFloat();
			
			//saida do objeto Scanner
			
			valor.close();
			
		}
		
		//declarando a variavel area do trapezio
		
		area = (b + B) / 2 * h;
		
		//imprimir saida de dados no console, concatenação
		
		System.out.println("O Valor da area do trapezio = " + area);
		
		//saida da aplicação 
		
		System.exit(0);
		
		//fim do programa
		
	}

}
