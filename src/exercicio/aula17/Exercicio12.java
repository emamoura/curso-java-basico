package exercicio.aula17;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("De qual número você deseja ver a tabuada ?");
		int num = sc.nextInt();
		int resultado = 0;
		for(int i = 1; i <= 10; i++) {
			resultado = num * i;
			System.out.println(num + " X " + i + " = " + resultado);
		}
		
		sc.close();
	}

}
