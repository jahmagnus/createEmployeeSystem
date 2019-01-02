package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeSystem {
    private Scanner sc = new Scanner(System.in);
    private List<Accountant> accountantList;
    private List<Employee> employeeList;


    public EmployeeSystem() {
        this.accountantList = new ArrayList<Accountant>();
        this.employeeList = new ArrayList<Employee>();

    }

    public boolean createNewAccountant(String forename, String surname, String birthDate, String qualification, boolean chartered){
        if (!findAccountant(forename, surname)){
            accountantList.add(new Accountant(forename, surname, birthDate, qualification, chartered));
            System.out.println(forename + " " + surname + " added to system \n" +
                    "===================");
            return true;
        }
        System.out.println(forename + " " + surname + " already in system\n" +
                "===================");
        return false;
    }

    public boolean findAccountant(String forename, String surname){
        for(int i = 0; i < accountantList.size(); i++){
            if (accountantList.get(i).getForename().equals(forename) && accountantList.get(i).getSurname().equals(surname)){
                return true;
            }
        }
        return false;
    }


    public void printList(){
        for (int i = 0; i < accountantList.size(); i++){
            System.out.println(accountantList.get(i));
        }
    }

}
