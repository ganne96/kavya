package com.company;

import Nisum.NisumEmployee;
import java.util.ArrayList;
import java.util.List;

public class Employee1Service {
    public static void main(String[] args) {
        List<Employee1> employee1 = new ArrayList<>();
//        employee1.add(new Employee1(41870, "Kavya", 28, "Nisum", "Female"));
//        employee1.add(new Employee1(41871, "Vishnu", 21, "Nisum", "Male"));
//        employee1.add(new Employee1(41872, "Dilip", 20, "Nisum", "Male"));
//        employee1.add(new Employee1(41873, "Malavika", 21, "Nisum", "Female"));
//        employee1.add(new Employee1(41874, "Akshaya", 21, "Nisum", "Female"));
//
//        List<NisumEmployee> nisumlist = new ArrayList<>();
//        for(Employee1 emp :employee1) {
//            nisumlist.add(new NisumEmployee(emp.getId(), emp.getName()));
//        }
//        System.out.println(nisumlist);

        Employee1 emp1 = new Employee1();
        emp1.setId(41871);
        emp1.setAge(21);
        emp1.setName("Vishnu");
        emp1.setCompanyName("Nisum");
        emp1.setGender("Male");
        employee1.add(emp1);

        Employee1 emp2 = new Employee1();
        emp2.setId(41872);
        emp2.setAge(22);
        emp2.setName("Dilip");
        emp2.setCompanyName("Google");
        emp2.setGender("Male");
        employee1.add(emp2);

        Employee1 emp3 = new Employee1();
        emp3.setId(41870);
        emp3.setAge(28);
        emp3.setName("Kavya");
        emp3.setCompanyName("Nisum");
        emp3.setGender("Female");
        employee1.add(emp3);

        Employee1 emp4 = new Employee1();
        emp4.setId(41873);
        emp4.setAge(20);
        emp4.setName("Pravalleka");
        emp4.setCompanyName("Infosys");
        emp4.setGender("Male");
        employee1.add(emp4);

        Employee1 emp5 = new Employee1();
        emp5.setId(41874);
        emp5.setAge(21);
        emp5.setName("Akshaya");
        emp5.setCompanyName("Google");
        emp5.setGender("Female");
        employee1.add(emp5);

        System.out.println(employee1);

        List<NisumEmployee> nisumlist = new ArrayList<>();
        for (Employee1 e : employee1) {
            nisumlist.add(new NisumEmployee(e.getId(), e.getName()));
        }
        List<NisumEmployee> nisumlist1 = new ArrayList<>();
        for (Employee1 e1 : employee1) {
            nisumlist1.add(new NisumEmployee(e1.getName()));
        }
        for (NisumEmployee nisumEmployee : nisumlist) {
            System.out.println("ID: " + nisumEmployee.getId() + ", Name: " + nisumEmployee.getName());
        }
        for (NisumEmployee na : nisumlist1) {
            System.out.println(na.getName());
        }
     }
    }
