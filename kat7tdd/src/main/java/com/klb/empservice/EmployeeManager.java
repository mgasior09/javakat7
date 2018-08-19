package com.klb.empservice;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by klb on 19.08.18.
 */
public class EmployeeManager {

    private Set<Employee> employeeSet = new HashSet<Employee>();

    public EmployeeManager() {}

    //zwraca ilosc pracownikow
    public int empsNumber() {
        return employeeSet.size();
    }

    //dodanie pracownika
    public void addEmployee(Long id, String name, double salary) {
        employeeSet.add(new Employee(id, name, salary));
    }

    //zwiekszenie wynagrodzenia o n zl
    public boolean increaseSalary(Long id, double salary) {
        for(Employee emp : employeeSet) {
            if(emp.getId().equals(id)) {
                emp.setSalary(emp.getSalary() + salary);
                return true;
            }
        }

        return false;
    }

    public Employee getEmp(Long id) {
        for(Employee emp : employeeSet) {
            if(emp.getId().equals(id)) {
                return emp;
            }
        }

        return null;
    }
}
