
                      
public class InsertionSort {
      public static void printarr(int arr[]){
     for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
     }
      }
    public static void main ( String[] args ){
        int arr[]={3,6,9,2,7,4,1,8,5};
         
        for(int i=3; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
       while(j>=0 && current<arr[j]) {
              arr[j+1]=arr[j];
              j--;
       } 

       arr[j+1]=current;


        }
        printarr(arr);
       
    }
}
