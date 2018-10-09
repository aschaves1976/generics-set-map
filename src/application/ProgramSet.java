package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		if (set.contains("Notebook")) {
			System.out.println("Existe Notebook no conjunto.");
		}

		System.out.println("HashSet é rápido, mas não garante ordenação.");
		print(set);

		System.out.println();
		set = new TreeSet<>();

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println("TreeSet ordena os dados.");
		print(set);

		System.out.println();
		set = new LinkedHashSet<>();

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println("LinkedHashSet mantém a ordem de inserção dos dados.");
		print(set);

		System.out.println("\n=========== OPERAÇÕES ===========");

		set.remove("Tablet");
		System.out.println("Tablet removido da lista.\n");
		print(set);

		set.removeIf(x -> x.length() >= 3);
		System.out.println("\nTodos os produtos da lista que contém mais de 3 caracteres foram removidos.\n");
		print(set);

	}

	public static void print(Set<String> set) {
		for (String p : set) {
			System.out.println(p);
		}
	}

}
