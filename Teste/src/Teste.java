import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String nome;
		String sobrenome;
		int idade;
		double peso;
		String cidade;
		
		Locale.setDefault(Locale.US);
		
		Scanner resul = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = resul.next();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = resul.next();
		System.out.println("Digite sua idade: ");
		idade = resul.nextInt();
		System.out.println("Digite seu peso: ");
		peso = resul.nextDouble();
		System.out.println("Digite seu cidade: ");
		cidade = resul.next();
		
        System.out.printf("Seu nome: %s%n", nome);
        System.out.printf("Seu sobrenome: %s%n", sobrenome);
        System.out.printf("Seu idade: %d%n", idade);
        System.out.printf("Seu peso: %.2f%n", peso);
        System.out.printf("Seu sua cidade: %s%n ", cidade);
		
		
		resul.close();
		
		System.exit(0);

	}

}
