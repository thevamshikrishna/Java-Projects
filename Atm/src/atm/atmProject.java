package atm;

public class atmProject {
private double Balanace;
private double depositAmount;
private double withdrawAmount;
public double getBalanace() {
	return Balanace;
}
public void setBalanace(double balanace) {
	Balanace = balanace;
}
public double getDepositAmount() {
	return depositAmount;
}
public void setDepositAmount(double depositAmount) {
	this.depositAmount = depositAmount;
}
public double getWithdrawAmount() {
	return withdrawAmount;
}
public void setWithdrawAmount(double withdrawAmount) {
	this.withdrawAmount = withdrawAmount;
}
@Override
public String toString() {
	return "atmProject [Balanace=" + Balanace + ", depositAmount=" + depositAmount + ", withdrawAmount="
			+ withdrawAmount + "]";
}

}
