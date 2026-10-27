import java.util.Scanner;
public class Vetor03 {
	public static void main(String []args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], c[], i, j=TAM;
		a = new int [TAM];
		b = new int [TAM];
				
		for (i=0; i<TAM; i++) {
			System.out.println("\nDigite o "+(i+1)+"º valor de A");
			a[i] = in.nextInt();
			b[(j-1)] = a[i];
			j=j-1;
		}
		System.out.println("Os valores de A invertidos são:");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+"  ");
		}
	}
}
