package com.javaProgram.project;


class Rectangle{
	public int length;
	public int breadth;
	public int area;


	//default constructor
	public Rectangle() {
	}


	//Constructor
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	//find area of rectangle
	public void printArea() {
		area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}

// display all data of rectangle
	public void printData() {
		System.out.println("Length of Rectangle is : " + length);
		System.out.println("Breadth of Rectangle is : " + breadth);
	
	}
	
}
public class Rectangle_problem {
	public static void main(String[] args) {
		Rectangle rec2 = new Rectangle(6, 3);
		
		rec2.printData();
		rec2.printArea();
		
		


	}

	
}


