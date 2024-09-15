package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student student1 = (Student)context.getBean("s1");
		student1.display();
		
	}
}