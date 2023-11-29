package exceptioandling;

public class TryAndCatch {

	public static void main(String[] args) {
		
		int c[]= {56,10,34,100};
		try {
			int res=100/1;
			System.out.println("result is " +res);
			int res2=c[1];
			System.out.println("result is"+res2);
			System.out.println("NO Exception");
		} catch(ArithmeticException e) {
			System.out.println("Divided By Zero"+e.toString());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index "+e.toString());
		}
		System.out.println("Normal Statement");
		
	}

}
