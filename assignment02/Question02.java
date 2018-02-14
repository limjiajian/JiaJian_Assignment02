package assignment02;

import java.util.Arrays;

public class Question02 {
	
	static void testA() {
		
		int numbers[]= {1,2,3,4,5,6,7,8,9,10,11};
		int input[]= {1,2,4,6,3,7,8,9,10,11};
		boolean missing[]=new boolean[numbers.length];		
		Arrays.fill(missing, false);//create a boolean array with false variables

		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<input.length;j++) {
			if(input[j]==numbers[i]) {//check if number is inside input if yes set the corresponding boolean array to be true
				missing[i]=true;
				break;				//stop checking against rest of the numbers
			}
			}
			}
		for(int k=0;k<missing.length;k++) {//print out boolean false array which is those missing from numbers
			if(missing[k]==false) {
				System.out.print("Output: "+ numbers[k]+" ");
			}
		}
		System.out.println();
		}//end of Question02a
	
	static void testB() {
		int[] input={5,2,9,15,2,7,7,18,15,5};
		int countRepeat;
	        for (int i = 0; i < input.length; i++){
	        	countRepeat=1;//set a counter of how many times number appear (by default is 1)
	        	for(int j=0;j<input.length;j++){
	        		if(i!=j && input[i]==input[j]){
	        			countRepeat++;//increase the counter if number appear again
	        		}
	        	}
	        	if(countRepeat==1){
	        	System.out.print("Output: "+input[i]);//if counter is only 1, number appears once=>stop as you only want the first number
	        	break;
	        	}
	}	        
	        System.out.println();
	}//end of Question02b

	static void testC() {
		int[] input={5,2,9,15,2,7,7,18,15,5};
		int smaller;

		for (int i = 0; i < input.length-1; i++){
			for (int j = 0; j < input.length-1; j++){
				if(i!=j && input[j+1]<input[j]){
					smaller=input[j+1];
					input[j+1]=input[j];
					input[j]=smaller;							
				}
		}			
		}
		for (int i = 0; i < input.length; i++){
			if(i<=0) {
				System.out.print("Output: ");
			}
			System.out.print(+input[i]+" ");
		}		
		System.out.println();
	}//end of Question02c
	
	static void testD() {
		int[] input={16,7,89,20,7,99,21,56,12,10};
		int countRepeat;
	        for (int i = 0; i < input.length; i++){
	        	countRepeat=1;
	        	for(int j=0;j<input.length;j++){
	        		if(i!=j && input[i]==input[j]){
	        			countRepeat++;
	        		}
	        	}
	        	if(countRepeat>1){
	        	System.out.print("Output: "+input[i]);
	        	break;
	        	}
	}	        	
	        System.out.println();
	}//end of Question02d
	
	static void testE() {
			int[] input={16,4,89,20,7,99,21,56,12,10};
			int largest = input[0];
			int smallest = input[0];


			for (int i = 0; i < input.length-1; i++){
				if(input[i]!=largest&&input[i]>largest){
					largest=input[i];
				}
				if(input[i]!=smallest&&input[i]<smallest){
					smallest=input[i];
				}
			}
				System.out.print("Output: "+smallest+" "+largest);
				System.out.println();
	}//end of Question02e
	
	static void testF() {
		int[] input={16,4,20,20,7,99,21,56,12,10};
		int countRepeat;
	        for (int i = 0; i < input.length; i++){
	        	countRepeat=1;
	        	for(int j=0;j<input.length;j++){
	        		if(i!=j && input[i]==input[j]){
	        			input[i]=0;
	        			countRepeat++;
	        		}
	        	}		        		        	
	}	     
	        for(int i=0;i<input.length;i++) {
	        	if(i<=0) {
	        		System.out.print("Output: ");
	        	}
	        	else if(input[i]==0) {
	        		continue;
	        	}
	        		System.out.print(input[i]+" ");
	        	}	              
	        System.out.println();
	}//end of Question02f

	public static void main(String[] args) {
		testA();
		testB();
		testC();
		testD();
		testE();
		testF();

	}

}
