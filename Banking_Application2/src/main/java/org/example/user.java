package org.example;

import java.util.Scanner;

public class user {
Accounts a;
    public void start() {
        System.out.println("Welcome to HDFC BANK! \n Select an option to login: \n 1. Existing User (login) \n 2.New User (Create) \n 3.Exit" );
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch (choice){
            case 1:
                existingAccount();
                break;
            case 2:
                createAccount();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid Option!");

        }

    }

    private void existingAccount() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name1=sc.nextLine();
        System.out.println("Enter password:");
        String password1=sc.nextLine();

        if(name1.equals(Accounts.getName()) && password1.equals(Accounts.getpassword())){
            a.showMenu();
        }
        else{
            System.out.println("Wrong input of name or ID");
        }
    }

    private void createAccount() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Create a User Name:");
        String name2=sc.nextLine();
        System.out.println("Create a password:");
        String password2=sc.nextLine();

        System.out.println("Please Select your Account Type: \n 1. Savings \n 2.Current \n 3.Salary");
        int choice=sc.nextInt();

        Accounts a=null;
        switch (choice){
            case 1:   a= new Savings("vamshi","vamshi");
                System.out.println("Your Savings Account Created!");break;
            case 2:   a=new Current("krishna","vamshi");
                System.out.println("Your Current Account Created!");break;
            case 3:   a=new Salary("1234567890","vamshi");
                System.out.println("Your Salary Account Created!");break;
            default:
                System.out.println("Invalid Choice");
        }

      //  Accounts obj=new Accounts(name2,password2);
        System.out.println("Account Created Successfully!");
        a.showMenu();
       // obj.showMenu();

    }
}
