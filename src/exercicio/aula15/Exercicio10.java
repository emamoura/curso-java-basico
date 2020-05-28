package exercicio.aula15;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um turno do dia(M - Matutino/ V - Vespertino / N - Noturno)");
		
		String turno = sc.nextLine();
		
		switch(turno) {
		case "M":
			System.out.println("Bom dia !");
			break;
		case "V":
			System.out.println("Boa tarde !");
			break;
		case "N":
			System.out.println("Boa noite !");
			break;
		default:
			System.out.println("Turno inválido");
		}
	}

}
