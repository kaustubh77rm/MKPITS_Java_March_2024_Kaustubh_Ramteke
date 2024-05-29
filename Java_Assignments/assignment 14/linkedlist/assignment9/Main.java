package assgn_14.linkedlist.assignment9;

public class Main {
	public static void main(String[] args) {
		Event event1=new Event("1", "a", "wardha", "22-5-2024", "12.30");
		Event event2=new Event("2", "b", "panvel", "22-5-2024", "11.30");
		Event event3=new Event("4", "d", "pune", "22-5-2024", "1.30");
		Event event4=new Event("3", "c", "bombay", "22-5-2024", "09.30");
		Event event5=new Event("5", "e", "akola", "22-5-2024", "07.30");
		
		EventScheduling eventScheduling=new EventScheduling();
		eventScheduling.add(event5);
		eventScheduling.add(event4);
		eventScheduling.add(event3);
		eventScheduling.add(event2);
		eventScheduling.add(event1);
		
		eventScheduling.display();
		
		eventScheduling.sort();
		System.out.println("__________________________________________");
		eventScheduling.display();
		System.out.println("__________________________________________");
		eventScheduling.details("p");
		System.out.println("__________________________________________");
		eventScheduling.removeById("p");
	}
}