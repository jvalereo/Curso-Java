import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		// TODO Curso Udemy - Aula02, tipos primitivos, string, int, double
		//Jonas Valereo - Técnico em Informática
		
		//declarando as variaveis tipo, string int, double
		
		
		int y = 32;
		double x = 10.35784;
		String infor = "Bom dia!!!";
		String nome = "Rafael";
		int idade = 43;
		double renda = 4000.0;
		
		//imprimir saida de dados na class system, concatenação
		
		System.out.println(infor);
		System.out.println(y);
		Locale.setDefault(Locale.US);//localizacao de formatacao local
		System.out.printf("%.2f%n", x); //formatacao com 2 casas decimais
		System.out.printf("%.4f%n", x); //formatacao com 4 casas decimais
		System.out.println("Resultado = " + x + " Metros");//formatacao com contenacao
		System.out.printf("Resultado = %.2f Metros%n", x  ); //formatacao com varios elementos no mesmo comando
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //formatacao com varios elementos no mesmo comando
		
		//saida da aplicação na class system exit
		
		System.exit(0);
		
		//fim do programa
		
	}

}
