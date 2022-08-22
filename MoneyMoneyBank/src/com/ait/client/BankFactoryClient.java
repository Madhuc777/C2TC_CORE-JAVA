package com.ait.client;

import com.ait.application.MMBankFactory;
import com.ait.application.MMCurrentAcc;
import com.ait.application.MMSavingAcc;

public class BankFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
MMBankFactory obj=new MMBankFactory();
MMSavingAcc akshi=(MMSavingAcc) obj.getNewSavingAcc(2445, "Akshi", 10000f, true);
akshi.withdraw(2300);
MMCurrentAcc kumar=(MMCurrentAcc) obj.getNewCurrentAcc(3244, "Kumar", 32324f, 50000f);
kumar.withdraw(8749);
}
}
