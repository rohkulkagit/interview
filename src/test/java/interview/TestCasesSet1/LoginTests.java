package interview.TestCasesSet1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests {	

		
	@Test(enabled = true,priority=2)
	@Parameters({"browser","url"})
	public void testmethod11(@Optional String browser,String url){
		System.out.println("test method testmethod11");
		System.out.println("browser = "+browser);
		System.out.println("url = "+url);
	}

	
	@Test(enabled = true, priority=1)
	public void testmethod12(){
		System.out.println("test method testmethod12");
	}
	
}
