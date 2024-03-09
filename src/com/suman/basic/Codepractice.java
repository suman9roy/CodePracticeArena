package com.suman.basic;

public class Codepractice {
 public static void main(String[] args) //this is the signature what compiler is looking for and this is the entry point of the all java code
 {
	 System.out.println("in the main");
	 main(5);
 }
 public static void main(int a)//doing method overloading of main method  
 {
	 
	 System.out.println("in a another main");
 }
}
