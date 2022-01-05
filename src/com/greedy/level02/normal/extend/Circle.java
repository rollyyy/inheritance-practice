package com.greedy.level02.normal.extend;

public class Circle extends Point {
private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		super.draw();
		System.out.printf("면적 : %.2f\n", Math.PI * radius * radius);
		System.out.printf("둘레 : %.2f\n", Math.PI * radius * 2);
		System.out.println("면적 : " + Math.PI * radius * radius) ;
		System.out.println("둘레 : " + Math.PI * radius * 2);
	}
}
