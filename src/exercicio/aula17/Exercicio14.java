package exercicio.aula17;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int contadorPar = 0;
		int contadorImpar = 0;
		
		for(int i = 0; i < 10; i++) {
			int numero = sc.nextInt();
			if(numero % 2 == 0) {
				contadorPar++;
			}else {
				contadorImpar++;
			}
		}
		
		System.out.println("O total de números pares são: " + contadorPar);
		
		System.out.println("O total de números ímpares são: " + contadorImpar);
		
		sc.close();
	}

}
