

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula32 , Equa��o do 2� graus, tipos primitivos double
		//Jonas Valereo - T�cnico em Inform�tica 
		
		//declarando as variaveis tipos double 
		
		double a = 1;
		double b = 4;
		double c = 3;
		double delta;
		double x1;
		double x2;
		
		//declarando o codigo do delta
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		//declarando os discriminates da equa��o do 2� grau
		
		x1 = (-b + Math.pow(delta, 2.0) / (2.0 * a));
		x2 = (-b - Math.pow(delta, 2.0) / ( 2.0  * a));		
		
		//imprimir saida de dados no console, concatena��o
		
		System.out.println("Resultado da equa��o: ");
		System.out.println();
		System.out.println("Valor de x1 =" + x1);
	    System.out.println("valor de x2 = " + x2);
	    
	   // saida da aplica��o na class system exit
	    
	    System.exit(0);
	    
	    //fim do programa
	    
	}

}
