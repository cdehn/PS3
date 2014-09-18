package MainPackagel;

import java.io.*;

public class InsufficientFundsException extends Exception  {

		private double amount;
		
		public InsufficientFundsException(double amount){
			this.amount = amount;
		}
		
		public double getAmountNeeded(){
			return amount;
		}
		
	} 	

