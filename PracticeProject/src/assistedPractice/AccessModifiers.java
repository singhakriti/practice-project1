package assistedPractice;

	class Animal1 {
	    void message(){
	        System.out.println("This is a message");
	    }
	}
	class Animal {
	    private String name;

	    // getter method
	    public String getName() {
	        return this.name;
	    }
	    // setter method
	    public void setName(String name) {
	        this.name= name;
	    }
	}
	
	    public class AccessModifiers {

	public static void main(String[] args) {
		 Animal d = new Animal();

	        d.setName("Reha");
	        System.out.println(d.getName());

	}
}
