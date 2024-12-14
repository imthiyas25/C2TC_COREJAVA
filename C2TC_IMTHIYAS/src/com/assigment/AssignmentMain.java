package com.imthiyas.assigment;
import com.imthiyas.assigment.employees.*;
import com.imthiyas.assigment.employees.*;
import com.imthiyas.assigment.utilities.*;
public class AssignmentMain {
public static void main(String[] args) {
Manager manager = new Manager("John", 101, 90000, "Sales");
Developer developer = new Developer("Alice", 102, 80000, "Java");
EmployeeUtilities.printEmployeeDetails(manager);
EmployeeUtilities.printEmployeeDetails(developer);
}
}
