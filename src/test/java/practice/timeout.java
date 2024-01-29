package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
	@Test
	public void tc5() {
		Reporter.log("running tc5",true);
}
	public void tc1() {
		Reporter.log("running tc1",true);	
	}
	@Test(timeOut = 90000)
	public void tc2() {
		Reporter.log("running tc2",true);	
	}
	@Test
	public void tc3() {
		Reporter.log("running tc3",true);	
	}
}
