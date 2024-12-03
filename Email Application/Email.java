import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=500;
    private String alternativeMail;
    private String companySuffix="vkcompany.com";

    //  Constructor for firstName and lastName
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        // Call a method asking for the department return the department;
        this.department=setDepartment();
       // System.out.println("Department:"+department);

        this.password=randomPassword(8);
        //System.out.println("Your Password is:"+this.password);
        //System.out.println("Mail Created: "+(this.firstName).toLowerCase()+"."+(this.lastName).toLowerCase()+"@"+department+"."+companySuffix);
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
    }
    // Ask for the department
    private String setDepartment(){
        System.out.println("New worker: "+firstName+". Department Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code:");
        Scanner sc=new Scanner(System.in);
        int depChoice=sc.nextInt();
        if(depChoice==1) return "sales";
        if(depChoice==2) return "dev";
        if(depChoice==3) return "acct";

        return "--";
    }
    // Generate random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRST0123456789!@#$%";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()* passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // Set Mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    // Set the alternate mail
    public void setAlternativeMail(String altEmail){
        this.alternativeMail=altEmail;
    }
    // Change the password
    public void changePassword(String password){
        this.password=password;
    }

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternativeMail(){return alternativeMail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "DISPLAY NAME: "+firstName+" "+lastName+
                "\nCOMPANY MAIL: "+email+
                "\nMAILBOX CAPACITY: "+mailboxCapacity+"mb";
    }

}
