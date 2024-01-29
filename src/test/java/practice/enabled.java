package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {

@Test(enabled=false)
public void tc2() {
	Reporter.log("running tc2",true);	
}
}
