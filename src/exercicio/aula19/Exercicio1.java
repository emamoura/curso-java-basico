package exercicio.aula19;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++) {
			a[i] = i * 2;
			System.out.println(a[i]);
		}
		
		int[] b = new int[5];
		
		for(int i = 0; i < 5; i++) {
			b[i] = a[i];
			System.out.println(a[i]);
		}
	}
}
