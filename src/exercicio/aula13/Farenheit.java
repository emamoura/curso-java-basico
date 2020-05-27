package exercicio.aula13;
import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que você deseja "
				+ "converter de Celsius para Farenheit: ");
		
		Double celsius = sc.nextDouble();
		
		Double farenheit = (160 + (9 * celsius)) /5;
		
		System.out.println("O valor de " + celsius + "°C para °F é de "+ farenheit+ " °F");
	}

}
