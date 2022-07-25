import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Curso Udemy - Aula29, calcule a media do aluno, tipo double
		//Encadeamento de estrutura condicional composta
		//Jonas Valereo -  Técnico em Informática
		
		
		//declarando as variaveis tipo double
		
		double portugues, matematica, fisica, ciencia, media;
		
		//declarando o codigo Locale 
		
		Locale.setDefault(Locale.US);
		
		//declarando criar o objeto do tipo scanner
		
        Scanner result = new Scanner(System.in);
        
        System.out.println("Digite a nota de portugues: ");
        portugues = result.nextDouble();
        System.out.println("Digite a nota de matemática: ");
        matematica = result.nextDouble();
        System.out.println("Digite a nota de física: ");
        fisica = result.nextDouble();
        System.out.println("Digite a nota de ciência: ");
        ciencia = result.nextDouble();
        
        //declarando a variavel media do aluno
        
        media = (portugues + matematica + fisica + ciencia) / 4;
        
       //imprimir saida de dados no console, concatenação
        
        System.out.printf("A media do aluno = %.2f%n ", media);
        
      //declarando encadeamento estrutural condicional composta
        
      if(media >= 7.0) {
    	  
    	  System.out.println("Parabéns, Aluno Aprovado");
    	  
      }else {
    	  
    	  if(media >= 5.0) {
    		  
    		  System.out.println("Atenção, Aluno em Recuperação");
    		  
    	  }else {
    		  
    		  System.out.println("Infelizmente, Aluno Reprovado");
    		  
    	  }
      }

      //saida do objeto Scanner
      
      result.close();
      
      // saida da aplicação na class system exit
        
      System.exit(0);
      
      //fim do programa
      
	}

}
