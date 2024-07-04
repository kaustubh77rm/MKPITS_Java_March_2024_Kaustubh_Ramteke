package assgn_14.hashset.assignment15;

public class Main {
public static void main(String[] args) {
	Enrollment tracker=new Enrollment();
	tracker.add(new Course(1));
	tracker.add(new Course(2));
	tracker.add(new Course(3));
	tracker.add(new Course(4));
	tracker.add(new Course(5));
	
	tracker.display();
	
	tracker.check(4);
	
	tracker.remove(2);
	System.out.println("________________________________________");
	tracker.display();
	}
}