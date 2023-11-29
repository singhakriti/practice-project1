package objectOrientedPillars;

public class OopsMain {

	public static void main(String[] args) {

		AdvanceCalculator calculator = new AdvanceCalculator();
		int x=5, y=3;
		
		System.out.println("sum of x and y is: " + calculator.sum(x, y));
		
		System.out.println("difference of x and y is: " + calculator.sum(x, y));
		
		System.out.println("multiplication of x and y is: " + calculator.product(x, y));
		
		System.out.println("division of x and y is: " + calculator.divison(x, y));
		
		System.out.println("sum of x and y is: " + calculator.sum(x, y, 3));

	}

}
