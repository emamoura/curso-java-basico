package exercicio.aula13;
import java.util.Scanner;

public class Raio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo e mostrarei sua área:");
		
		Double raio = sc.nextDouble();
		Double pi = 3.14;
		Double area = Math.PI * (raio * raio);
		
		System.out.println("O valor da área do círculo é: " + area);
	}

}
