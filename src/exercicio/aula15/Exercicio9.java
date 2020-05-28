package exercicio.aula15;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		double[] numeros = {num1, num2, num3};
		
		Arrays.sort(numeros);
		System.out.println("Os números em ordem decrescente são: ");
		for(int i = 2; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}

}
