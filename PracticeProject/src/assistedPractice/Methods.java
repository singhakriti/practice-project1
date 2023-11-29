package assistedPractice;


public class Methods {
	public static void findEvenOdd(int num)  
	{  
	 
	if(num%2==0)   
	System.out.println(num+" is even");   
	else   
	System.out.println(num+" is odd");  
	}  
	public void display1() {
	    System.out.println("Method without parameter");
	  }

	  public void display2(int a) {
	    System.out.println("Method with a single parameter: " + a);
	  }

	public static void main(String[] args) {
		Methods obj = new Methods();
	    obj.display1();
	    obj.display2(24);
		System.out.print("The maximum number is: " + Math.max(9,7));  

	}

}
