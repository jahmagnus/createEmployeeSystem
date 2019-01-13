package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class EmployeeSystem {
    private Scanner sc = new Scanner(System.in);
    private List<Accountant> accountantList;
    private List<Engineer> engineerList;


    public EmployeeSystem() {
        this.accountantList = new ArrayList<Accountant>();
        this.engineerList = new ArrayList<Engineer>();

    }

    public List<Accountant> getAccountantList() {
        return accountantList;
    }

    public List<Engineer> getEngineerList() {
        return engineerList;
    }

    //Methods for creation of new account and search for existing accountant =====================================================

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
        //for use in the create new accountant method
    private boolean findAccountant(String forename, String surname){
        for(int i = 0; i < accountantList.size(); i++){
            if (accountantList.get(i).getForename().equals(forename) && accountantList.get(i).getSurname().equals(surname)){
                return true;
            }
        }
        return false;
    }
        //for use in the main method find accountant record
    public Accountant findAccountant(String forename, String surname, List<Accountant> array) {
        for (Accountant checkedEmployee: array){
            if (checkedEmployee.getForename().equals(forename) && checkedEmployee.getSurname().equals(surname)){
                System.out.println(checkedEmployee.toString());
                return checkedEmployee;
            }
        }
        System.out.println("No record of " + forename + " " + surname);
        return null;
    }

    public int findAccountantInt(String forename, String surname){
        for (Accountant accountant: accountantList){
            if (accountant.getForename().equals(forename) && accountant.getSurname().equals(surname)){
                return accountantList.indexOf(accountant);
            }
        }
        return -1;
    }

    public boolean deleteAccountant(String forename, String surname, String birthDate, String qualification, boolean chartered){
        if (findAccountantInt(forename, surname)>= 0){
            int accountantPosition = findAccountantInt(forename, surname);
            accountantList.remove(accountantPosition);
            return true;
        }
        return false;
    }


    //Methods for the creation of a new Engineer and finding existing engineer ============================================
    public boolean createNewEngineer(String forename, String surname, String birthDate, boolean chartered, String engineerType){
        if (!findEngineer(forename, surname)){
            engineerList.add(new Engineer(forename, surname, birthDate, chartered, engineerType));
            System.out.println(forename + " " + surname + " added to system \n" +
                    "===================");
            return true;
        }
        System.out.println(forename + " " + surname + " already in system\n" +
                "===================");
        return false;
    }
        //for use in the create new engineer method
    private boolean findEngineer(String forename, String surname){
        for(int i = 0; i < engineerList.size(); i++){
            if (engineerList.get(i).getForename().equals(forename) && engineerList.get(i).getSurname().equals(surname)){
                return true;
            }
        }
        return false;
    }
        //for use in the main method engineer record search
    public Engineer findEngineer(String forename, String surname, List<Engineer> array) {
        for (Engineer checkedEngineer : array) {
            if (checkedEngineer.getForename().equals(forename) && checkedEngineer.getSurname().equals(surname)) {
                return checkedEngineer;
            }
        }
        System.out.println("No record of " + forename + " " + surname);
        return null;
    }


    // print full employee grade list==================================

    public void printList(List array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

}


