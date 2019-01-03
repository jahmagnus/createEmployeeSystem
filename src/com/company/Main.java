package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
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
                    "0 - Accountant \n" +
                    "1 - Cleaner\n" +
                    "2 - Engineer\n" +
                    "3 - Back"
                    );

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0: addNewAccountant();
                break;
                case 1: addNewCleaner();
                break;
                case 2: addNewEngineer();
                break;
                case 3: break;
            }
        }

        public static void showList() {
            System.out.println("Which employee list would you like to see?\n" +
                    "0 - Return to main menu\n" +
                    "1 - Accountants List\n" +
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
            }
        }

        public static void printAccountantList(){
        employeeSystem.printList(employeeSystem.getAccountantList());
        }

        public static void searchForAccountant(){
            System.out.println("Please enter the forename of employee");
            String forename = sc.nextLine();
            System.out.println("Please enter surname of employee");
            String surname = sc.nextLine();
        employeeSystem.searchRecords(forename, surname, employeeSystem.getAccountantList());
        }



        public static void addNewAccountant(){
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
            if (charterAnswer.equals("y")){
                chartered = true;
            } else {
                chartered = false;
            }
            employeeSystem.createNewAccountant(forename, surname, dob, qualification, chartered);

        }

        public static void addNewCleaner(){

        }

        public static void addNewEngineer(){

        }

    }

