package Interfaces;

public interface Interest {
		int intBalance=500;
		default void rateOfInterest() {
			System.out.println("rate of interest 2.5");
		}
		static void ppf()
		{
			System.out.println("rate of interest 7.5");
		}
		
		}

}
