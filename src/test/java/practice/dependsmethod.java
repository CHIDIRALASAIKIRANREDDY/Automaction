package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class dependsmethod {
@Test
public void login1() {
	Reporter.log("Running login1",true);
	//Assert.fail();
}

@Test(dependsOnMethods= {"login1"})
private void logout	() {
	// TODO Auto-generated method stub
Reporter.log("Running logout",true);

}
}

