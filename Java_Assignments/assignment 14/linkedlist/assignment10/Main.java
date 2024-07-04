package assgn_14.linkedlist.assignment10;

public class Main {
public static void main(String[] args) {
	HistoryTracking historyTracking=new HistoryTracking();
	WebPage webPage1=new WebPage("1", "google.com", "a", "1");
	WebPage webPage2=new WebPage("2", "yahoo.com", "b", "2");
	WebPage webPage3=new WebPage("3", "reddit.com", "c", "3");
	WebPage webPage4=new WebPage("4", "brave.com", "d", "4");
	
	historyTracking.add(webPage4);
	historyTracking.add(webPage3);
	historyTracking.add(webPage2);
	historyTracking.add(webPage1);
	
	historyTracking.display();
	
	historyTracking.sort();
	System.out.println("__________________________________________");
	historyTracking.display();
	System.out.println("__________________________________________");
	historyTracking.details("d");
	System.out.println("__________________________________________");
}
}
