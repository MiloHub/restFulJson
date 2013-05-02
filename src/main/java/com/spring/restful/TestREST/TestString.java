package com.spring.restful.TestREST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestString implements Comparator<String> {
	
	String ts =null;

	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public TestString(){
		
	}
	
public TestString(String s){
	this.ts = s;
		
	}


	
	public static <T> void main(String[] args) {
		
		
		List<TestString> lst = new ArrayList<TestString>();
		
		lst.add(new TestString("dhanaraj") );
		lst.add(new TestString("dhanaraj1"));
		lst.add(new TestString("dhanaraj2"));
		lst.add(new TestString("Dhanaraj"));
		
		Collections.sort(lst,new Comparator<TestString>() {

			public int compare(TestString o1, TestString o2) {
				// TODO Auto-generated method stub
				return o1.ts.compareToIgnoreCase(o2.ts);
			}

			
			
		});
		
		
		/*for(TestString ts : lst){
			System.out.println(ts.ts);
		}
		*/
		List<String> stlst= new ArrayList<String>();
		stlst.add("abc");
		stlst.add("Abc");
		stlst.add("Cde");
		stlst.add("fge");
		stlst.add("ced");
		Collections.sort(stlst,String.CASE_INSENSITIVE_ORDER);
		
		for(String ts : stlst){
			System.out.println(ts);
		}
		/*int[] intaa = {2,45,3,45,4,6};
		
		Arrays.sort(intaa);
		
		int n =intaa.length;
		if(n%2!=0){
		
		int median =intaa[(n-1)/2];
		System.out.println("odd..."+median);
		}else{
			int median =(intaa[n/2]+intaa[(n/2)-1])/2;
			System.out.println("even.."+median);
		}*/
	
	}
	
	
	
	
}
