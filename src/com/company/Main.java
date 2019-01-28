package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static EmployeeArea<Accountant> accountants = new EmployeeArea<>("Accountants");
    private static ArrayList<Accountant> accountantArrayList = new ArrayList<>();
    private static EmployeeArea<Engineer> engineers = new EmployeeArea<>("Engineers");
    private static ArrayList<Engineer> engineerArrayList = new ArrayList<>();

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
                    "5 - Remove accountant record\n" +
                    "4 - Remove Engineer record\n" +
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
                    findAccountant();
                    break;
                case 3:
                    printEngineerList();
                    break;
                case 4:
                    searchForEngineer();
                    break;
                case 5:
                    removeAccountant();
                    break;
            }
        }

        public static void printAccountantList() {
            accountants.printEmployeeList(accountantArrayList);
        }

        public static void findAccountant(){
            System.out.println("Please enter forename of Accountant");
            String forename = sc.nextLine();
            System.out.println("Please enter surname of Accountant");
            String surname = sc.nextLine();
            accountants.findEmployee(forename, surname, accountantArrayList);
        }

        public static void printEngineerList(){
        engineers.printEmployeeList(engineerArrayList);
        }

        public static void searchForEngineer(){
            System.out.println("Please enter forename of Engineer");
            String forename = sc.nextLine();
            System.out.println("Please enter surname of Engineer");
            String surname = sc.nextLine();
            engineers.findEmployee(forename, surname, engineerArrayList);
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
        if (charterAnswer.equals("y")) {
            chartered = true;
        } else {
            chartered = false;
        }
        System.out.println("Please enter Engineer type");
        String engineerType = sc.nextLine();

        engineers.addNewEmployee(new Engineer(forename, surname, dob, chartered, engineerType), engineerArrayList);

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

    }

        public static void removeAccountant(){
            System.out.println("Please enter forename");
            String forename = sc.nextLine();
            System.out.println("Please enter surname");
            String surname = sc.nextLine();
            accountants.removeEmployee(forename, surname, accountantArrayList);
        }




        public static void addNewCleaner(){

        }


    }

