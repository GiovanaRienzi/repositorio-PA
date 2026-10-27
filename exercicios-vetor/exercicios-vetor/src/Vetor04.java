import java.util.Scanner;
public class Vetor04 {
	public static void main(String []args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[], i, soma=0;
		double media;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("\nDigite o "+(i+1)+"º valor de A");
			a[i] = in.nextInt();
			soma = soma+a[i];
		}
		
		media = soma/TAM;
		System.out.println("\n"+media);
	}
}
