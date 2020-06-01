package exercicio.aula17;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double maior = 0;
		for(int i = 0; i < 5; i++) {
			double numero = sc.nextDouble();
			if(numero >= maior) {
				maior = numero;
			}
		}
		System.out.println("O maior número digitado foi: " + maior);
		sc.close();
	}
	
}
