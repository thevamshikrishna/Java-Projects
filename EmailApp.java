import java.util.*;
public class EmailApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your firstName:");
        String x=sc.nextLine();
        System.out.println("Enter your lastName:");
        String y=sc.nextLine();


        Email em1=new Email(x,y);
        System.out.println(em1.showInfo());
    }
}