package assignment02;

import java.util.Scanner;

public class Question03 {
	
	static void testA() {//alternative way is to create temp variable and swap last array with 1st array
		String[] input= {"java","oracle","python","scala","hibernate"};
		String[] output=new String[input.length];
		for(int i=0;i<input.length;i++) {
			output[(output.length-1)-i]=input[i];
		}		
		for(int i=0;i<output.length;i++) {
			if(i==0) {
				System.out.print("Output: ");
			}
			System.out.print(output[i]+" ");
		}
		System.out.println();
	}//end of Question03a
	
	static void testB() {
		String input="oracle";
		char[] reverse= input.toCharArray();
		for(int i=reverse.length-1;i>=0;i--) {
			if(i==reverse.length-1) {
				System.out.print("Output: ");
			}
			System.out.print(reverse[i]);
		}		
		System.out.println();
	}//end of Question03b
	
	static void testC() {
		String[] input={"java","hibernate","python","scala","hibernate"};
		int countRepeat;
	        for (int i = 0; i < input.length; i++){
	        	countRepeat=1;
	        	for(int j=0;j<input.length;j++){
	        		if(i!=j && input[i].equals(input[j])){
	        			input[i]=null;
	        			countRepeat++;
	        		}
	        	}		        		        	
	}	     
	        for(int i=0;i<input.length;i++) {
	        	if(i<=0) {
	        		System.out.print("Output: ");
	        	}
	        	else if(input[i]==null) {
	        		continue;
	        	}
	        		System.out.print(input[i]+" ");
	        	}	              
	        System.out.println();
	}//end of Question03c
	
	static void testD() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check (number has to be 3 digit):");
		int input=sc.nextInt();
		int first;
		int second;
		int third;

		third=input%10;
		first=input/100;
		second=(input-(first*100)-third)/10;

		int checker=(first*first*first)+(second*second*second)+(third*third*third);
		System.out.println(first+" "+second+" "+third);
		if(checker==input) {
			System.out.println("This is an Armstrong number!");
		}
		else {
			System.out.println("This is not an Armstrong number!");
		}
		sc.close();

	}//end of Question03d

	public static void main(String[] args) {
		testA();
		testB();
		testC();
		testD();

	}




}
