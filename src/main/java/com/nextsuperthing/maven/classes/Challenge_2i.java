package com.nextsuperthing.maven.classes;


public class Challenge_2i {
	public static void main(String[] args) {
		int highest = 0;
		String[] inputArr = {"x4y5z", "ab2c7","gf5gf7fg5ff5"};
		for( int k=0;k<inputArr.length;k++) {
		String str = inputArr[k];
		int sum =0;		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				
				sum+=(str.charAt(i)-'0');
				
				if(sum>highest) {
					highest=sum;
					
				}
			}
		}
		
	}
		System.out.println("Print highest total value:"+ highest);
		
}}
