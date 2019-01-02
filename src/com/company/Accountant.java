package com.company;

public class Accountant extends Employee{

    private String qualification;
    private boolean chartered;

    public Accountant(String forename, String surname, String dateOfBirth, String qualification, boolean chartered) {
        super(forename, surname, dateOfBirth);
        this.qualification = qualification;
        this.chartered = chartered;
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
        System.out.println("===================================\n" +
                "Forename: " + getForename() + "\n" +
                "Surname: " + getSurname() + "\n" +
                "Date of birth: " + getDateOfBirth() + "\n" +
                "Qualification: " + getQualification() + "\n" +
                "Pay number: " + getPayNumber() + "\n" +
                "=========================================");
        return toString();
    }
}
