package exercicio.aula13;
import java.util.Scanner;

public class Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu peso e mostrarei o seu peso ideal: ");
		Double altura = sc.nextDouble();
		
		Double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é:  " + pesoIdeal);
	}

}
