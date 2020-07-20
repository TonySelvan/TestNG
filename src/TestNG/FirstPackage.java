package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstPackage {
  @Test
  public void firstcase() {
	  System.out.println("This is First Test Case");  
  }
  
  @Test
  public void secondcase() {
	  System.out.println("This is Second Test Case");	  
  }
  
  @BeforeTest
  public void BforTest()
  {
	  System.out.println("This is Executed Before Test");
  }
 
  @AfterTest
  public void AfterTest()
  {
	  System.out.println("This is Executed After Test");
  }
  
}