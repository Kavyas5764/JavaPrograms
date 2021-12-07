package arraydemo;

public class arrayavg {

	public static void main(String[] args) {		
		//1.program to find the average of array elements
		//creating an array
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		//getting an array length
		int length = array.length;
		
		//default sum value
		int sum = 0;
		//sum of all values in array using for loop
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		double average = sum/length;
		System.out.println("Average of array:" +average);
		
		
		
		
		
		//2.to find the vowels in the entered array
		String str = "hellowelcomewebpage";
		str = str.toLowerCase();
		
		char[] chars = str.toCharArray();
		
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e'
					|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				
		//count incrementd if there is vowel in
		//char[i]
		count++;
			}
		}
		
		//display total count of vowels
		System.out.println("Total number of vowels in string are: " +count);
		
		
		
		
		//3.to find the smallest value in array
		int[] arr1 = new int[] {25,43,45,67};
		int min= arr1[0];
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]<min)
				min=arr1[i];
		}
		System.out.println("Smallest element present in given array:"+min);
	}
}


