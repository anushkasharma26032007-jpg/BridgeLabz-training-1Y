package com.gla.Generics.MapAssingment;
import java.util.*;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}
public class GroupEmployeesbyDepartment {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", "HR"));
        list.add(new Employee("Bob", "IT"));
        list.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : list) {
            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }

        for (String dept : map.keySet()) {
            System.out.print(dept + ": ");
            for (Employee e : map.get(dept)) {
                System.out.print(e.name + " ");
            }
            System.out.println();
        }
    }
}
