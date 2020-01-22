
public class arrayProgram {
	
	 public static void main(String args[]) {
/*	
	//arrayProgram	
		int array[] = new int[7];
		for(int count=0;count<7;count++) {
			array[count]=count+1;
		}
		for(int count=0;count<7;count++) {
			System.out.println("array["+count+"] = "+array[count]);
		}
	}
 */
	
//ArrayByReference	
/*	public static void passByReference(String a[]) {
	  a[0]= "changed";	
	}
	
	    String []b= {"Apple","Mango","Orange"};
	    System.out.println("Before Funtion Call     "+b[0]);
	    arrayProgram.passByReference(b);
	    System.out.println("After Funtion Call       "+b[0]);
	
	*/
	
	//ArrayMultidimensional 
		
	int[][] twoD = new int[4][4];
	
	// Assign Three elements in it.
	twoD[0][0] = 1;
	twoD[1][1] = 2;
	twoD[3][3] = 3;
	System.out.println(twoD[0][0] +  "     " );	 
    }
}
