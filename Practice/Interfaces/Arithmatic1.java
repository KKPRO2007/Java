package Interfaces;

public class Arithmatic1 implements ATM,Interest {
		int curBalance;
		public void withdraw(int a)
		{
			System.out.println(a);
		}
		public void checkBalance()
		{
			System.out.println(intBalance);
			
		}
		 public void ppf()
		 {
			 System.out.println(7.0); 
		 }
		 public void rateOfInterest()
		 {
			 Interest.super.rateOfInterest();
			 System.out.println(3.9); 
		 }
		public static void main(String[] arg)
		{
			Arithmatic1 a1=new Arithmatic1();
			a1.withdraw(200);
			a1.checkBalance();
			a1.rateOfInterest();
			a1.ppf();
			Interest.ppf();
			
	}

	}

}
