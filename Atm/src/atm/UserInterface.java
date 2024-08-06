package atm;
import java.util.*;
public class UserInterface {
	private static int status;
public static void main(String args[]) {
	
	
	AtmOperationImpt impl=new AtmOperationImpt();
	Scanner sc=new Scanner(System.in);
	
	int atmnumber=123456;
	int atmpin=7924;
	System.out.println("Enter to ATM Machine");
	System.out.println("Enter the ATM Number:");
	int atmnumber2=sc.nextInt();
	System.out.println("Enter the ATM PIN:");
	int atmpin2=sc.nextInt();
	
	if(atmnumber==atmnumber2 && atmpin==atmpin2) {
		
		while(true) {
		System.out.println("1.viewAvailable\n2.withdrawAmount\n3.DepositAmount\n4.viewMiniStatement\n5.Exit");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		if(ch==1) {
			impl.viewBalance();
		}
		else if(ch==2) {
			System.out.println("Enter the Amount to withdraw:");
			double withdrawAmount=sc.nextDouble();
			impl.withdrawAmount(withdrawAmount);
			
			
			
		}
		else if(ch==3) {
			System.out.println("Enter the Deposit Amount:");
			double depositAmount=sc.nextDouble();
			impl.depositAmount(depositAmount);
		}
		else if(ch==4) {
			impl.viewMiniStatement();
		}
		else if(ch==5) {
			System.out.println("Collect your ATN Card\n Thankyou:)");
			System.exit(status);
		}
		}
	}else {
		System.out.println("Incorrect ATM number or PIN");
	}
}
}
