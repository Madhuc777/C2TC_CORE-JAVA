package com.ait.framework;

public abstract class CurrentAcc extends BankAcc{
	
	protected float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public void withdraw(float accBal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposite(float accBal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}

	
	

}
