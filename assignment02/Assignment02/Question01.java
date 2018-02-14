package assignment02;



public class Question01 {
	
	static void test1() {
		for (int i=1; i<6; i++)
		  {
		  for (int j=0; j<i; j++)
		  {
		  System.out.print("*");
		  }
		  System.out.println();
		  }
		}
	
	static void test2() {
		for (int i=0; i<6; i++)
		  {
		  for (int j=0; j<i; j++)
		  {
		  System.out.print(j+1);
		  }
		  System.out.println();
		  }
		}
	
	static void test3() {
		for (int i = 0; i<6
				;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			   }
			for (int k=0;k<i; k++) {
				System.out.print("* ");
			}
			System.out.println();
			  }
			 }
		
	static void test4() {
		for (int i=0; i<6; i++)
		  {
		  for (int j=0; j<i; j++)
		  {
		  System.out.print(i);
		  }
		  System.out.println();
		  }
	}
	
	static void test5() {
		for (int i=0; i<6; i++)
		  {
			int k=5;
		  for (int j=0; j<i; j++)
		  {
		  System.out.print(k);
		  if(k>0)k--;
		  }
		  System.out.println();
		  }
		}
	
	static void test6() {
		for (int i=0; i<6; i++)
		  {
		  for (int j=0; j<i; j++)
		  {
		  System.out.print(j+1);
		  }
		  int k=i;
		  while(k>1)System.out.print(--k);
		  System.out.println();
		  }		
		}
	
	public static void main(String[] args) {
		//top left to right of q1
		test1();
		test2();
		test3();
		//bottom left to right of q1
		test4();
		test5();
		test6();
	}

}
