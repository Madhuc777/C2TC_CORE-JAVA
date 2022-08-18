package com.ait.application;

import com.ait.framework.BankFactory;
import com.ait.framework.CurrentAcc;
import com.ait.framework.SavingAcc;

public class MMBankFactory implements BankFactory{

	

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		SavingAcc savingAcc=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return savingAcc;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		CurrentAcc currentAcc=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
return currentAcc;
	}

}
