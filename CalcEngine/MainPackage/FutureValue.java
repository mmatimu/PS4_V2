package MainPackage;

public class FutureValue {

	/*
	 * Testing Code
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter Investment Amount: ");
		double PresentValue = user_input.nextDouble();
		
		System.out.print("Enter numbers of years of investment: ");
		int Years = user_input.nextInt();
		
		System.out.print("Enter Interest Rate: ");
		double InterestRate = user_input.nextDouble();
		
		double FValue = PresentValue * Math.pow((1 + InterestRate/100), Years);
		
		System.out.println(FValue);
	
	}
	*/
	
	public double returnFutureValue(double PresentValue, double Years, double InterestRate) {
		
		return (int)PresentValue * Math.pow((1 + InterestRate/100), Years);
		
	}
}
