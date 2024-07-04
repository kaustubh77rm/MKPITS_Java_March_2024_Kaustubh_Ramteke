package assgn_14.hashset.assignment12;
import java.util.*;

public class UniqueEmailCollector {
	HashSet<Product> h=new HashSet<Product>();
	public void add(Product p) {
		h.add(p);
	}
	public void search(String idString) {
		Iterator<Product> iterator=h.iterator();
		while (iterator.hasNext()) {
			Product p = (Product)(iterator.next());
			if (p.idString==idString) {
				System.out.println(p);
			}
		}
	}
	public void remove(String idString) {
		Iterator<Product> iterator=h.iterator();
		while (iterator.hasNext()) {
			Product p = (Product)(iterator.next());
			if (p.idString==idString) {
				iterator.remove();
			}
		}
	}
	public void display() {
		Iterator<Product> iterator=h.iterator();
		while (iterator.hasNext()) {
			Product p = (Product)(iterator.next());
			System.out.println(p);
		}
	}
}