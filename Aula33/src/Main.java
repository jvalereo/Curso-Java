import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula32 , calcula a area e o pre�o do terreno, tipo primitivo double 
        //Jonas Valereo - T�cnico em Inform�tica
		
		//declarando as variaveis tipo double
		
		double largura;
		double comprimento;
		double preco;
		double area;
		
		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);
		
		//declarando criar o objeto do tipo scanner
		
		Scanner resul = new Scanner(System.in);
		
		System.out.println("Digite o valor da largura: ");
		largura = resul.nextDouble();
		System.out.println("Digite o valor do comprimento");
		comprimento = resul.nextDouble();
		System.out.println("Digite o pre�o do terreno: ");
		preco = resul.nextDouble();
		
		//declarando a variavel area do terreno 
		
		area = largura * comprimento;
		 
		//declarando a variavel pre�o do terreno 
		
		preco = area * preco;
		
		//imprimir saida de dados no console, concatena��o
		
		System.out.println("Valor do Terreno: ");
		System.out.println();
		System.out.printf("Area do terreno %.2f%n", area);
		System.out.printf("Pre�o do terreno %.2f%n", preco);
		
		//saida do objeto Scanner
		
		resul.close();
		
		// saida da aplica��o na class system exit
		
		System.exit(0);
		
		//fim do programa
		
	}

}
