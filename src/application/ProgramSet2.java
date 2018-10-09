package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet2 {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		System.out.println("Conjuntos criados: A e B\n");
		System.out.print("Conjunto A: ");
		System.out.println(a);
		System.out.print("Conjunto B: ");
		System.out.println(b + "\n");

		// union
		System.out.print("Conjunto C criado; Cópia do conjunto A: ");
		Set<Integer> c = new TreeSet<>(a);
		System.out.println(c + "\n");

		System.out.println("UNIÃO entre os conjuntos C e B:");
		c.addAll(b);
		System.out.println(c + "\n");

		// intersection

		System.out.print("Conjunto D criado; Cópia do conjunto A: ");
		Set<Integer> d = new TreeSet<>(a);
		System.out.println(d + "\n");

		System.out.println("INTERSEÇÃO entre os conjuntos D e B:");
		d.retainAll(b);
		System.out.println(d + "\n");

		// difference
		System.out.print("Conjunto E criado; Cópia do conjunto A: ");
		Set<Integer> e = new TreeSet<>(a);
		System.out.println(e + "\n");

		System.out.println("DIFERENÇA: Removendo do conjunto E os elementos que estão no B:");
		e.removeAll(b);
		System.out.println(e + "\n");

	}

}
