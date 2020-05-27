package exercicio.aula13;
import java.util.Scanner;

public class Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB: ");
		double arquivo = sc.nextDouble();
		
		System.out.println("Digite a sua velocidade de internet em MB/s");
		double velocidade = sc.nextDouble();
		
		double tempo = (arquivo / velocidade);
		
		System.out.println("O tempo médio gasto "
				+ "para upar esse arquivo na internet é de " + tempo + " s");
	}

}
