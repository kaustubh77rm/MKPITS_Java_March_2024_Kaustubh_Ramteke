package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student student1 = (Student)context.getBean("s1");
		student1.display();
		
		Student student2 = (Student)context.getBean("s2");
		student2.display();
		
		Student student3 = (Student)context.getBean("s3");
		student3.display();
		
		Student student4 = (Student)context.getBean("s4");
		student4.display();
		
		Student student5 = (Student)context.getBean("s5");
		student5.display();
	}
}