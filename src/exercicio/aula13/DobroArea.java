package exercicio.aula13;
import java.util.Scanner;

public class DobroArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		Double lado = sc.nextDouble();
		
		Double area = Math.pow(lado, 2);
		System.out.println("A área de um quadrado com lado " + lado +" é igual "
				+ area);
		System.out.println("A área duplicada de um quadrado com lado " + lado +" é igual "
				+ area * 2);
	}

}
