/*Points Learned is that
1. For property injection only two options are there 
a)Constructor injection
b)Setter Injection

U cannot inject property from spring by using property tag and using value.Internallly they use setter or constructor to 
inject the value in the field*/

package org.DrawingAppDemo;

public class Triangle {
	// inject some constant value directly on field from xml
	/*private String type;
	private int height;*/
	Point pointA;
	Point pointB;
	Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	// constructor injection
/*	public Triangle(int height) {
		this.height = height;
	}

	// constructor injection.
	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(String type, int height) {
		this.height = height;
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	// setter injection used here.
	
	  public void setType(String type) { this.type = type; }*/
	 

	public void draw() {
		//System.out.println("Type of triangle is " + getType() + " height of the triange is " + getHeight());
		System.out.println("X is "+getPointA().getX()+" Y is "+getPointA().getY());
		System.out.println("X is "+getPointB().getX()+" Y is "+getPointB().getY());
		System.out.println("X is "+getPointC().getX()+" Y is "+getPointC().getY());
	}
}
