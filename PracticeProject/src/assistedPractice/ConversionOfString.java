package assistedPractice;

public class ConversionOfString {
	

	public static void main(String[] args) {
		
		String first = "Java";
		System.out.println(first);
		
		StringBuffer sb=new StringBuffer(first);
		System.out.println("Convert String to String Buffer : " +sb);
		
		StringBuilder sb1=new StringBuilder(first);
		System.out.println("Convert String to string Builder :" + sb1);
		

	}

}
