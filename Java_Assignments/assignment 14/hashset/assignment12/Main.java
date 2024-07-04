package assgn_14.hashset.assignment12;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product("a");
		Product product2 = new Product("b");
		Product product3 = new Product("c");
		Product product4 = new Product("d");
		Product product5 = new Product("e");

		ProductIdentifierManager productIdentifierManager = new ProductIdentifierManager();
		productIdentifierManager.add(product1);
		productIdentifierManager.add(product2);
		productIdentifierManager.add(product3);
		productIdentifierManager.add(product4);
		productIdentifierManager.add(product5);

		productIdentifierManager.display();
	}
}