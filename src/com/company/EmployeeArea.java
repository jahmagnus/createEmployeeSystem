package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArea<T extends Employee> {


    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public EmployeeArea(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean addNewEmployee(T employee, ArrayList<T> arrayList){
        if (members.contains(employee)){
            System.out.println(employee.getForename() + employee.getSurname() + " already in system");
            return false;
        } else {
            arrayList.add(employee);
            System.out.println(employee.getForename() + employee.getSurname() + " added to system");
            return true;
        }
    }

    public Employee findEmployee(String forename, String surname, ArrayList<T> arrayList){
        for (Employee employee: arrayList){
        if (employee.getForename().equals(forename) && employee.getSurname().equals(surname)){
            System.out.println(employee);
            return employee;
        }
        }
        System.out.println("Employee not found");
        return null;
    }

    public int findEmployee(int payNumber, String surname, ArrayList<T> arrayList ){
        for (Employee employee: arrayList){
            if (employee.getPayNumber() == payNumber && employee.getSurname().equals(surname)){
                ;
            }
        }
        return -1;
    }

    public void printEmployeeList(ArrayList<T> arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    public boolean removeEmployee(String forename, String surname, ArrayList<T> arrayList){
        if (findEmployee(forename, surname, arrayList) == null){
            return false;
        }
        else {
            Employee employee = findEmployee(forename, surname, arrayList);
            arrayList.remove(employee);
            return true;
        }
    }




}
