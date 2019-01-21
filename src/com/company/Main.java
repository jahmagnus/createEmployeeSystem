package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static EmployeeArea<Accountant> accountants = new EmployeeArea<>("Accountants");
    private static ArrayList<Accountant> accountantArrayList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static EmployeeSystem employeeSystem = new EmployeeSystem();
    public static void main(String[] args) {


        boolean quit = false;

        while (!quit){
            System.out.println("0 - quit\n" +
                    "1 - add new employee\n" +
                    "2 - show employee lists");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0: quit = true;
                    System.out.println("System closing");
                break;

                case 1: addNewEmployee();
                break;

                case 2: showList();
                break;
                }
            }
        }

        public static void addNewEmployee(){
            System.out.println("What type of employee are you adding?\n" +
                            "0 - Back \n" +
                            "1 - Accountant\n" +
                            "2 - Cleaner\n" +
                            "3 - Engineer\n");


            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                break;
                case 1: addNewAccountant();
                break;
                case 2: addNewCleaner();
                break;
                case 3: addNewEngineer();
            }
        }

        public static void showList() {
            System.out.println("Which employee list would you like to see?\n" +
                    "0 - Return to main menu\n" +
                    "-------------------------------------\n" +
                    "1 - Accountants List\n" +
                    "2 - Search for accountant record\n" +
                    "-------------------------------------\n" +
                    "3 - Engineer List\n" +
                    "4 - Find Engineer record\n" +
                    "-------------------------------------\n" +
                    "=============================================================");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    printAccountantList();
                    break;
                case 2:
                    searchForAccountant();
                    break;
                case 3:
                    printEngineerList();
                    break;
                case 4:
                    searchForEngineer();
                    break;
            }
        }

        public static void printAccountantList() {
            accountants.printEmployeeList(accountantArrayList);
    }

        public static void searchForAccountant(){
            System.out.println("Please enter the forename of employee");
            String forename = sc.nextLine();
            System.out.println("Please enter surname of employee");
            String surname = sc.nextLine();
        employeeSystem.findAccountant(forename, surname, employeeSystem.getAccountantList());
        }

        public static void addNewAccountant() {


            boolean chartered;
            System.out.println("Please enter forename");
            String forename = sc.nextLine();
            System.out.println("Please enter surname");
            String surname = sc.nextLine();
            System.out.println("Please enter date of birth");
            String dob = sc.nextLine();
            System.out.println("Please enter qualification type");
            String qualification = sc.nextLine();
            System.out.println("Is this accountant chartered Y/N?");
            String charterAnswer = sc.nextLine();
            if (charterAnswer.equals("y")) {
                chartered = true;
            } else {
                chartered = false;
            }

            accountants.addNewEmployee(new Accountant(forename, surname, dob, qualification, chartered), accountantArrayList);


//        public static void addNewAccountant(){
//            boolean chartered;
//            System.out.println("Please enter forename");
//            String forename = sc.nextLine();
//            System.out.println("Please enter surname");
//            String surname = sc.nextLine();
//            System.out.println("Please enter date of birth");
//            String dob = sc.nextLine();
//            System.out.println("Please enter qualification type");
//            String qualification = sc.nextLine();
//            System.out.println("Is this accountant chartered Y/N?");
//            String charterAnswer = sc.nextLine();
//            if (charterAnswer.equals("y")){
//                chartered = true;
//            } else {
//                chartered = false;
//            }
//            employeeSystem.createNewAccountant(forename, surname, dob, qualification, chartered);
//
//        }

        }

        public static void addNewCleaner(){

    }

        public static void addNewEngineer(){
            boolean chartered;
            System.out.println("Please enter forename");
            String forename = sc.nextLine();
            System.out.println("Please enter surname");
            String surname = sc.nextLine();
            System.out.println("Please enter date of birth");
            String dob = sc.nextLine();
            System.out.println("Is this accountant chartered Y/N?");
            String charterAnswer = sc.nextLine();
            System.out.println("Please enter type of Engineer");
            String engineerType = sc.nextLine();

            if (charterAnswer.equals("y")){
                chartered = true;
            } else {
                chartered = false;
            }
            employeeSystem.createNewEngineer(forename, surname, dob, chartered, engineerType);
        }

    public static void printEngineerList(){

        employeeSystem.printList(employeeSystem.getEngineerList());
    }

    public static void searchForEngineer(){
        System.out.println("Please enter the forename of employee");
        String forename = sc.nextLine();
        System.out.println("Please enter surname of employee");
        String surname = sc.nextLine();
        employeeSystem.findEngineer(forename, surname, employeeSystem.getEngineerList());
    }

    }

