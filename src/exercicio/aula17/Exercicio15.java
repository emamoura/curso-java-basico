package exercicio.aula17;
import java.util.Scanner;

public class Exercicio15 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n-ésimo termo da série de Fibonacci");
		int termo = sc.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i = 3; i < termo; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
        }
			
		sc.close();
    }

}
