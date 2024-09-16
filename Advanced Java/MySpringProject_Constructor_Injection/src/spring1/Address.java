package spring1;

public class Address {
	private String city;
	private String state;
	private String country;
	
		public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
		}
		
	@Override
	public String toString() {
		return "Address [City=" + city + ", State=" + state + ", Country=" + country + "]";
	}
}