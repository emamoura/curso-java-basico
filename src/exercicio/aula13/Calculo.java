package exercicio.aula13;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números, sendo dois inteiros e um real: ");
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		Double numero3 = sc.nextDouble();
		
		int situacao1 = (2 * numero1) * (numero2 / 2);
		Double situacao2 = (3 * numero1) + numero3;
		Double situacao3 = Math.pow(numero3, 3);
		
		System.out.println("Situação 1: " + situacao1);
		System.out.println("Situação 2: " + situacao2);
		System.out.println("Situação 3: " + situacao3);
		
	}

}
