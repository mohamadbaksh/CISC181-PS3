package PS3;

	public class Test extends Account {

		public static void main(String[] args){
			// TODO Auto-generated method stub
			
			 Account z = new Account(1122, 20000,4.5);
				z.deposit (3000);
				System.out.println("Your ID is: " + z.getId());
				System.out.println("Your account balance is: $" + z.get_Balance());
				System.out.println("Monthly interest is: $" + z.monthly_interest());
				System.out.println("The account was created at: " + z.get_created_date());
			try{
				z.withdraw(2500);
				System.out.println("Drawing $2500 will leave you with a balance of $" + z.get_Balance());

				
				System.out.println(".....trying to draw $25000?......" );
				z.withdraw(25000);
		} 
			catch (InsufficientFundsException e){
				System.out.println("You have to add $" + e.getAmount() + " to be able to draw");
				e.printStackTrace();
	}
		}
	}


