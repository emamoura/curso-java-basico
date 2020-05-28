package exercicio.aula15;
import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número, um operador e outro número: ");
		int num1 = sc.nextInt();
		String operador = sc.nextLine();
		operador = sc.nextLine();
		int num2 = sc.nextInt();
	
		boolean sinal = true;
		double operacao = 0;
		//Calculos
		if(operador.equals("+")) {
			operacao = num1 + num2;
		}
		else if(operador.equals("-")) {
			operacao = num1 - num2;
		}
		else if(operador.equals("*")) {
			operacao = num1 * num2;
		}
		else if(operador.equals("/")) {
			if(num2 != 0) {
				operacao = num1 / num2;
			}
			else {
				System.out.println("Não se pode dividir um número por zero");
				sinal = false;
			}
		}
		else {
			System.out.println("Operador inválido");
			sinal = false;
		}
		
		//Verifica se é par ou ímpar
		if(sinal != false) {
			if(operacao % 2 == 0 && operacao > 0) {
				System.out.println("O resultado é " + operacao + ". O número é par e positivo");
			}
			else if(operacao % 2 == 0 && operacao < 0) {
				System.out.println("O resultado é " + operacao + ". O número é par e negativo");
			}
			else if(operacao > 0) {
				System.out.println("O resultado é " + operacao + ". O número é ímpar e positivo");
			}
			else if(operacao < 0) {
				System.out.println("O resultado é " + operacao + ". O número é ímpar e positivo");
			}
			else {
				System.out.println("O resultado é " + operacao + ". O número é par");
			}
		}
		
	}

}
