package application;

import java.util.Set;
import java.util.TreeSet;

import model.entities.ProductSet;

public class ProgramSet3 {

	public static void main(String[] args) {
		/**
		 * Quando utilizamos TreeSet, a classe do conjunto precisa ser uma implementação
		 * de Comparable, para que o TreeSet possa realizar a ordenação dos dados do
		 * Conjunto
		 */
		Set<ProductSet> set = new TreeSet<>();
		set.add(new ProductSet("TV", 900.0));
		set.add(new ProductSet("Notebook", 1200.0));
		set.add(new ProductSet("Tablet", 400.0));

		for (ProductSet p : set) {
			System.out.println(p);
		}

	}

}
