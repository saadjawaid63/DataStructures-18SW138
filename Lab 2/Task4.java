
class Task4{
   
   public static float returnAvg(int[] arr){
    float avg=0; 
    float sum=0; 
    for(int i=0; i<arr.length; i++){
     sum+=arr[i];

   }
   avg=sum/arr.length;
   return avg;
}

 

   public static void main(String[] arga){
   
   int arr1[]={1,2,3,4,5,6};
   System.out.println(returnAvg(arr1));
    
     
   }

}