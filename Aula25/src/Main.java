import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula25, calcule a media do aluno, tipo double
		//Jonas Valereo - Téncico em Informática 
		
		//declarando as variaveis tipo double
		
		double portugues, matematica, fisica, ciencia, media;
		
		
		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);
		
		//declarando criar o objeto do tipo scanner
		
		Scanner resul = new Scanner(System.in);
		
		System.out.println("Digite a nota de portugues: ");
		portugues = resul.nextDouble();
		System.out.println("Digite a nota de matemática: ");
		matematica = resul.nextDouble();
		System.out.println("Digite a nota de fisica: ");
		fisica = resul.nextDouble();
		System.out.println("Digite a nota de ciencia: ");
		ciencia = resul.nextDouble();
		
		//declarando a variavel media do aluno 
		
		media = (portugues + matematica + fisica + ciencia) / 4;
		
		//imprimir saida de dados no console, concatenação
		
		System.out.printf("A media do aluno = %.2f%n", media);
		
		//saida do objeto Scanner
		
		resul.close();
		
		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa

	}

}
