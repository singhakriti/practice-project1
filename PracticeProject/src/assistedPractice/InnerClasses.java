package assistedPractice;
class Outer {
	 
    class Inner {
 
        public void show()
        {
            System.out.println("In a nested class method");
        }
    }
}
class Outer1 {
	 
    void outer1Method()
    {
        System.out.println("inside outer1Method");
 class Inner2 {
            void inner2Method()
            {
                System.out.println("inside inner2Method");
            }
        }
 Inner2 y = new Inner2();
 y.inner2Method();
}
}
 

public class InnerClasses {

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
        in.show();
        Outer1 x = new Outer1();
        
        x.outer1Method();

	}

}
