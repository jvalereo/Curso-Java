import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula36, calcula area do terreno e valor, tipo double
	    //Jonas Valereo - T�cnico em Inform�tica
		
		//declarando as variaveis tipo double
		
		double largura, comprimento;
		double area, preco, resultado;
		
		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);
		
		//declarando criar o objeto resul do tipo scanner
		
		Scanner resul = new Scanner(System.in);
		
		//declarando o codigo entrada de dado no console, m�todo netxDouble
		
		System.out.println("Digite a largura: ");
		largura = resul.nextDouble();
		System.out.println("Digite o comprimento: ");
		comprimento = resul.nextDouble();
		System.out.println("Digite o pre�o do terreno: ");
		preco = resul.nextDouble();
		
		//declarando a variavel area do terreno
		
		area = largura * comprimento;
		
		//declarando a variavel resultado do terreno
		
		resultado = area * preco;
		
		//imprimir saida de dados na class system, concatena��o
		
		System.out.printf("O valor do terreno:  %.2f%n", area);
		System.out.printf("O valor do terreno:   %.2f%n", resultado);
		
		//saida do objeto Scanner
		
		resul.close();
		
		// saida da aplica��o na class system exit
		
		System.exit(0);
		
		//fim do programa
		
	}

}
