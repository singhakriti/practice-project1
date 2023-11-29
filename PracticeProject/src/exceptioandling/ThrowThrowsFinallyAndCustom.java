package exceptioandling;
class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}

public class ThrowThrowsFinallyAndCustom {
	static void avg()
	  {
	    try
	    {
	      throw new ArithmeticException("demo");
	    }
	    catch(ArithmeticException e)
	    {
	      System.out.println("Exception caught");
	    }
	 }
	static void check() throws ArithmeticException
	  {  
	    System.out.println("Inside check function");
	    throw new ArithmeticException("demo");
	  }

	public static void main(String[] args) {
		avg();
		 try
		    {
		      check();
		    }
		catch(ArithmeticException e)
	    {
	      System.out.println("caught" + e);
	      }
		 int a[] = new int[2];
		    try
		    {
		      System.out.println("Access invalid element"+ a[3]);
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		      System.out.println("Exception caught");
		    }
		    finally
		    {
		      System.out.println("finally is always executed.");
		    }
		    try {
	            
	            throw new MyException("Organizations");
	        }
	        catch (MyException ex) {
	            System.out.println("Caught");
	            System.out.println(ex.getMessage());

	        }
	}
}

