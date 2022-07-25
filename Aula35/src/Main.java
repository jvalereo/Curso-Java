import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula35, programa par ler nomes, tipo string, double
		//Jonas Valereo - Técnico em Informática
		
		//declarando as variaveis tipo stirng, double
		
		String nome1, nome2;
		double idade1, idade2, media;
		
		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);

		//declarando criar o objeto do tipo scanner
		
		Scanner resul = new Scanner(System.in);

	    //declarando o codigo entrada de dado no console, método ReadLine
		
		System.out.println("Digite o 1 nome: ");
		nome1 = resul.next();
		System.out.println("Digite a 1 idade: ");
		idade1 = resul.nextDouble();
		resul.nextLine();
		System.out.println("Digite o 2 nome: ");
		nome2 = resul.nextLine();
		System.out.println("Digite a 2 idade: ");
		idade2 = resul.nextDouble();
		
		//declarando a variavel media das idades;
		
		media = (idade1 + idade2) / 2;
		
		//imprimir saida de dados na class system, concatenação
        System.out.println("Resutlado:");
		System.out.printf("Nome1  = %s, sua idade é %.2f anos%n",nome1, idade1);
		System.out.printf("Nome2 =  %s, sua idade é %.2f anos%n",nome2, idade2);
		System.out.printf("Media entre idade1 e idade2  = %.2f anos%n ", media);
		
		//saida do objeto Scanner
		
		resul.close();
		
		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa

	}

}
