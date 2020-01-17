package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentAppl {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Student s=(Student) ctx.getBean("std");
		
		System.out.println("Name : "+s.getName());
		System.out.println("Registration Number: "+s.getRegno());
		System.out.println("Address Details: "+s.getAddress().getStreet()+" "+s.getAddress().getCity());
	}

}
