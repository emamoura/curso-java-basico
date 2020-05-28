package exercicio.aula15;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um ano: ");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0) {
			if(ano % 100 != 0) {
				System.out.println("É um ano bissexto");
			}
			else {
				System.out.println("Não é um ano bissexto");
			}
		}else if(ano % 400 == 0) {
			System.out.println("É um ano bissexto");
		}else {
			System.out.println("Não é um ano biseexto");
		}
		
		sc.close();
	}
}
