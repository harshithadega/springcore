package beans;

import java.util.List;

public class Employee {
	private String name;
	private double sal;
	private List<String> skills;
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	public Employee() {
		super();
	}
	public void start(){
		System.out.println("This is start method");
	}
	public void stop()
	{
		System.out.println("This is stop method");
	}
	
}
