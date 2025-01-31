package fridayTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class SecurityTests {
	
	
	       @Test
	       
	              void testLoginWithEmptyUsernameShouldReturnFalse() {
	    	   
	    	                Security security = new Security();
	    	                
	    	                             assertFalse(security.login("",  "Password1$", 10));
	       }
	       
}
	       
