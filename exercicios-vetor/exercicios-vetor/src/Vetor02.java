import java.util.Scanner;
public class Vetor02 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], c[], i;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("\nDigite o "+(i+1)+"º valor de A");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("\nDigite o "+(i+1)+"º valor de B");
			b[i] = in.nextInt();
			c[i] = a[i]+b[i];
		}
		
		System.out.println("\nOs respectivos valores de A e B somados são:");
		
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
	}
}