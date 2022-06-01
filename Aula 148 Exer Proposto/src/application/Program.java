package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		
		
		for(int i=1;i<n;i++) {
			System.out.println("Employee #"+i+"data");
			System.out.println("Outsourced (y/n)");
			char out = sc.next().charAt(n);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			
			if(out =='y') {
				System.out.println("additional charge:");
				double additionalCharger = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharger);
				list.add(emp);
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		
		System.out.println("");
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.payment()+" -$ "+ String.format("%.2f", emp.payment()));
		}
		
		
		sc.close();
	}
}
