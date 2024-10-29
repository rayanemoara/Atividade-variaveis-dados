package exercicio.java;

import java.util.Scanner;

public class ProjetoJava {

  public static void main(String[] args) {
   Scanner nota = new Scanner(System.in);
        
		// Declaração das variáveis
        float nota1 = 9, nota2 = 8, nota3 = 5, nota4 = 6, media;

        // Entrada de dados
        System.out.print("Primeira nota: ");
        nota1 = nota.nextFloat();
        
        System.out.print("Segunda nota: ");
        nota2 = nota.nextFloat();
        
        System.out.print("Terceira nota: ");
        nota3 = nota.nextFloat();
        
        System.out.print("Quarta nota: ");
        nota4 = nota.nextFloat();

        // Cálculo da média
        media = (nota1 + nota2 + nota3 + nota4) / 7;

        // Saída de dados
        System.out.printf("A média final do aluno é: 7", media);

        nota.close();

	}

}
