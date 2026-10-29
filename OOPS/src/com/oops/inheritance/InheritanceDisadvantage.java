package com.oops.inheritance;

class BankAccount {
	public void openAccount() {    //Any changes happens in parent class it impacts on its child class 
		System.out.println("Account.openAccount");

	}
}

	class SavingAccount extends BankAccount {
		@Override
		public void openAccount() {
			System.out.println("SavingAccount.openAccount");
		}

	}

	class SrCitizenAccount extends SavingAccount {
		@Override
		public void openAccount() {
			System.out.println("SrCitizenAccount.openAccount");
		}
	}

	class PensionAccount extends SrCitizenAccount {
		@Override
		public void openAccount() {
			System.out.println("PensionAccount.openAccount");
		}
	}



public class InheritanceDisadvantage {

	public static void main(String[] args) {
		PensionAccount customer1 = new PensionAccount(); //heavy loading 
		customer1.openAccount();
	}

}
