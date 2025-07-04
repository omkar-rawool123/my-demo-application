package com.example.com.example.Model;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000),
                new Employee(3, "Charlie", "Finance", 55000),
                new Employee(4, "David", "IT", 70000),
                new Employee(5, "Eve", "HR", 65000),
                new Employee(6, "Eve", "HR", 65000)
        );

        //filter and return a list of names of employees in the "IT" department.

        List<String> itDepartment = employees.stream().filter(a -> a.getDepartment().equals("IT")).map(a -> a.name)
                .collect(Collectors.toList());
        System.out.println("itDepartment = " + itDepartment);

        //filter and return a list of employees in the "IT" department.

        List<Employee> itDepartment1 = employees.stream().filter(a -> a.getDepartment().equals("IT"))
                .collect(Collectors.toList());
        System.out.println("itDepartment = " + itDepartment1);

        //calculate the average salary of all employees.

        OptionalDouble average = employees.stream().mapToDouble(a -> a.salary).average();
        System.out.println("average = " + average);

        //find the name of employee with the highest salary
        Optional<String> s = employees.stream().max((a, b) -> Double.compare(a.salary, b.salary)).map(a -> a.name);
        System.out.println("Employee with max sal is " + s.get());

        //find the list of employee with the highest salary

        Optional<Employee> max = employees.stream().max((e1, e2) -> Double.compare(e1.salary, e2.salary));
        //or

        Optional<Employee> max1 = employees.stream().max(Comparator.comparingDouble(e -> e.salary));


        System.out.println("max = " + max);

        // group employees by their department.

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(a -> a.department));
        System.out.println("collect = " + collect);

        // group employees by their department with count.

        Map<String, Long> groupingByDepartmentWithCount = employees.stream()
                .collect(Collectors.groupingBy(a -> a.department, Collectors.counting()));

        System.out.println(groupingByDepartmentWithCount);

        // group employees by their department wise average sal.

        Map<String, Double> collect1 = employees.stream()
                .collect(Collectors.groupingBy(a -> a.department, Collectors.averagingDouble(a -> a.getSalary())));

        System.out.println("collect1 = " + collect1);

        // group employees by their salary.

        employees.stream().collect(Collectors.groupingBy(a -> a.getSalary()))
                .forEach((a, n) -> System.out.println("Employee with sal=" + a + " are " + n));

        //calculate the total salary paid to employees in each department.

        Map<String, Double> totalSalaryPerDepartment = employees.stream()
                .collect(Collectors.groupingBy(a -> a.getDepartment(), Collectors.summingDouble(e -> e.getSalary())));
        System.out.println("totalSalaryPerDepartment = " + totalSalaryPerDepartment);

        // return a list of all employee names.

        List<String> list = employees.stream().map(Employee::getName).toList();
        System.out.println("list = " + list);

        // filter and return employees whose salary is greater than a specified threshold.
        List<Employee> collect2 = employees.stream().filter(a -> a.salary >= 65000).collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);

        //first employee whose salary is above a certain amount.

        Optional<Employee> first = employees.stream().filter(e -> e.salary >= 65000).findFirst();
        System.out.println("first = " + first);

        // concatenate all employee names into a single string, separated by commas.
        String collect3 = employees.stream().map(Employee::getName).collect(Collectors.joining(","));

        System.out.println("collect3 = " + collect3);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
