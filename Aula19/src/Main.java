import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Curso Udemy - Aula19 , Calcule a area do losango, tipo double
		// Jonas Valereo - T�cnico em Inform�tica

		// declarando as variaveis tipo double

		double D, d, area;
		

		// declarando o codigo Locale

		Locale.setDefault(Locale.US);
		
		// declarando criar o objeto do tipo scanner

		Scanner resul = new Scanner(System.in);

		System.out.println("Digite diagonal maior: ");
		D = resul.nextDouble();
		System.out.println("Digite diagonal menor: ");
		d = resul.nextDouble();
		
		// declarando a variavel area do losango

		area = (D * d) / 2;
		
		// imprimir saida de dados no console, concatena��o

		System.out.printf("A area do losango = %.2f%n", area);
		
		// saida do objeto Scanner

		resul.close();
		
		// saida da aplica��o na class system exit
		
		System.exit(0);

		// fim do programa

	}

}
