package assgn_14.hashset.assignment12;

import java.util.HashSet;
import java.util.Iterator;

public class ProductIdentifierManager {
	HashSet<Product> hashSet = new HashSet<Product>();

	public void add(Product product) {
		hashSet.add(product);
	}

	public void remove(String idString) {
		Iterator<Product> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();
			if (product.getIdString().equals(idString)) {
				iterator.remove();
			}
		}
	}

	public void check(String idString) {
		Iterator<Product> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();
			if (product.getIdString().equals(idString)) {
				System.out.println("present");
				System.out.println(product);
			}
		}
	}

	public void display() {
		Iterator<Product> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();
			System.out.println(product);
		}
	}
}
