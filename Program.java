package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i=0; i<vect.length; i++) { // é uma boa pratica usar o vect.lenght ao invés da var int n
			input.nextLine();
			String name = input.nextLine();
			double price = input.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}	
		double average = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", average);
		
		input.close();


	}

}
