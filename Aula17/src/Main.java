import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula17, Calcule a area do trapezio, tipo double
		//Jonas Valereo - Técnico em Informática 
		
		//declarando as variaveis tipo double
		
		double b, B, h, area;
		
		
		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);
		
		//declarando cria o objeto do tipo scanner
		
		Scanner resul = new Scanner(System.in);
		
		System.out.println("Digite a base menor: ");
		b = resul.nextDouble();
		System.out.println("Digite a base maior: ");
		B = resul.nextDouble();
		System.out.println("Digite a altura: ");
		h = resul.nextDouble();
		
		//declarando a variavel area do trapezio
		
		area = (b + B) / 2.0 * h;
		
		//imprimir saida de dados no console, concatenação
		
		System.out.printf("O valor da area %.2f%n", area);
		
		//saida do objeto Scanner
		
		resul.close();

		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa

	}

}
