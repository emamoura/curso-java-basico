package exercicio.aula15;
import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sexo em letra maiúscula:");
		String sexo = sc.nextLine();
		
		switch(sexo) {
			case "M":
				System.out.println("M - Masculino");
				break;
			case "F":
				System.out.println("F - Feminino");
				break;
			default:
				System.out.println("Outro");
				break;
		}
		
	}

}
