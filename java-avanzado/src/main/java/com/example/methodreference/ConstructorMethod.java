package com.example.methodreference;

import com.example.domain.Employee;
import com.example.domain.Person;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethod {

    public static void main(String[] args) {

        // 1. Constructor vacío

        Supplier<Employee> supplier1 = () -> new Employee(); // lambda

        Supplier<Employee> supplier2 = Employee::new; // method reference

        // 2. Constructor con un parámetro

        // String -> Employee
        Function<String, Employee> function = name -> new Employee(name); // lambda

        Function<String, Employee> function2 = Employee::new; // method reference
        Employee juan = function2.apply("Juan");

        // 3. Constructor con dos parámetros
        BiFunction<String, Integer, Employee> biFunction1 = (name, age) -> new Employee(name, age); // lambda

        BiFunction<String, Integer, Employee> biFunction2 = Employee::new; // method reference
        Employee emp = biFunction2.apply("Antonio", 40);

    }
}
@FunctionalInterface
interface EmployeeEmpty{
    Employee get();
}
@FunctionalInterface
interface EmployeeBasic{
    Employee get(String name);
}
@FunctionalInterface
interface EmployeeComplete{
    Employee get(String name, String age);
}