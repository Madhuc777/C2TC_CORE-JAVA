package com.ait.application;

import com.ait.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	public static float getMINBAL() {
		return MINBAL;
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount<=(accBal-MINBAL)) {
		super.withdraw(amount);
		System.out.println("Withdraw of"+ amount + "is succefull.");
	}
		else {
			System.out.println("insufficient balance");
		}
	}
	@Override
	public String toString() {
		return "MMSavingAcc [accBal=" + accBal + ", isSalaried()=" + isSalaried() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}
}
	
	
	

