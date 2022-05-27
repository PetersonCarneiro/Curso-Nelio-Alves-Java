package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);

		Rent[]vetor = new Rent[10];
		
		System.out.println("how many rooms will be rented: ");//Quantos quartos serão alugados
		int n =tc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #"+i+":");
			System.out.println("Name:");
			tc.nextLine();
			String name = tc.nextLine();
			System.out.println("Email:");
			String email = tc.nextLine();
			System.out.println("Room: ");
			int room = tc.nextInt();
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if(vetor[i] != null){
				System.out.println(i+":"+vetor[i]);
			}
		}
	}

}
