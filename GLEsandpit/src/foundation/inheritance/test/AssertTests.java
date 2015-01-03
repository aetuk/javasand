package foundation.inheritance.test;

import org.junit.Test;

import foundation.inheritance.Human;

public class AssertTests {

	

	 @Test
	  public void testAssertEquals() {
		 
		Human andrew = new Human();
		 
	    org.junit.Assert.assertEquals("failure - strings are not equal", andrew.eat(), "fish and chips");
	  
	 }
	 
	 @Test
	  public void testAssertEquals1() {
		 
		Human andrew = new Human();
	    org.junit.Assert.assertEquals("failure - strings are not equal", andrew.eat(), "food");
	  
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssertTests tests = new AssertTests();
		
		tests.testAssertEquals();
		tests.testAssertEquals1();
	}

}
