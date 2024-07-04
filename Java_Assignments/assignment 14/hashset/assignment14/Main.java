package assgn_14.hashset.assignment14;

public class Main {
	public static void main(String[] args) {
		Tracker tracker=new Tracker();
		tracker.add(new Ipaddress("192.1.11"));
		tracker.add(new Ipaddress("187.103.241.20"));
		tracker.add(new Ipaddress("155.113.11.51"));
		tracker.add(new Ipaddress("166.46.10.49"));
		tracker.add(new Ipaddress("112.171.12.17"));
		
		tracker.display();
		
		tracker.check("187.103.241.20");
		
		tracker.remove("187.103.241.20");
		System.out.println("______________________________________________");
		tracker.display();
	}
}
