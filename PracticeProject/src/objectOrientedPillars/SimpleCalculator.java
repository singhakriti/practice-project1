package objectOrientedPillars;

public class SimpleCalculator implements Calculator{

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public int difference(int a, int b) {
		if(a>b) {
			return a-b;
		} else {
			return b-a;
		}
	}

	@Override
	public int product(int a, int b) {
		return a*b;
	}

	@Override
	public int divison(int a, int b) {
		return a/b;
	}

}
