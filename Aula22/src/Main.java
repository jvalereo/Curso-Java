import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Curso Udemy - Aula22, Calcule area do terreno, tipo double
		// Jonas Valereo - Técnico em Informática

		// declarando as variavies tipo double

		double comprimento, largura, preco, area, total;
		

		// declarando o codigo Locale

		Locale.setDefault(Locale.US);
		
		// declarando criar o objeto do tipo scanner

		Scanner result = new Scanner(System.in);

		System.out.println("Digite o comprimento: ");
		comprimento = result.nextDouble();
		System.out.println("Digite a largura: ");
		largura = result.nextDouble();
		System.out.println("Digite o preço do terreno: ");
		preco = result.nextDouble();
		
		// declarando a variavel area do terreno

		area = comprimento * largura;
		
		// declarando a variavel total do terreno

		total = (area * preco);
		
		// imprimir saida de dados no console, concatenação

		System.out.printf("A area do terreno = %.2f%n", area);
		System.out.printf("O valor total do terreno = %.2f%n", total);
		
		// saida do objeto Scanner

		result.close();
		
		// saida da aplicação na class system exit

		System.exit(0);
		
		// fim do programa

	}

}
