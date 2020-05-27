package exercicio.aula13;
import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que você deseja "
				+ "converter de Farenheit para Celsius: ");
		
		Double farenheit = sc.nextDouble();
		
		Double celsius = (5 *(farenheit - 32)) /9;
		
		System.out.println("O valor de " + farenheit + "°F para °C é de "+ celsius+ " °C");
	}

}
