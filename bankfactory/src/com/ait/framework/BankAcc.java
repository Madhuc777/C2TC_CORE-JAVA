package com.ait.framework;

public abstract class BankAcc {
private int accNo;
private String accNm;
protected  float accBal;
public BankAcc(int accNo, String accNm, float accBal) {
	
	this.accNo = accNo;
	this.accNm = accNm;
	this.accBal = accBal;
	
	
}
public int getAccNo() {
	return accNo;
}

public String getAccNm() {
	return accNm;
}
public void setAccNm(String accNm) {
	this.accNm = accNm;
}
public float getAccBal() {
	return accBal;
}

abstract public void withdraw(float accBal);
abstract public void deposite(float accBal);
@Override
public String toString() {
	return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
			+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
}





}
