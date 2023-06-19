package com.conderscapus.week2;

public class Week2Example {
	
 public static void main(String[] args) {
	 int age = 18;
	 
	 if(age > 20) {
		 System.out.println("you are an adualt");
		 }
	 if(age > 67) {
		 System.out.println("you are a senior");
		 
	 }else if (age >= 15){
		 System.out.println("you are a teenager");
	 }else if (age == 12) {
		 System.out.println("yout are a per-teen");
	 }else {
		 System.out.println("you are a child");
	 }
	 
	String output = "your age is " + age;
	
	System.out.println("your age is 18");
	
	if(output.equals("your age is 18")) {
		System.out.println("yay you can vote");
	}else if (output ==  "your age is 21") {
		System.out.println("yay you can dring / gamble");
	}
 }

}
