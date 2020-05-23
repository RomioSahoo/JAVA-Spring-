package com.product;
 
import java.util.Arrays;

import junit.framework.Test;
//import junit.framework.Test;  
import junit.framework.TestCase;


public class AppTest   
    extends TestCase  
{  
	
//testing arrays
    public void testApp()  
    {  
    	int[] a= {1,6,2,9};
    	int[] b= {1,2,6,9};
    	Arrays.sort(a);
    	assertTrue(Arrays.equals(b, a)); 
      
    }  

    
}  