package exercicio.aula13;
import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor que você deseja converter para centímetros: ");
		Double metros = sc.nextDouble();
		
		Double conversaoCentimetros = metros * 100;
		System.out.println("O valor em centímetros é: " + conversaoCentimetros + " cm.");
		
	}

}
