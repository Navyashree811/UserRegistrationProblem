/*
 * UC3 : As a User need to enter a valid email.
 */
package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResistrationSystem {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration system using Regex");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Name : ");
		String firstName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}", firstName));

		System.out.println("Enter your Last Name : ");
		String lastName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));

		System.out.println("Enter your Email : ");
		String Email = sc.nextLine();
		System.out.println(Pattern.matches("^[a-zA-Z][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+$", Email));

	}

}
