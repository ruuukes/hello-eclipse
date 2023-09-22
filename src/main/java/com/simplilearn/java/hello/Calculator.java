package com.simplilearn.java.hello;

public class Calculator {
	public static void main(String[] args) {

		System.out.println("Add " + add(5, 4));
		System.out.println("Subtract " + subtract(5, 4));
		System.out.println("Multiply" + multiply(5, 4));
		System.out.println("Divide" + divide(5, 4));
		System.out.println("Round" + round(5.));
		System.out.println("isEven" + isEven(8));
		System.out.println("isOdd" + isOdd(1));
		System.out.println("XNOR" + XNOR(true, false));
		System.out.println("addThreeNumbers" + addThreeNumbers(5, 4, 11));
		System.out.println("lt" + lt(5, 4));
	}

	// Simple Addition
	private static int add(int left, int right) {
		return left + right;
	}
	// Simple Subtraction
	private static int subtract(int left, int right) {
		return left - right;
	}
	// Simple Multiplication
	private static int multiply(int left, int right) {
		return left * right;
	}
	// Simple Division
	private static double divide(int left, int right) {
		return (double) left / right;
	}
	// Simple Rounding
	private static int round (double d) {
			return (int) Math.round(d);
		}
	// Even
	private static boolean isEven (int i) {
		return (i % 2 == 0);
}
	// Odd
	private static boolean isOdd (int i) {
		return (i % 2 == 1);
	}
	
	// XNOR
	private static boolean XNOR (boolean x, boolean y) {
		return (x && y) || (!x && !y);
	}
	
	// Add Three Numbers
	private static int addThreeNumbers (int first, int second, int third) {
		return first + second + third;
	}
	
	// Less Than
	private static boolean lt (int left, int right) {
		return left < right;
	}
	// multiply two integers and return an integer
	// divide: take two integers and return double
	// round take a single double param, return int
	// isEven ( take a single integer ) and return true if if it is even
	// isOdd ( take a single integer ) and return true if if it is odd
	// XNOR (takes two booleans and returns true if they are both true or both false
	// add three numbers
	// lt ( take two integers and return true if left is less than right)
}
