package annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
@Value("56000")
private double sal;
@Value("670")
private double hra;
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}

}
