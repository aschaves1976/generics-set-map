package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.User;

public class ProgramExercicioFixacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students for course A?");
		int total = sc.nextInt();

		Set<User> a = new HashSet<>();

		for (int i = 1; i <= total; i++) {
			a.add(new User(sc.nextInt()));
		}
		sc.nextLine();

		System.out.println("How many students for course B?");
		total = sc.nextInt();

		for (int i = 1; i <= total; i++) {
			a.add(new User(sc.nextInt()));
		}
		sc.nextLine();

		System.out.println("How many students for course C?");
		total = sc.nextInt();

		for (int i = 1; i <= total; i++) {
			a.add(new User(sc.nextInt()));
		}
		sc.nextLine();

		for (User u : a) {
			System.out.print(u.printUser() + " ");
		}
		System.out.println("Total de Alunos: " + a.size());

		sc.close();

	}

}
