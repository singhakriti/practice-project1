package sleepAndWait;

public class SleepAndWait {

private static Object LOCK = new Object();

	

	public static void main(String[] args)throws InterruptedException {
		System.out.println("Going to sleep for 10 secs");
		
		  
	    Thread.sleep(10000);
	   
	    System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 10 second");
	  
	    synchronized (LOCK) 
	    {
	        LOCK.wait(1000);
	       
	        System.out.println("Object '" + LOCK + "' is woken after" +" waiting for 10 second");
	    }
	}

}
