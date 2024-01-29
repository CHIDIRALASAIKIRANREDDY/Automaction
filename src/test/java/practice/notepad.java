package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class notepad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream kk= new FileInputStream("C:\\Users\\saiku\\OneDrive\\Desktop\\testing.porperties");
Properties p= new Properties();
p.load(kk);
String un = p.getProperty("un");
System.out.println(un);
String b = p.getProperty("browser");
System.out.println(b);
String g= p.getProperty("password");
System.out.print(g);
String URL=p.getProperty("url");
WebDriver driver=new EdgeDriver();
driver.get(URL);
	}

}
