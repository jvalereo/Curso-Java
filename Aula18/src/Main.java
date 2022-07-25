import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Curso Udemy - Aula18, Calcule a area do quadrado, tipo double
		// Jonas Valereo - Técnico em Informática

		// declarando as variaveis tipo double

		double base, altura, area;

		// declarando o codigo Locale

		Locale.setDefault(Locale.US);

		// declarando codigo criar objeto tipo scanner

		Scanner resul = new Scanner(System.in);

		System.out.println("Digite base: ");
		base = resul.nextDouble();
		System.out.println("Digite altura: ");
		altura = resul.nextDouble();

		// declarando o codigo area do quadrado

		area = base * altura;

		// imprimir saida de dados no console, concatenação

		System.out.printf("A area do quadrado = %.2f%n", area);

		// saida do objeto Scanner

		resul.close();

		// saida da aplicação na class system exit

		System.exit(0);

		// fim do programa

	}

}
