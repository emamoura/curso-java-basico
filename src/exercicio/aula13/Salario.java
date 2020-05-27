package exercicio.aula13;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora: ");
		Double salarioHora = sc.nextDouble();
		System.out.println("Agora digite quantas horas você trabalhou no mês: ");
		int horas = sc.nextInt();
		
		Double salario = salarioHora * horas; 
		Double sindicato = salario * 0.05;
		Double inss = salario * 0.08;
		Double rendaImposto = salario * 0.11;
		Double descontos = sindicato + inss + rendaImposto;
		Double salarioLiquido = salario - descontos;
		
		System.out.println("O seu salário bruto para " + horas + " horas trabalhadas é: " + salario);
		System.out.println("O valor descontado pelo INSS foi " + inss);
		System.out.println("O valor descontado pelo Sindicato foi " + sindicato);
		System.out.println("O valor descontado pelo Imposto de Renda foi " + rendaImposto);
		System.out.println("O desconto total é de " + descontos);
		System.out.println("O salário líquido é " + salarioLiquido);
		
	}
}