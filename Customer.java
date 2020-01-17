package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="cust")
public class Customer {
@Value("345")
private int code;
@Value("DELL")
private String name;
@Autowired
private Salary salary;
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Salary getSalary() {
	return salary;
}
public void setSalary(Salary salary) {
	this.salary = salary;
}


}
