package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImpt implements interfaceforAtm{

	atmProject atm=new atmProject();
	
	
	Map<Double,String> ministmt=new HashMap<>();
	
	
	public void viewBalance() {
		System.out.println("Available Balance:"+atm.getBalanace());
		
	}

	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalanace()) {
				System.out.println("Collect the Cash"+withdrawAmount);
				atm.setBalanace(atm.getBalanace()-withdrawAmount);
				ministmt.put(withdrawAmount, "Amount withdrawn");
				viewBalance();
			}else {
				System.out.println("Insufficirnt Balance");
			}
		}
		else {
			System.out.println("Enter the Amount in 500 terms");
		}
		
	}

	
	public void depositAmount(double depositAmount) {
		System.out.println("deposited Amount is"+depositAmount);
		atm.setBalanace(atm.getBalanace()+depositAmount);
		ministmt.put(depositAmount, "Deposit Successfully!");
		
	}

	
	public void viewMiniStatement() {
		
		Set<Double> set=ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
		
	}

}
