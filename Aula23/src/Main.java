import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula23, Calcule a area do triangulo, tipo double
		//Jonas Valereo - Técnico em Informática
		
		//declarando as variaveis tipo double
		
		double b, h, area;

		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);
		
		//declarando criar o objeto do tipo scanner
		
		Scanner result = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		b = result.nextDouble();
		System.out.println("Digite a altura: ");
		h = result.nextDouble();
		
		//declarando a variavel area do triangulo
		
		area = (b * h) / 2;
		
		//imprimir saida de dados no console, concatenação
		
		System.out.printf("A area do triangulo = %.2f%n", area);
		
		//saida do objeto Scanner
		
		result.close();
		
		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa
	}

}
