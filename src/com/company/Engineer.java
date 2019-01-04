package com.company;

public class Engineer extends Employee implements IProfessionalEmployee{

    private boolean isChartered;
    private String engineerType;
    private int salary;

    public Engineer(String forename, String surname, String dateOfBirth, boolean isChartered, String engineerType) {
        super(forename, surname, dateOfBirth);
        this.isChartered = isChartered;
        this.engineerType = engineerType;
        this.salary = getSalary();
    }

    @Override
    public int getSalary() {
        return 39200;
    }

    @Override
    public String toString() {
        return "===================================\n" +
                "Forename: " + getForename() + "\n" +
                "Surname: " + getSurname() + "\n" +
                "Date of birth: " + getDateOfBirth() + "\n" +
                "Engineer type: " + getEngineerType() + "\n" +
                "Pay number: " + getPayNumber() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "=====================================";
    }

    public boolean isChartered() {
        return isChartered;
    }

    public String getEngineerType() {
        return engineerType;
    }


}