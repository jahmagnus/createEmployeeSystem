package com.company;

public class Accountant extends Employee implements IProfessionalEmployee, Comparable{

    private String qualification;
    private boolean chartered;
    private int salary;

    public Accountant(String forename, String surname, String dateOfBirth, String qualification, boolean chartered) {
        super(forename, surname, dateOfBirth);
        this.qualification = qualification;
        this.chartered = chartered;
        this.salary = getSalary();
    }

    @Override
    public int getSalary() {
        return 37400;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public boolean isChartered() {
        return chartered;
    }

    public void setChartered(boolean chartered) {
        this.chartered = chartered;
    }



    @Override
    public String toString() {
      return "===================================\n" +
                "Forename: " + getForename() + "\n" +
                "Surname: " + getSurname() + "\n" +
                "Date of birth: " + getDateOfBirth() + "\n" +
                "Qualification: " + getQualification() + "\n" +
                "Pay number: " + getPayNumber() + "\n" +
                "salary: " + getSalary() + "\n" +
                "===================================";

    }


}
