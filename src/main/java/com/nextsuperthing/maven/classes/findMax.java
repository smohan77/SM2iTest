package com.nextsuperthing.maven.classes;

import java.util.Scanner;

public class findMax {
	public static void main(String[] args) {
		int highest = 0;
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter  array of characters and digits as strings (space-separated): ");
		 String inputArray = scanner.nextLine();
		 String[] inputArr = inputArray.split(" ");
		 
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
