package exercicio.aula13;
import java.util.Scanner;

public class Bimestrais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double soma = 0.0;
		System.out.println("Digite quatro notas bimestrais: ");
		for(int i = 0; i < 4; i++) {
			Double numero = sc.nextDouble();
			soma += numero;
		}
		Double media = soma / 4;
		
		System.out.println("A sua média é igual a: " + media);
	}
}
