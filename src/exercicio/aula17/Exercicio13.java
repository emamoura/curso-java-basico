package exercicio.aula17;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma base e um expoente natural: ");
		
		int base = sc.nextInt();
		int expoente = sc.nextInt();
		int resultado = base;
		
		if(expoente == 0) {
			resultado = 1;
		}else {
			for(int i = 0; i < (expoente - 1); i++) {
				resultado = resultado * base;
			}
		}
		
		System.out.println(resultado);
		
		sc.close();
	}

}
