package beans;

public class Student {
	private int regno;
	private String name;
	private Address addr;
	
	public Student(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		super();
	}
	public Address getAddress() {
		return addr;
	}
	public void setAddress(Address address) {
		this.addr = address;
	}
	public Student(Address address) {
		super();
		this.addr = address;
	}
	
}
