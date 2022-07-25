import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Curso Udemy - Aula30, calcule a media ponderada do aluno, tipo double
		// Encadeamento estrutural condicional composta
		// Jonas Valereo - Técnico em Informática

		// declarando as variaveis tipo double

		double nota1, nota2, nota3, nota4, media;
		double peso1, peso2, peso3, peso4, soma;
		

		// declarando o codigo Locale

		Locale.setDefault(Locale.US);
		
		// declarando as variaveis peso das notas

		peso1 = 6.0;
		peso2 = 7.0;
		peso3 = 5.5;
		peso4 = 5.0;
		
		// declarando criar o objeto do tipo scanner

		Scanner pond = new Scanner(System.in);

		System.out.println("Digite a nota de portugues: ");
		nota1 = pond.nextDouble();
		System.out.println("Digite a nota de matemática: ");
		nota2 = pond.nextDouble();
		System.out.println("Digite a nota de física: ");
		nota3 = pond.nextDouble();
		System.out.println("Digite a nota de ciência: ");
		nota4 = pond.nextDouble();
		
		//declarando a variavel soma de todos os pesos
		
		soma = (peso1 +  peso2 + peso3 + peso4);
		
		//declarando a variavel media ponderada do aluno
		
		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 + nota4 * peso4) / soma;
		
		//imprimir saida de dados no console, concatenação
		
		System.out.printf("A media ponderado do aluno  = %.2f%n ", media);
		
		//declarando encadeamento estrutural condicional composta
		
		if(media >= 7.0) {
			
			System.out.println("Parabéns, aluno aprovado");
			
		}else {
			
			if(media >= 4.0) {
				
				System.out.println("Aténção, aluno em recuperação");
				
			}else {
				
				System.out.println("Infelizmente, aluno reprovado");
				
			}
		}

		//saida do objeto Scanner
		
		pond.close();
		
		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa
		
	}

}
