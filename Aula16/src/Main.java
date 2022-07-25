import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		/*
		 * Curso Udemy - Aula16, Exercicio de fixação, tipos primitivos , string, int,
		 * char, double, float
		 */
		// Jonas Valereo - Técnico em Informática

		// decalarando as variaveis tipo string, int, char, double, float

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		// imprimir saida de dados na class system

		System.out.println("Products:");
		System.out.printf("%s , which price is $ %.2f %n", product1, price1);
		System.out.printf("%s , which price is $ %.2f %n", product2, price2);
		System.out.println("");
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.println("");
		System.out.printf("Measue with eight decimal places: %.8f %n", measure);
		System.out.printf("Rouded (three decima places): %.8f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n", measure);
		
		// saida da aplicação na class system exit

		System.exit(0);
		
		// fim do programa

	}

}
