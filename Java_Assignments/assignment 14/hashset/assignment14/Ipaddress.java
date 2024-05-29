package assgn_14.hashset.assignment14;

public class Ipaddress {
	String ipaddressString;

	public Ipaddress(String ipaddressString) {
		super();
		this.ipaddressString = ipaddressString;
	}

	public String getIpaddressString() {
		return ipaddressString;
	}

	public void setIpaddressString(String ipaddressString) {
		this.ipaddressString = ipaddressString;
	}

	@Override
	public String toString() {
		return "Ipaddress [ipaddressString=" + ipaddressString + "]";
	}
}