package exercicio.java;

import java.util.Scanner;

public class ProjetoJava2 {

	public static void main(String[] args) {
		Scanner salario = new Scanner(System.in);
		
		// Entrada de dados
		System.out.print("Salário Bruto: R$");
		
		float salarioBruto = salario.nextFloat();
		
		System.out.print("Adicional Noturno: R$");
		
		float adicionalNoturno = salario.nextFloat();
		
		System.out.print("Horas Extras: ");
		
		float horasExtras = salario.nextFloat();
		
		System.out.print("Descontos: R$");
		
		float descontos = salario.nextFloat();
		
		// Cálculo do salário líquido
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		// Saída do resultado
		System.out.println("\nSalário Líquido: R$" + salarioLiquido);
		
		salario.close();

	}

}
