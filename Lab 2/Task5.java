class Task5{
	public static int secondLargestElement(int[] array)
	{
		int largest=array[0];
		int seclargest = largest;
		for(int i=0;i<array.length;i++)
		{
			if(largest<array[i])
			{
				seclargest=largest;
				largest=array[i];
			}
		}
		return seclargest;
	}
	public static void main(String[] args)
	{
		int[] myArray = {1,2,3,4,5,5};
		System.out.println("Second largest element in the array is "+secondLargestElement(myArray));
	}
}