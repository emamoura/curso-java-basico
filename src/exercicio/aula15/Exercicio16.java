package exercicio.aula15;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		if(a != 0) {
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double delta = Math.pow(b, 2) - 4 * a * c;
			if(delta < 0) {
				System.out.println("Não existe raíz raiz real para delta menor que 0");
			}
			else if(delta > 0) {
				double x = (-(b) + Math.sqrt(delta)) / (2 * a);
				double y = (-(b) - Math.sqrt(delta)) / (2 * a);
				System.out.println("Para 'delta' > 0, temos as seguintes raízes");
				System.out.println("X1: " + x);
				System.out.println("X2: " + y);
			}
			else {
				double x = (-(b) + Math.sqrt(delta)) / (2 * a);
				System.out.println("Para 'delta' = 0, temos apenas uma raíz");
				System.out.println("X: " + x);
			}
		}
		else {
			System.out.println("A equação não é do segundo grau para a = 0");
		}
	}
}
