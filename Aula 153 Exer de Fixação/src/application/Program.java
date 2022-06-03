package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Campany;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list= new ArrayList<>();
		
		System.out.print("Enter o number of tax payer: ");
		int n = sc.nextInt();
		for (int i=1; i<=n;i++) {
			System.out.println("Tax payer #" +i +"data" );
			System.out.println("Individual or campany(i/c): ");
			char type = sc.next().charAt(0);
			if (type=='i') {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Anual income: ");
				double anuallncome =sc.nextDouble();
				System.out.println("Health expenditures: ");
				double healthexpenditures = sc.nextDouble();
				list.add(new Individual(name, anuallncome, healthexpenditures));
			}else if (type=='c'){
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Anual income: ");
				double anuallncome =sc.nextDouble();
				System.out.println("Number Employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Campany(name,anuallncome,numberOfEmployees));
				
			}
			
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXE PAID: ");
		for(TaxPayer taxP: list) {
			double tax = taxP.tax();
			System.out.println(taxP.getName()+": $"+String.format("%.2f",tax));
			sum+= tax;
		}
		
		System.out.println();
		System.out.println("Total taxes: $ " + String.format("%.2f", sum));
		
		
		sc.close();
	}

}
