package exercicio.aula15;
import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota parcial: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite sua segunda nota parcial: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("Aprovado com Distinção");
		}
		else if(media >= 7) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
	}

}
