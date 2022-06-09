package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.println("How many values: ");
		int n = sc.nextInt();
		
		for(int i=1;i<n;i++) {
			System.out.println("Enter the value: ");
			int value = sc.nextInt();
			ps.addValue(value);
			
			ps.print();
			Integer x = ps.first();
			System.out.println("Firt: "+x);
			
			sc.close();
		}
	}

}
