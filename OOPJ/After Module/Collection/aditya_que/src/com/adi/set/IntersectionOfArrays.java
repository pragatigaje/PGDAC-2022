package com.adi.set;

import java.util.*;

public class IntersectionOfArrays {
	public static void main(String args[]) {
		int[] arr1 = {10,4,52,12,41,58,41};
		int[] arr2= {11,12,41,56,41,74,52};
		
		Set<Integer> union = new LinkedHashSet<Integer>();
		
		for(int i=0; i<arr1.length ; i++) {
			union.add(arr1[i]);
		}
		for(int i=0; i<arr2.length ; i++) {
			union.add(arr2[i]);
		}
		System.out.println("Union of arrays :"+union);
		
		Set<Integer> intersection = new LinkedHashSet<Integer>();
		
		for(int i=0; i<arr1.length ; i++) {
			intersection.add(arr1[i]);
		}
		for(int i=0; i<arr2.length ; i++) {
			if(intersection.contains(arr2[i])) {
				System.out.print(arr2[i]+" , ");
			}
		}
	}
}


