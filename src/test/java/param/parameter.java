package param;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	    
	    @Test
	    @Parameters({"MyName"})
	    public void testName(@Optional("Anshu") String name) {
	        System.out.println("My Name: " + name);
	    }

	    @Test
	    @Parameters({"MyName", "Age"})
	    public void testDetails(@Optional("Anshu") String name, @Optional("21") String age) {
	        System.out.println("My Name: " + name + ", Age: " + age);
	    
	    }
	
}


