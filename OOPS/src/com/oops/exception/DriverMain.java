package com.oops.exception;

class BankAccount {
	public void doActivateAcc(String accNumber) {
		System.out.println("Account.doActivateAcc()...........START");
		validateAcc(accNumber);
		System.out.println("Account.doActivateAcc()...........END");
	}

	private boolean validateAcc(String accNo) {
		System.out.println("Account.validateAcc().....START");
		boolean isValid = true; // default isValid considered as true;
		try {
			int amount = 100 / 0; // Arithmetic Exception arises
			isValid = accNo.startsWith("SBI"); // creates NullpointerException object and pass it to caller method -
												// this is called Exception propagation

		} catch (NullPointerException e) {
			System.out.println("Account number is invalid, account number must not be empty");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: number is / by zero");
			e.printStackTrace();
		} catch (Throwable e) {
			System.out.println("Unkown error occured..");
			e.printStackTrace();
		}
		System.out.println("Account.validateAcc().....END");
		return isValid;
	}
}

public class DriverMain {

	public static void main(String[] args) {
		System.out.println("DriverMain.main()......START");
		BankAccount account = new BankAccount();
		String accountNumber = null;
		account.doActivateAcc(accountNumber);
		System.out.println("DriverMain.main()......END");

	}

}
