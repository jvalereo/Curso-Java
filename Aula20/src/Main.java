import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula20, Calcule a area do paralelogramo, tipo duble
		//Jonas Valereo - Técnico em Informática
		
		//declarando as variaveis tipo double
		
		double base, altura, area;
		
		
		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);
		
		//declarando criar o objeto do tipo scanner
		
		Scanner result = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		base = result.nextDouble();
		System.out.println("Digite a altura: ");
		altura = result.nextDouble();
		
		//declarando a variavel area do paralelogramo
		
		area = base * altura;
		
		//imprimir saida de dados no console, concatenação
		
		System.out.printf("A area do paralelogramo = %.2f%n", area);
		
		//saida do objeto Scanner
		
		result.close();
		
		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa
	}

}
