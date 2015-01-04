package foundation.algo.sort.test;

import org.junit.Test;

import foundation.algo.sort.Quick;
import foundation.inheritance.Human;

public class AssertTests {
	
	  @Test
	  public void testAssertArrayEquals() {
	    
		/* Human[] team =  new Human[5];
		Human[] team2 =  new Human[5];
		
		team[0] = new Human();
		team[1] = new Human();
		team[2] = new Human();
		team[3] = new Human();
		team[4] = new Human();
		
		team2[0] = new Human();
		team2[1] = new Human();
		team2[2] = new Human();
		team2[3] = new Human();
		team2[4] = new Human();
		
		team[0].setYearage(35);
		team[1].setYearage(54);
		team[2].setYearage(39);
		team[3].setYearage(40);
		team[4].setYearage(20);
		
		
		team2[0].setYearage(35);
		team2[1].setYearage(54);
		team2[2].setYearage(39);
		team2[3].setYearage(40);
		team2[4].setYearage(20); */
		
		Quick sorter = new Quick();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        int[] input2 = {24,2,45,20,56,75,2,56,99,53,12};
        
        sorter.sort(input);
        //sorter.sort(input2);
		  
	    
	    org.junit.Assert.assertArrayEquals("failure - human arrays not same", input, input2);
	  }
	  
	  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AssertTests tests = new AssertTests();
			
			tests.testAssertArrayEquals();

		}

}
