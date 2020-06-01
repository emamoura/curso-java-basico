package exercicio.aula17;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome de usuário e uma senha");
		while(true) {
			String usuario = sc.nextLine();
			String senha = sc.nextLine();
			
			if(usuario.equals(senha)) {
				System.out.println("Não é permitido senha igual ao usuário, digite novamente.");
			}else {
				System.out.println("Senha válida");
				break;
			}
		}
		
		sc.close();
	}
}
