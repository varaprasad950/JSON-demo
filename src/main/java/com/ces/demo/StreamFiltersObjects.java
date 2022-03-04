package com.ces.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFiltersObjects {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1,"vijay",30000));
		employees.add(new Employee(2,"Ajay",60000));
		employees.add(new Employee(3,"kumar",40000));
		employees.add(new Employee(4,"kk",70000));
		employees.add(new Employee(5,"kiran",90000));
		
		//copy to avoid mutating the original array
		List<Employee> copyEmp = new ArrayList<>(employees);
		// sorting descending order
		copyEmp.sort((ob1,ob2)-> ob2.getSalary() - ob1.getSalary());
		
		// get 1st 3
		/*for(int i=0;i<3;i++) {
			Employee e = copyEmp.get(i);
			System.out.println(e.getName());
		}*/
		List<String> eName = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
		.limit(4)
		.map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(eName);
		
		/*employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
		.limit(4)
		.map(emp -> emp.getName()).forEach(System.out::println);*/	

	}

}
