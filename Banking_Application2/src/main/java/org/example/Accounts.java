package org.example;

import java.util.Scanner;

public abstract class Accounts {
    private static String name;
    private static String password;
    private int previousTransactions;
    private int balance;

    Accounts(String name,String passwod){
        this.name=name;
        this.password=password;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getpassword() {
        return password;
    }

    public void setID(String password) {
        this.password = password;
    }

    public int getPreviousTransactions() {
        return previousTransactions;
    }

    public void setPreviousTransactions(int previousTransactions) {
        this.previousTransactions = previousTransactions;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    void withdraw(int amount){
            balance = balance - amount;
            previousTransactions = -amount;
    }

    void deposit(int amount){
        balance=balance+amount;
        previousTransactions=amount;
    }

    void checkBalance(){
        System.out.println("Balance :"+balance);
    }

    void previousTransactions(){
        if(previousTransactions<0){
            System.out.println("Withdraw Occured of "+previousTransactions);
        }

        else if(previousTransactions>0){
            System.out.println("Deposit Occured of "+previousTransactions);
        }
        else{
            System.out.println("No Transaction Occured");
        }
    }


     void showMenu() {

         System.out.println("Welcome "+name);
         while (true) {
             Scanner data = new Scanner(System.in);
             System.out.println("Choose an Option \n 1. Deposit \n 2. Withdraw \n 3. Previous Transaction \n 4. Check Balance \n 5. Exit");
             System.out.println("Enter an Option: ");
             int choice = data.nextInt();

             switch (choice) {
                 case 1:
                     System.out.println("Enter amount for deposit:");
                     int x = data.nextInt();
                     deposit(x);
                     System.out.println("Deposit Successfull");
                     break;
                 case 2:
                     System.out.println("Enter amount for withdraw:");
                     int y = data.nextInt();
                     withdraw(y);
                     System.out.println("Withdraw Successfull");
                     break;
                 case 3:
                     previousTransactions();
                     break;
                 case 4:
                     checkBalance();
                     break;
                 case 5:
                     System.exit(0);

                 default:
                     System.out.println("Invalid Input");
             }
         }
     }
}
