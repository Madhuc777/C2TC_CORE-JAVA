package com.ait.application;

import com.ait.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
		
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount<=creditLimit) {
		super.withdraw(amount);
		System.out.println("Withdraw of"+ amount + "is succefull.");
	}
		else {
			System.out.println("insufficient balance");
		}
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", accBal=" + accBal + ", getCreditLimit()="
				+ getCreditLimit() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + "]";
	}
}


