package exercicio.aula17;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		
		int anos = 0;
		System.out.println("Digite a população do país A: ");
		double paisA = sc.nextDouble();
		System.out.println("Digite a taxa de crescimento da população do país A: ");
		double taxaA = sc.nextDouble(); 
		System.out.println("Digite a população do país B: ");
		double paisB = sc.nextDouble();
		System.out.println("Digite a taxa de crescimento da população do país B: ");
		double taxaB = sc.nextDouble();
		
		taxaA = taxaA / 100;
		taxaB = taxaB / 100;
		
		while(true) {
			paisA = (paisA * taxaA) + paisA;
			paisB = (paisB * taxaB) + paisB;
			if(paisA == paisB || paisA > paisB) {
				System.out.println("Foram necessários " + anos +"anos para o país A ultrapassar"
						+ " ou igualar-se ao país B.");
				break;
			}
			anos++;
		}
		sc.close();
	}

}
