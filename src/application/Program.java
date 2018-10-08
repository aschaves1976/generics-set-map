package application;

import java.util.Scanner;

import model.service.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();

		System.out.print("How many values? ");
		int total = sc.nextInt();

		for (int i = 0; i < total; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
		System.out.println("First: " + ps.first());
		
		PrintService<String> psS = new PrintService<>();
		
		System.out.print("How many values? ");
		total = sc.nextInt();

		for (int i = 0; i < total; i++) {
			String value = sc.next();
			psS.addValue(value);
		}
		psS.print();
		System.out.println("First: " + psS.first());
		
	}
	
}

