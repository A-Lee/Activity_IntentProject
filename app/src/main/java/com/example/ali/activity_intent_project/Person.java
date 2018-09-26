package com.example.ali.activity_intent_project;

public class Person
{
    private String firstName,lastName,adress;
    private int age,number;

    public Person(String firstName, String lastName, String adress, int age, int number)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.adress = adress;
        this.number = number;
    }

    public String getInfo()
    {
        return "First name : " + firstName + "\nLast name: " + lastName + "\nAge: " + age + "\nAdress: " + adress
                + "\nPhone number: " + number;
    }
}
