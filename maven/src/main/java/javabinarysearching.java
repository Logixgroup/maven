import java.util.Arrays;

public class javabinarysearching {
	
	
	public static void main(String[] args) {
		
		int[] inputarray = {1,2,3,56,67,679,765,9,90,15,40};
		Arrays.sort(inputarray);
		int sinput = 15;
		int left = 0; int high = (inputarray.length)-1; 
		int mid = 0;
		System.out.println(Arrays.toString(inputarray));
		
		while (left<=high) {
			
			 mid = (left+high)/2;
			 
			if  (sinput == inputarray[mid]) {
				System.out.println("found");
				break;
			}
			
			else if (inputarray[mid]>sinput) { 
				high = mid-1;
				
			}
			else if (inputarray[mid]<sinput) { 
				
				left = mid+1;
				
			}
			
		}
		
		System.out.println(inputarray[mid]);
		
	
	}

}
