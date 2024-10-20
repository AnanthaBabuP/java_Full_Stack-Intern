package com.Functional_Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Example {

	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Anandh", "SW Engineer", 55000);
		Employee e2 = new Employee(1002, "Ganesh", "NW Engineer", 55000);
		Employee e3 = new Employee(1003, "Ravi", "Database Engineer", 38000.0);
		Employee e4 = new Employee(1004, "Sutha", "manager", 150000.0);
		Employee e5 = new Employee(1005, "Krishna", "Clerk", 28000.0);
		
//		Employee[] myEmployes = {e1,e2,e3,e4,e5};
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		/* 1.Traditional Method
		 * for(Employee emp : empList) { System.out.println(emp); }
		 */
		
		// 2. Anonymous Inner CLass
		/*
		 * empList.forEach(new Consumer<Employee>() {
		 * 
		 * @Override public void accept(Employee e) { System.out.println(e);
		 * 
		 * }
		 * 
		 * });
		 */
		
		// 3. Lambda Expression With 1.1.Consumer Class accept method
//		empList.forEach((e)-> {System.out.println(e); });
//		
//		System.out.println();
//		
//		empList.forEach(System.out::println); // Method references
		
		// 1.2.SupplierDemo Refer to get() Method.

		
		// Traditional Method for predicate class 
//		for(Employee emp : empList) {
//			if(emp.designation.contains("Engineer")) {
//				System.out.println(emp);
//			}
//		}
		
		// 1.3 Predicate Class filter with designation
//		empList.stream().filter(
//				e-> e.designation.contains("Engineer")
//			).forEach(
//					e -> System.out.println(e)
//		);
		
		// Predicate class filter with salary
//		empList.stream().filter(e-> e.salary > 50000).forEach((x)-> System.out.println(x));
	 // 1.4 Function Class R apply(T)
//		empList.stream().map(new Function<Employee, Integer>() {
//
//			@Override
//			public Integer apply(Employee emp) {
//				return emp.empName.length();
//			}
//		}).forEach(x -> System.out.println(x));
		
		empList.stream().map(e -> e.empName.length()).forEach(x -> System.out.println(x));
	
	}

}
