package com.spring.restful.TestREST;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 

{
	    // Important note:
	    // The value of masks given here is hard-coded for m == 5.
	    // In a complete solution, you need to calculate the masks for the
	    // actual value of m given. See explanation in answer for more details.

	    int[] masks = { 0, 3, 6, 12, 15, 24, 27, 30 };
	    
	   // int[] masks = { 0, 1,2,3,4,5,6,7 };

	   /* int CountTilings(int n, int m)
	    {
	    	 int s=0;
	        if (n == 1) { return 1; }

	        int result = 0;
	        for(int mask : masks)
	        {
	            if ((mask & s) == 0)
	            {
	            //	System.out.println(result);
	                result += CountTilings(n - 1, m);
	            }
	        }
	        return result;
	    }*/
	    
	     int CountTilings(int n, int m, int s ) {
	    	if (n == 1) { return 1; } int result = 0; 
	    	int maxval=(int) Math.pow(2, m); 
	    	for(int i=0;i<masks.length;i++) {
	    		if (maxval<masks[i]){
	    			break; 
	    			} if ((masks[i] & s) == 0) { 
	    				result=result%10000007; result += 
	    						CountTilings(n - 1, m, masks[i]); } } 
	    return result;
	    }
	    public static void main(String[] args) {

	        App p = new App();
	        int result = p.CountTilings(1, 3,0);
	        
	        System.out.println(result);
		}

	    public static void Main(String[] arg)
	    {
	       // Console.WriteLine(result);
	    }
    
   
   
}
