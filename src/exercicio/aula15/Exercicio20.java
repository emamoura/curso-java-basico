package exercicio.aula15;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A seguir, mostrarei cinco perguntas em relação "
				+ "ao assassinato. Depois das perguntas lidas, escreva, em sequência, um S para sim e N"
				+ " para não");
		
		String resposta;
		int sim = 0;
		
		for(int i = 0; i < 5; i++) {
			resposta = sc.nextLine();
			if(resposta.equals("S")) {
				sim += 1;
			}
		}
		
		if(sim == 2) {
			System.out.println("Suspeita");
		}
		else if(sim == 4 || sim == 3) {
			System.out.println("Cúmplice");
		}else if(sim ==5) {
			System.out.println("Assassina");

		}else {
			System.out.println("Inocente");

		}
	}

}
