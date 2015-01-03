package foundation.algo.sort.test;

import org.junit.Test;

public class AssertTests {
	
	  @Test
	  public void testAssertArrayEquals() {
	    
		
		  
		byte[] expected = "trial".getBytes();
	    byte[] actual = "trial".getBytes();
	    
	    
	    org.junit.Assert.assertArrayEquals("failure - byte arrays not same", expected, actual);
	  }
	  
	  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AssertTests tests = new AssertTests();
			
			tests.testAssertArrayEquals();

		}

}
