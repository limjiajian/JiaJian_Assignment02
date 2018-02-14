package assignment02;

import java.util.Arrays;

public class Question04 {

	public static void main(String[] args) {
		int arr1[]= {4,7,3,9,2};
		int arr2[]= {3,2,12,9,40,32,4};
		boolean missing[]=new boolean[arr1.length];		
		Arrays.fill(missing, false);//create a boolean array with false variables
		
		System.out.print("Output: ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
			if(arr2[j]==arr1[i]) {//check if number is inside input if yes set the corresponding boolean array to be true
				missing[i]=true;
				break;				//stop checking against rest of the numbers
			}
			}
			}
		for(int k=0;k<missing.length;k++) {//print out boolean false array which is those missing from numbers
			if(missing[k]==true) {
				System.out.print(arr1[k]+" ");
			}
		}
		System.out.println();
		}//end of Question4

	}


