package exercicio.aula15;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		
		String letra = sc.nextLine();
		
		switch(letra) {
		case "A":
		case "a":
		case "E":
		case "e":
		case "I":
		case "i":
		case "o":
		case "O":
		case "u":
		case "U": System.out.println("É uma vogal"); break;
		default: System.out.println("É uma consoante");
		}
	}

}
