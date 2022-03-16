package com.javaProgram.Rectangle;

import java.util.Scanner;

public class TestRectangle {
	
		public static int length;
		public static int breadth;
		public static int area;
	
	public static void main(String[] args) {
		TestRectangle tr= new TestRectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and breadth for rectangle 1: ");
		tr.length=sc.nextInt();
		tr.breadth=sc.nextInt();
		tr.area= length * breadth;
		System.out.println("area of rectangle 1: "+ tr.area);
		
		//2nd object
		TestRectangle tr2= new TestRectangle();
		System.out.println("enter length and breadth for rectangle 2: ");
		tr2.length=sc.nextInt();
		tr2.breadth=sc.nextInt();
		tr2.area= length * breadth;
		System.out.println("area of rectangle 2: "+ tr2.area);
		
		//3rd object
		TestRectangle tr3= new TestRectangle();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter length and breadth for rectangle 3: ");
		tr3.length=sc1.nextInt();
		tr3.breadth=sc1.nextInt();
		tr3.area= length * breadth;
		System.out.println("area of rectangle 3: "+ tr3.area);
		
		//4th object
		TestRectangle tr4= new TestRectangle();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length and breadth for rectangle 4: ");
		tr3.length=scan.nextInt();
		tr3.breadth=scan.nextInt();
		tr3.area= length * breadth;
		System.out.println("area of rectangle 4: "+ tr4.area);
		
		//5th object
		TestRectangle tr5= new TestRectangle();
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter length and breadth for rectangle 5: ");
		tr3.length=sc2.nextInt();
		tr3.breadth=sc2.nextInt();
		tr3.area= length * breadth;
		System.out.println("area of rectangle 5: "+ tr5.area);
		
	}

}
