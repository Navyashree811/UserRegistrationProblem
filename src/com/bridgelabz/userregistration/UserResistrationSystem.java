/*
 * UC1 : Valid First Name with first letter starting with capital and has minimum 3 characters in it.
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

	}

}
