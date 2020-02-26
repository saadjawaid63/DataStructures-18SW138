import java.util.Arrays;

class Task2{
   
    public static void main(String[] args){
    int arr1[]={1,2,3,4,5};
    int arr2[]={1,2,3,4,5};
    int arr3[]={1,2,3,4};
   
   if(Arrays.equals(arr1,arr2)==true){
   System.out.println("Arrays are equals");
 }  
  else{
  System.out.println("Arrays are not equals");
    }
   
   if(Arrays.equals(arr1,arr3)==true){
   System.out.println("Arrays are equals");
 }  
  else{
  System.out.println("Arrays are not equals");
    }

  }
}