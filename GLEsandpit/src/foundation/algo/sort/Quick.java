package foundation.algo.sort;

import foundation.inheritance.Human;

public class Quick {

	private int array[];
	private Human humanarray[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
   
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
     
    
    
    
 public void sort(Human[] inputArr) {
        
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.humanarray = inputArr;
        length = inputArr.length;
        quickSortHuman(0, length - 1);
    }

 
    private void exchangeHuman(int i, int j) {
        Human temp = humanarray[i];
        humanarray[i] = humanarray[j];
        humanarray[j] = temp;
    }
    
    private void quickSortHuman(int lowerIndex, int higherIndex) {
        
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        Human pivot = humanarray[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (humanarray[i].getYearage() < pivot.getYearage()) {
                i++;
            }
            while (humanarray[j].getYearage() > pivot.getYearage()) {
                j--;
            }
            if (i <= j) {
            	exchangeHuman(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
        	quickSortHuman(lowerIndex, j);
        if (i < higherIndex)
        	quickSortHuman(i, higherIndex);
    }
    
    
    public static void main(String a[]){
         
    	Quick sorter = new Quick();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
