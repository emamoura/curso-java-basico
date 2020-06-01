package exercicio.aula17;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma nota de 1 a 10: ");
		
		while (true) {
			int numero = sc.nextInt();
			
			if(numero <= 10 && numero >= 0) {
				System.out.println("O seu número é válido");
				break;
			}
			else {
				System.out.println("Digite o número novamente");
			}
		}
	}

}
