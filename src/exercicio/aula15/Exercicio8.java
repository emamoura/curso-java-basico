package exercicio.aula15;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço dos três produtos: ");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("O menor preço é: " + num1);
		}
		else if(num2 <= num1 && num2 <= num3) {
			System.out.println("O menor preço é: " + num2);
		}
		else {
			System.out.println("O menor preço é: " + num3);
		}
		sc.close();
	}

}
