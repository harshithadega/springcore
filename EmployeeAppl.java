package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAppl {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Employee e1=(Employee) ctx.getBean("emp");
		
		System.out.println("Name : "+e1.getName());
		System.out.println("Salary: "+e1.getSal());
		Employee e2=(Employee) ctx.getBean("emp");
		e2.setName("harshu");
	    e2.setSal(54000);
		System.out.println("Name : "+e2.getName());
		System.out.println("Salary: "+e2.getSal());
		System.out.println("Skills" +e2.getSkills());
	}

}
