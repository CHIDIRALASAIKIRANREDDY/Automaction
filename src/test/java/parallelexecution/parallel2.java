package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallel2 {
	@Test
	public void tc2() {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
}

}
