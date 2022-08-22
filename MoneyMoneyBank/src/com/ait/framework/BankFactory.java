package com.ait.framework;

public interface BankFactory {
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);

}
