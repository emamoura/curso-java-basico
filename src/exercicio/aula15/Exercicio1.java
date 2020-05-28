package exercicio.aula15;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números:");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O número " + num1 + " é maior que o número " + num2 +".");
		}
		else {
			System.out.println("O número " + num2 + " é maior que o número " + num1 + ".");
		}
	}

}
