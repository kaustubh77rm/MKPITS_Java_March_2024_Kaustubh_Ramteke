package stud;

class EnumExample {
	public enum Colors { blue, red, green, violet, brown, black, yellow }

	public static void main(String[] args) {
		Colors[] c = Colors.values();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}