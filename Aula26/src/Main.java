import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Curso Udemy - Aula26 , calcule a media do aluno , tipo double
		// Jonas Valereo - T�cnico em Inform�tica

		// declarando as variaveis tipo double

		double portugues, matematica, fisica, ciencia, media;
		

		// declarando o codigo Locale

		Locale.setDefault(Locale.US);
		
		// declarando criar o objeto do tipo scanner

		Scanner result = new Scanner(System.in);
		
		System.out.println("Digite a nota de portugues: ");
		portugues = result.nextDouble();
		System.out.println("Digite a nota de matem�tica: ");
		matematica = result.nextDouble();
		System.out.println("Digite a nota de fisica: ");
		fisica = result.nextDouble();
		System.out.println("Digite a nota de ciencia: ");
		ciencia = result.nextDouble();
		
		//declarando a variavel media do aluno
		
		media = (portugues + matematica + fisica + ciencia) / 4;
		
		// imprimir saida de dados no console, concatena��o
		
		System.out.printf("A media do aluno = %.2f%n ", media);
		
		//declarando estrutura condicional composta
		
		if(media >= 7.0) {
			
			System.out.println("Parab�ns, Aluno Aprovado");
		}else {
			
			System.out.println("Infelizmente, Aluno Resprovado");
		}
		
		// saida do objeto Scanner
		
		result.close();
		
		// saida da aplica��o na class system exit
		
		System.exit(0);
		
		//fim do programa

	}

}
