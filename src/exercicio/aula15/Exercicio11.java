package exercicio.aula15;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário atual: ");
		
		double salario = sc.nextDouble();
		double percentual = 0;
		double valorAumento = 0;
		double novoSalario = 0;
		
		if(salario <= 280) {
			percentual = 0.2;
			valorAumento = salario * percentual;
			novoSalario = salario + valorAumento;
		}
		else if(salario <= 700) {
			percentual = 0.15;
			valorAumento = salario * percentual;
			novoSalario = salario + valorAumento;
		}
		else if(salario <= 1500) {
			percentual = 0.1;
			valorAumento = salario * percentual;
			novoSalario = salario + valorAumento;
		}
		else {
			percentual = 0.5;
			valorAumento = salario * percentual;
			novoSalario = salario + valorAumento;
		}
		
		System.out.println("O seu salário era: R$" + salario);
		System.out.println("O percentual do aumento foi: " + percentual * 100 + "%");
		System.out.println("O valor do aumento foi: R$" + valorAumento);
		System.out.println("O seu novo salário é: R$" + novoSalario);
	}

}
