package com.spring.restful.TestREST;

// you can also use imports, for example:
// import java.math.*;
class Solution {
  public int visible (Tree T ) {
    //... write your code here ...
    
    
    // get the element in one node 1 
    
    while(T!=null){
    
    int i = T.x;
    System.out.println(i);
    
        T = T.l;
    visible (T);
    T = T.r;
    visible(T);
    
    return i;
    
  }
	return 0;
  
 
}
  
  class Tree {
	  
	  public int x;
	  public Tree l;
	  public Tree r;
	  
	  public Tree(int i){
	  
	  this.x =i;
	  
	  }
	  
	 
	  }
	  }
