package assgn_14.hashset.assignment12;

public class Product {
	String idString;

	public Product(String idString) {
		this.idString = idString;
	}

	@Override
	public String toString() {
		return "Product [idString=" + idString + "]";
	}

	public String getIdString() {
		return idString;
	}

	public void setIdString(String idString) {
		this.idString = idString;
	}
}