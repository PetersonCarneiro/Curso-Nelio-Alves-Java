package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;



public class Program {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			
			List<Product>list = new ArrayList<>();
			
			System.out.println("Digite a quantidade de funcionarios:");
			int n = sc.nextInt();
			
			for(int i=1;i<n;i++) {
				System.out.println("Emplyoee #"+i);
				System.out.println("Enter the id:");
				int id = sc.nextInt();
				while(hasId(list,id)) {
					System.out.println("Digite o id");
					id=sc.nextInt();
				}
				sc.nextLine();
				System.out.println("Enter the name:");
				String name = sc.nextLine();
				System.out.println("Enter the Salary;");
				double sal = sc.nextDouble();
				
				list.add(new Product(name, id, sal));	
			}
			System.out.println();
			System.out.println("Enter the employee id that will have salary increase:");
			int id =sc.nextInt();
			Product product =list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			
			if(product==null) {
				System.out.println("This id does exist!");
			}else {
				System.out.println("Enter the percentage:");
				double percentage = sc.nextDouble();
				product.increaseSalary(percentage);
			}
			
			System.out.println();
			System.out.println("List of employees:");
			for (Product obj : list) {
				System.out.println(obj);
			}
		}
	}

	private static boolean hasId(List<Product> list, int id) {
		Product product = list.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
		return product !=null;
	}

}
