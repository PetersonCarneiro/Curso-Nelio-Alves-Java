package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos:");
		int n =sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			System.out.println("Qual o produto:");
			String name =sc.nextLine();
			System.out.println("Qual o preco");
			double price = sc.nextDouble();
			
			vect[i]=new Product(name,price);
		}
		
		double sum =0.0;
		for(int i=0; i<vect.length; i++) {
			sum+= vect[i].getPrice();
		}
		double avg = sum/vect.length;
		
		System.out.printf("Average price = %.2f%n",avg);

	}

}
