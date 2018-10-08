package application;

import model.entities.Client;

public class ProgramHashcodeEqual1 {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "Luiz";
		String c = "Maria";

		if (a.equals(b)) {
			System.out.println(a + " é igual a " + b);
		} else {
			System.out.println(a + " é diferente de " + b);
		}
		if (a.equals(c)) {
			System.out.println(a + " é igual a " + c);
		} else {
			System.out.println(a + " é diferente de " + c);
		}

		System.out.println("Hascode de a: " + a.hashCode());
		System.out.println("Hascode de b: " + b.hashCode());
		System.out.println("Hascode de c: " + c.hashCode());
		System.out.println();

		Client c1 = new Client(a, a + "@gmail.com");
		Client c2 = new Client(b, b + "@gmail.com");
		Client c3 = new Client(c, c + "@gmail.com");

		if (c1.equals(c2)) {
			System.out.println(
					c1.getName() + " - " + c1.getEmail() + " é igual a: " + c2.getName() + " - " + c2.getEmail());
		} else {
			System.out.println(
					c1.getName() + " - " + c1.getEmail() + " é diferente de: " + c2.getName() + " - " + c2.getEmail());
		}
		System.out.println("Hascode de c1: " + c1.hashCode());
		System.out.println("Hascode de c2: " + c2.hashCode());
		if (c1.equals(c3)) {
			System.out.println(
					c1.getName() + " - " + c1.getEmail() + " é igual a: " + c3.getName() + " - " + c3.getEmail());
		} else {
			System.out.println(
					c1.getName() + " - " + c1.getEmail() + " é diferente de: " + c3.getName() + " - " + c3.getEmail());
		}
		System.out.println("Hascode de c1: " + c1.hashCode());
		System.out.println("Hascode de c3: " + c3.hashCode());

		System.out.println();
		System.out.println(c1 == c3);

		String s1 = "Text";
		String s2 = "Text";
		System.out.println(s1 == s2);
		String s3 = new String("Text");
		String s4 = new String("Text");
		System.out.println(s3 == s4);

	}

}
