package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class disable {
	@Test
	public void tc1() {
		Reporter.log("running tc1",true);
	}
	@Test
	public void tc2() {
		Reporter.log("running tc2",true);
	}
	@Test
	public void tc3() {
		Reporter.log("running tc3",true);
	}
}
