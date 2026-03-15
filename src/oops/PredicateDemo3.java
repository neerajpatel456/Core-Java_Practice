package oops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	String location;
	String dept;

	Employee(String name,String location,String dept){
		this.name= name;
		this.location = location;
		this.dept = dept;
	}
}

public class PredicateDemo3 {
	public static void main(String[] args) {
		Employee e1= new Employee("Neeraj","Bangluru", "IT");
		Employee e2= new Employee ("Rakesh", "Delhi", "HR");
		Employee e3= new Employee("Karan","Banglore", "IT");
		Employee e4= new Employee("Deepak","Banglore", "IT");
		Employee e5= new Employee("Vikki","Mumbai", "IT");
		Employee e6= new Employee("Pinak","Mumbai", "IT");
		Employee e7= new Employee("Rohit","Banglore", "SD");
		
		
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		Predicate<Employee> p1= (e)-> e.location.equals("Banglore");
		Predicate<Employee> p2= (e)-> e.dept.equals("IT");
		
		Predicate<Employee> p= p1.and(p2);
		
		for(Employee e:emps) {
			if(p.test(e)) {
				System.out.println(e.name);
				System.out.println(e.location);
				System.out.println(e.dept);
			}
		}
		
	}

}
