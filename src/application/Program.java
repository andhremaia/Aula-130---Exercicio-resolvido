package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> listEmployees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i ++) {
			
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");			
			char r = sc.next().charAt(0);			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (r == 'y') {
				System.out.print("Addtional charge: ");
				double addtionalCharge = sc.nextDouble();				
				listEmployees.add( new OutsourceEmployee(name, hours, valuePerHour, addtionalCharge));
			}
			else {				
				listEmployees.add( new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("\nPAYMENTS: ");
		
		for(Employee emp : listEmployees) {			
			System.out.print(emp.toString());
		}
		sc.close();
	}
}
