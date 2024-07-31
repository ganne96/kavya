package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, "Kavya"));
        employee.add(new Employee(2, "Rama"));
        employee.add(new Employee(3, "Krishna"));
        employee.add(new Employee(3, "Teja"));
        Collections.sort(employee, new EmpIdCompare());
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(employee.get(i));
        }
    }
}

