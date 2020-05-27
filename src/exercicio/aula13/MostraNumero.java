package exercicio.aula13;
import java.util.Scanner;

public class MostraNumero {

	public static void main(String[] args) {
		
		System.out.println("Digite um número qualquer: ");
		
		Scanner sc = new Scanner(System.in);
		float numero = sc.nextFloat();
		
		System.out.println("O número digitado foi: " + numero);
	}

}
