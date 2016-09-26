class SortingTester{
   public static void main(String a[]){
        int[] arr1 = {10,34,2,100,41,23,54,65,78,2,1,4};
        //int[] arr2 = insertionSort(arr1);
	Sorting so = new Sorting();
	so.insertionSort(arr1);
        for(int i:arr1){
            System.out.print(i);
            System.out.print(", ");
	    
        }
        for(int i=0; i<arr1.length; i++){
	  System.out.println("\nsorted: "+ arr1[i] + ",");
	}
    }
}