package exercicio.aula15;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite se você deseja comprar álcool(A) ou gasolina(G): ");
		String tipoCombustivel = sc.nextLine();
		System.out.println("Digite quantos litros você deseja comprar: ");
		double litros = sc.nextInt();
		double pagamento = 0;
		double desconto = 0;
		
		if(tipoCombustivel.equals("A")) {
			pagamento = litros * 1.90;
			if(litros <= 20) {
				desconto = (pagamento * 0.03) + pagamento;
				System.out.println("Você irá pagar pelo álcool: R$" + desconto);
			}else {
				desconto = (pagamento * 0.05) + pagamento;
				System.out.println("Você irá pagar pelo álcool: R$" + desconto);
			}
		}
		else if(tipoCombustivel.equals("G")) {
			pagamento = litros * 2.50;
			if(litros <= 20) {
				desconto = (pagamento * 0.04) + pagamento;
				System.out.println("Você irá pagar pela gasolina: R$" + desconto);
			}else {
				desconto = (pagamento * 0.06) + pagamento;
				System.out.println("Você irá pagar pela gasolina: R$" + desconto);
			}
		}
		
	}

}
