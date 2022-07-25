import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula34, Calcucule area do retangulo , tipo double,
		//Jonas Valereo - Técnico em Informatica
		
		//declarando as variaveis tipo double
		
		double b, h;
		double area, perimetro, diagonal;

		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);

		//declarando criar o objeto do tipo scanner
		
		Scanner resul = new Scanner(System.in);
		
	    //declarando o codigo entrada de dado no console, método ReadLine
      
		b = resul.nextDouble();
		h = resul.nextDouble();
		
		//declarando a variavel  area do quadrado
		
		area = b * h;
		
		//declarando a variavel perimetro do quadrado
		
		perimetro = 2.0 * (b + h);
		
		//declarando a varivel diagonal do quadrado
		
		diagonal = Math.sqrt(Math.pow(b, 2.0) + Math.pow(h, 2.0));
		
		//imprimir saida de dados na class system, concatenação
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		//saida do objeto Scanner
		
		resul.close();

		// saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa
		
	}

}
