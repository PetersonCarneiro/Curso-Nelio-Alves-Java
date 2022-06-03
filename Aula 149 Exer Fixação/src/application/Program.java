package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProdut;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of product: ");
		int n = sc.nextInt();
		
		for(int i=1 ;i<=n; i++) {	
			System.out.println("Product #"+i+" date");
			System.out.println("Common, used or imported(c/u/i):");
			char cui = sc.next().charAt(0);
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price:");
			double price = sc.nextDouble();
			
			if(cui=='c') {
				Product prod = new Product(name, price);
				list.add(prod);
			}else if(cui=='i') {
				System.out.println("Customs fee:");
				double customsFee = sc.nextDouble();
				Product prod = new ImportedProduct(name, price, customsFee);
				list.add(prod);
			}else if (cui=='u') {
				System.out.println("Manufacture date (DD/MM/YYYY):");
				Date manufactureDate = sdf.parse(sc.next());
				Product prod = new UsedProdut(name, price, manufactureDate);
				list.add(prod);
			}			
			
		}
		
		System.out.println();
		System.out.println("Price tag:");
		for (Product prod: list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}

}
