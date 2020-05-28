package exercicio.aula15;
import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("É o maior número: " + num1);
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println("É o maior número: " + num2);
		}
		else {
			System.out.println("É o maior número: " + num3);
		}
	}

}
