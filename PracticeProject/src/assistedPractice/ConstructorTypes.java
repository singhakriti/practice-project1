package assistedPractice;
class Student {
    Student(){
        System.out.println("This is the default constructor of Student class.");
    }

}

class Employee {
    Employee(String name, int id){

        System.out.println("Id of employee is " +id+ " and anme of the employee is "+ " "+ name);
    }
    
}

public class ConstructorTypes {

	public static void main(String[] args) {
		Student obj1 = new Student();
		Employee obj2 = new Employee("Ajay",42);

	}

}
