package foundation.algo.sort;


public class Bubble {
	
	public static void Sort( int [ ] num )
	{
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] > num[j+1] )   // change to > for ascending sort
	                   {
	                           temp = num[ j ];                //swap elements
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred 
	                  }
	            }
	      }
	} 
	
	  public static void main(String a[]){
	         
		  //Bubble sorter = new Bubble();
	        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
	        Bubble.Sort(input);
	        for(int i:input){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }

}
