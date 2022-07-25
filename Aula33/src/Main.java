import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula32 , calcula a area e o preço do terreno, tipo primitivo double 
        //Jonas Valereo - Técnico em Informática
		
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
		System.out.println("Digite o preço do terreno: ");
		preco = resul.nextDouble();
		
		//declarando a variavel area do terreno 
		
		area = largura * comprimento;
		 
		//declarando a variavel preço do terreno 
		
		preco = area * preco;
		
		//imprimir saida de dados no console, concatenação
		
		System.out.println("Valor do Terreno: ");
		System.out.println();
		System.out.printf("Area do terreno %.2f%n", area);
		System.out.printf("Preço do terreno %.2f%n", preco);
		
		//saida do objeto Scanner
		
		resul.close();
		
		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa
		
	}

}
