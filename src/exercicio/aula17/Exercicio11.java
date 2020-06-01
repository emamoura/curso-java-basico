package exercicio.aula17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números(Primeiramente o menor, segundamente o maior))");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = 0;
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
			soma += i;
		}
		
		System.out.println("A soma é: " + soma);
		
		sc.close();
	}
}
