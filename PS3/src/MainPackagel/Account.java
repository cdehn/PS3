package MainPackagel;

import java.util.Date;

public class Account {
	
	//data fields
	private int id; 
	private double balance;	
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	
	//no arg constructor
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}	
	
	
	//arg constructor that creates an account
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;	
	}
	
	
	//three methods
	public double getMonthlyInterestRate() {
		return ((annualInterestRate / 100) / 12);
	}
	
	

	public double withdraw(double amount) 
			throws InsufficientFundsException { 
		if(amount <= balance){
	         return (balance -= amount);
		}
		 else{
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
		 }
	}
	
	public double deposit(double amount) {
		return(balance += amount);
	}
	
	
	//accessors (getters) 
	public int getId(){
		return id;
	}	
	public double getBalance() {
		return balance;
	}	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public Date getdateCreated() {
		return dateCreated;
	}
	
	
	//mutators (setters)
	public void setId(int Id) {
		id = Id;
	}
	public void setBalance(double Balance) {
		balance = Balance;
	}
	public void setannualRate(double annualRate) {
		annualInterestRate = annualRate;
	}
}