class Task7{

  public static void main(String[] args){
  int len=0;
  int arr[]={20,20,30,40,50,50,50};
  for(int i=0; i<arr.length; i++){
  for(int j=i+1; j<arr.length; j++) 
  if(arr[i]==arr[j]){
   len++;
  }
  }
   System.out.println("New Length of arr after deleting the duplicate elements:"+len);
 }  

}