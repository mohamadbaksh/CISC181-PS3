package PS3;
import java.io.*;

public class InsufficientFundsException extends Exception{
		
		private double amount_missing;
		
		
		public InsufficientFundsException(double amount){
			this.setAmount(amount);
		}


		public double getAmount() {
			return amount_missing;
		}
		

		public void setAmount(double amount) {
			this.amount_missing = amount;
		}

	}


