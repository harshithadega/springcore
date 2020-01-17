package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAppl {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("annotations/SpringAnnot.xml");
		Customer c= ctx.getBean("cust",Customer.class);
		System.out.println("code:"+c.getCode());
		System.out.println("name:"+c.getName());
		System.out.println("salary:"+c.getSalary().getSal());
		System.out.println("Hra:"+c.getSalary().getHra());

	}

}
