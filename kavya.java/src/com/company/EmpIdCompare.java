package com.company;

import java.util.Comparator;

class EmpIdCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.compareTo(o2);
    }
}
