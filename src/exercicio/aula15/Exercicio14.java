package exercicio.aula15;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as notas parciais: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if(media <= 4) {
			System.out.println("E");
			System.out.println("Reprovado");
		}
		else if(media <= 6) {
			System.out.println("D");
			System.out.println("Reprovado");
		}
		else if(media <= 7.5) {
			System.out.println("C");
			System.out.println("Aprovado");
		}
		else if(media <= 9) {
			System.out.println("B");
			System.out.println("Aprovado");
		}else if(media <= 10) {
			System.out.println("A");
			System.out.println("Aprovado");
		}
	}

}
