package exercicio.aula15;
import java.util.Scanner;

public class Exercício12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qual o seu salário/hora: ");
		double salarioHora = sc.nextDouble();
		System.out.println("Digite quantas horas você trabalhou: ");
		int hora = sc.nextInt();
		
		double salarioBruto = hora * salarioHora;
		double fgts = salarioBruto * 0.11;
		double inss = salarioBruto * 0.1;
		double ir = 0;
		double percentual = 0;
		if(salarioBruto <= 900) {
			percentual = 0;
			ir = 0;
		}
		else if(salarioBruto <= 1500) {
			percentual = 0.05;
			ir = salarioBruto * percentual;
		}
		else if(salarioBruto <= 2500) {
			percentual = 0.1;
			ir = salarioBruto * percentual;
		}
		else {
			percentual = 0.2;
			ir = salarioBruto * percentual;

		}
		
		double totalDescontos = inss + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário Bruto: (" + salarioHora + " * "+ hora +")                            : R$ " +salarioBruto);
		System.out.println("(-) IR ("+ (percentual * 100) +"%):                                        : R$ " +ir);
		System.out.println("(-) INSS (10%):                                       : R$ " +inss);
		System.out.println("FGTS (11%):                                           : R$ " +fgts);
		System.out.println("Total de descontos:                                   : R$ " +totalDescontos);
		System.out.println("Salário Líquido:                                      : R$ " +salarioLiquido);
		
	}
}
