package diamond;
interface Interface1  
{  
public default void display()   
{  
System.out.println("method of DemoInterface1 invoked");  
}  
}  
interface Interface2  
{  
public default void display()   
{  
System.out.println("method of DemoInterface2 invoked");  
}  
}

public class DiamondProblem implements Interface1, Interface2  {
		public void display()   
		{  
		Interface1.super.display();  
		Interface2.super.display();  
		}  

	public static void main(String[] args) {
		DiamondProblem obj = new DiamondProblem();  
		obj.display(); 

	}

}
