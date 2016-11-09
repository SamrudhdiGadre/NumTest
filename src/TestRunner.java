import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	
	@Test
	public void printResult(){
		Result result = JUnitCore.runClasses(TestJunit.class);
		  System.out.println("TestRunner Result - " );
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
		}
	    System.out.println(result.wasSuccessful());
	    	  
	}
}
