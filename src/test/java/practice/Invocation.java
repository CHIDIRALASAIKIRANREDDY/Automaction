package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount=10)
	public void tc() {
		Reporter.log("running tc1",true);	
	}
}
