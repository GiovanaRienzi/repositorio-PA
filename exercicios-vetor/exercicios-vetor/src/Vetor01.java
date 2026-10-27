import java.util.Scanner;
public class Vetor01 {
	public static void main(String []args) {
		
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<10; i++) {
		System.out.println("\nDigite o valor do "+(i+1)+"º valor de A");
		a[i] = in.nextInt();
		}
		
		System.out.println("\nOs quadrados são:");
		
		for (i=0; i<10; i++) {
		b[i] = (a[i]*a[i]);
		System.out.print(b[i]+"  ");
		}
	}
}
