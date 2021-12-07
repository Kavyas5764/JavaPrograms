//4. to find the greatest value in array
package arraydemo;
public class arrayprg2 {

	public static void main(String[] args) {
				int[] arr = new int[] {25,43,88,67};
				int max= arr[0];
				for(int i=0;i<arr.length;i++) 
				{
					if(arr[i]>max)
						max=arr[i];
				}
			System.out.println("Greatest element present in given array:"+max);
		}
	
	

}
