import java.util.*;
public class SecondTask{

	// Binary Search Method for Characters
	static int forCharacters(char[] array, char item){
	
		int lowerBound = 0;
		int upperBound = array.length;
		int midPoint = 0;

		while( lowerBound<upperBound ){

			midPoint = (lowerBound + upperBound)/2;


			if(array[midPoint] < item){ lowerBound = midPoint; }

			if(array[midPoint] > item){ upperBound =  midPoint+1; }

			if(array[midPoint] == item ){ return midPoint; }

		}

		return -1;
	}

	// Binary Search Method for Strings
	static int forStrings(String[] array, String item){

		int lowerBound = 0;
		int upperBound = array.length;
		int midItem;

		while( lowerBound<upperBound ){

			midItem = (lowerBound + upperBound)/2;

			if( item.compareTo(array[midItem]) < 0 ){ upperBound = midItem; }
			if( item.compareTo(array[midItem]) > 0 ){ lowerBound = midItem; }
			if( item.compareTo(array[midItem]) == 0 ){ return midItem; }
			
		}

		return -1;
	}

	

	public static void main(String[] args) {
		
		// Method Testing for Characters 
		char[] characArray = {'a','b','c','d','e','f','g','h','i','j'};
		System.out.println(Arrays.toString(characArray));
		System.out.println("Character index: " + SecondTask.forCharacters(characArray, 'j'));


		// Method Testing for Strings
		String[] stringArray = {"Hello", "Merhaba", "Hola", "Assalamualikum", "Namaste", "Konnichiva"};
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(stringArray));
		System.out.println("String Value index: " + SecondTask.forStrings(stringArray, "Hola"));
	}

}