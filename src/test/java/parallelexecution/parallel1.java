package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel1 {

	@Test
	public void tc1() {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		
	}
	}


