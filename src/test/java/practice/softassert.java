package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class softassert {
private static softassert soft;
@Test 
public void sample() {
	String str1= "hi";
	String str2="hello";
	softassert.soft=new softassert();
	soft.assertequals(str1,str2);
	System.out.print("hii i am after failiy 1st verfication");
	soft.assertall();
}
private void assertall() {
	// TODO Auto-generated method stub
	
}
private void assertequals(String str1, String str2) {
	// TODO Auto-generated method stub
	
}
@Test 
public void sample2() {
	Reporter.log("hello",true);
}
}
