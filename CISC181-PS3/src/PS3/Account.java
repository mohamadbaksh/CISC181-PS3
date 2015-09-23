package PS3;

import PS3.InsufficientFundsException;

public class Account {



	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate= 0;
	private java.util.Date created_date;
	
	
	
	public Account(){

	}


	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance= balance;
		this.annualInterestRate= annualInterestRate;
		created_date = new java.util.Date();
	}


	
	public double get_Balance() {
		return balance;
	
	
	}


	
	public void set_Balance(double balance) {
		this.balance = balance;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	
	public int getId() {
		return id;
	}


	
	public void setId(int id) {
		this.id = id;
	}

	public double monthly_interest(){
		return (balance* (getAnnualInterestRate()/1200));
		
	}
	
	
	public java.util.Date get_created_date(){
		return created_date;
	}
	
	
	public void withdraw(double amount)throws 
	InsufficientFundsException
	{
		
		if (amount<=balance){
		balance-=amount;
		}
		else{
			double still_need= amount-balance;
			throw new InsufficientFundsException(still_need);
		}
	}
	
	public void deposit(double amount){
		balance+= amount;
		
	}
	
	
	
}


