import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula13, teste primitivos, tipo int, double
		//Jonas Valereo - T�cnico em Inform�tica
		
		//declarando as variaveis tipo int, double
		
		String x; 
		
		
		//declarando criar o objeto do tipo scanner
		
		try (Scanner resp = new Scanner(System.in)) {
			
			//declarando o codigo entrada de dado no console
			
			x = resp.next(); //declarando next sem quebra de linha
			
			//saida do objeto Scanner
			
			resp.close();
		}
		
		//imprimir saida de dados no console, concaten��o

		System.out.println("Resposta = " + x );
		
		
		//saida da aplica��o
		
		System.exit(0);
		
		//fim do programa

	}

}
