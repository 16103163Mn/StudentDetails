package org.college;

import java.util.HashSet;
import java.util.Set;

public class setClass {
	
	public static void main(String[] args) {
		Set <Integer> emp = new HashSet<>();
		emp.add(100);
		emp.add(200);
		emp.add(300);
		emp.add(100);
		System.out.println(emp);
		
		for (Integer x:emp) {
			System.out.println(x);
			
		 if (x == 200) {
		System.out.println("hi");
		
		}
		}
		
	}
}

