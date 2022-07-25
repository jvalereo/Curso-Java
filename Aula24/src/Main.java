import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula24, Calcule o valor da hipotenusa, tipo double
		//Jonas Valereo - T�cnico em Inform�tica
		
		//declarando as variaveis tipo double
		
		double catetoOposto, catetoAdjacente, hipotenusa;
		
		//declarando o codigo Locale
		
		Locale.setDefault(Locale.US);
		
		//declarando criar o objeto do tipo scanner
		
		Scanner result = new Scanner(System.in);
		
		System.out.println("Digite o cateto oposto: ");
		catetoOposto = result.nextDouble();
		System.out.println("Digite o catetto adjacenter: ");
		catetoAdjacente = result.nextDouble();
		
		//declarando a variaveis hipotenusa do triangulo retangulo
		
		hipotenusa = (Math.sqrt( Math.pow(catetoOposto, 2.0) + (Math.pow(catetoAdjacente, 2.0))));
		
		//imprimir saida de dados no console, concatena��o
		
		System.out.printf("O valor da hipotenusa = %.2f%n ", hipotenusa);
		
		//saida do objeto Scanner
		
		result.close();
		
		// saida da aplica��o na class system exit
		
		System.exit(0);
		
		//fim do programa

	}

}
