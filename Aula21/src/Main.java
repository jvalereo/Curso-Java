import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula21, Calcule a area da circunferencia , tipo double
		//Jonas Valereo - Técnico em Informática
		
		//declarando as variaveis tipo double
		
		double pi, raio, area;
		
		
		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);
		
		//declarando criar o objeto do tipo scanner
		
		Scanner result = new Scanner(System.in);
		
		System.out.println("Digite o valor do pi: ");
		pi = result.nextDouble();
		System.out.println("Digite o valor do raio: ");
		raio = result.nextDouble();
		
		//declarando a variavel area da circunferencia
		
		area = pi * Math.pow(raio, 2.0);
		
		//imprimir saida de dados no console, concatenação
		
		System.out.printf("A area da circunferencia = %.2f%n ", area);
		
		//saida do objeto Scanner
		
		result.close();
		
		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa 
		
	}

}
