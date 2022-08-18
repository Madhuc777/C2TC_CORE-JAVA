package com.ait.framework;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalaried;
	protected static final float MINBAL=1000f;
	public boolean isSalaried() {
		return isSalaried;
	}
	public static float getMinbal() {
		return MINBAL;
	}
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
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
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}
	
	
	
	
}
