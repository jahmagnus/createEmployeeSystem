package com.company;

import java.util.ArrayList;

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

    public void printEmployeeList(ArrayList<T> arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

}
