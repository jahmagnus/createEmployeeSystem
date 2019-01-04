package com.company;

import java.util.Random;

public class Employee {
    Random random = new Random();

    private String forename;
    private String surname;
    private String dateOfBirth;
    private int payNumber;


    public Employee(String forename, String surname, String dateOfBirth) {
        this.forename = forename;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.payNumber = getPayNumber();
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPayNumber() {
        this.payNumber = random.nextInt(9999) + 999;
        return payNumber;

    }

    public void setPayNumber(int payNumber) {
        this.payNumber = payNumber;
    }







}
