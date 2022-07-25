import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula27, calcule a media ponderada do aluno, tipo double
		//Jonas Valereo - Técnico em Informática 
		
		//declarando as variaveis tipo double
		
		double nota1, nota2, nota3, nota4 , media;
		double peso1, peso2, peso3, peso4, soma;

		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);
		
		//declarando a notas dos pesos
		
		peso1 = 7.5;
		peso2 = 6.0;
		peso3 = 6.0;
		peso4 = 5.9;
		
		//declarando criar o objeto do tipo scanner
		
		Scanner pond = new Scanner(System.in);
		
		System.out.println("Digite a nota de portugues: ");
		nota1 = pond.nextDouble();
		System.out.println("Digite a nota de matemática: ");
		nota2 = pond.nextDouble();
		System.out.println("Digite a nota de fisica: ");
		nota3 = pond.nextDouble();
		System.out.println("Digite a nota de ciencia: ");
		nota4 = pond.nextDouble();
		
		//declarando a soma dos pesos
		
		soma = peso1 + peso2 +peso3 + peso4;
		
		//declarando a variaveis da media ponderada do aluno
		
		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 + nota4 * peso4) / soma;
	
		//imprimir saida de dados no console, concatenação
         
		System.out.printf("A media ponderada do aluno = %.2f%n", media);
		
		//saida do objeto Scanner
		
		pond.close();
		
		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa
		
	}

}
