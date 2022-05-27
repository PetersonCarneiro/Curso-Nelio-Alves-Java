package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a quantidade de alturas:");
		int n = sc.nextInt();
		double[]vect = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Qual a altura:");
			vect[i]=sc.nextDouble();
		}
		double sum=0.0;
		for(int i=0; i<n; i++) {
			sum +=vect[i];
		}
		double avg = sum/n;
		
		System.out.println("Average height: "+avg);
		
		
		}

}
