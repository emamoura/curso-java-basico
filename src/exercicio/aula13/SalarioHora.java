package exercicio.aula13;
import java.util.Scanner;

public class SalarioHora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora: ");
		Double salario = sc.nextDouble();
		System.out.println("Agora digite quantas horas você trabalhou no mês: ");
		int horas = sc.nextInt();

		System.out.println("O seu salário para " + horas + " trabalhadas é: " + salario * horas);
	}
}
