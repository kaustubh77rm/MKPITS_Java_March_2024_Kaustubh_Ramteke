package stud;
import java.io.*;
import java.util.*;
import java.lang.String;

public class Address
{
    //setter getter method's usages
    private String name;
    private String phoneNumber;
    private String email;

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    // Getters
    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void getInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name:");
        setName(scanner.nextLine());

        System.out.print("Enter phone number:");
        setPhoneNumber(scanner.nextLine());

        System.out.print("Enter email:");
        setEmail(scanner.nextLine());
    }
}

/*
                Address address = new Address();

                // Get input using the getInput method
                address.getInput();

                // Display the entered information using getter methods
                System.out.println("Name: " + address.getName());
                System.out.println("Phone Number: " + address.getPhoneNumber());
                System.out.println("Email: " + address.getEmail());
*/