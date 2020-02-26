import java.util.Arrays;
class Task6{
	public static void main(String[] args)
	{
		int[][] Array = {{1,3,2},{4,6,5}};
		for(int i=0;i<Array.length;i++)
		{
			Arrays.sort(Array[i]);
		}
		printArray(Array);
	}
	public static void printArray(int args[][])
	{
		for(int j=0;j<args.length;j++){
			for(int i=0;i<args[j].length;i++)
			{
			System.out.print(args[j][i]+" ");
			}
			System.out.println("");
		}
	}
}