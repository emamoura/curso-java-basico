package exercicio.aula17;
import java.util.Scanner;

public class Exercicio3 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dados válidos: ");
		System.out.println("Nome deve ter mais de 3 letras");
		System.out.println("A idade deve ser menor que 150");
		System.out.println("O salário deve ser maior que 0");
		System.out.println("O sexo deve ser m para Masculino e f para Feminino");
		System.out.println("O estado civil deve ser o seguintes valores: ");
		System.out.println("c para Casado(a)");
		System.out.println("v para viúvo(a)");
		System.out.println("s para solteiro(a)");
		System.out.println("d para divorciado(a)");
		while (true) {
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			sc.nextLine();
			double salario = sc.nextDouble();
			sc.nextLine();
			String sexo = sc.nextLine();
			String estadoCivil = sc.nextLine();
			
			if(nome.length() > 3) {
				System.out.println("Nome válido");
			}else {
				System.out.println("Nome inválido");
				System.out.println("Digite novamente todas as informações: ");
				continue;
				
			}
			
			if(idade <= 150 && idade > 0) {
				System.out.println("Idade válida");
			}else {
				System.out.println("Idade inválida");
				System.out.println("Digite novamente todas as informações: ");
				continue;
			}
			
			if(salario > 0) {
				System.out.println("Salário válido");
			}else {
				System.out.println("Salário inválido");
				System.out.println("Digite novamente todas as informações: ");
				continue;
			}
			
			if(sexo.equals("m") || sexo.equals("f")) {
				System.out.println("Sexo válido");
			}else {
				System.out.println("Sexo inválido");
				System.out.println("Digite novamente todas as informações: ");
				continue;
			}
			
			if(estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("s") || estadoCivil.equals("d")) {
				System.out.println("Estado civil válido");
				break;
			}else {
				System.out.println("Estado civil inválido");
				System.out.println("Digite novamente todas as informações: ");
				continue;
			}
			
		}
	}

}
