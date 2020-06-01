package exercicio.aula17;

public class Exercicio4 {
	public static void main(String[] args) {
		
		int anos = 0;
		double paisA = 80000;
		double taxaA = 0.03; 
		double paisB = 200000;
		double taxaB = 0.015;
		
		while(true) {
			paisA = (paisA * taxaA) + paisA;
			paisB = (paisB * taxaB) + paisB;
			if(paisA == paisB || paisA > paisB) {
				System.out.println("Foram necessários " + anos +" anos para o país A ultrapassar"
						+ " ou igualar-se ao país B.");
				break;
			}
			anos++;
		}
	}
		
}
