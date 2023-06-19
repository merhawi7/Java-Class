package com.conderscapus.week2;

import java.util.Scanner;
public class Agedasi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in any name: ");
		String name = scanner.nextLine();
		System.out.println("you typed in: age");
		String age = scanner.nextLine();
		
		if (name.equals("mera") && age.equals("60")) {
		System.out.println("let's go");	
		}else {
			System.out.println("Hello: " + name);
		}
		
		scanner.close();

	}

}
