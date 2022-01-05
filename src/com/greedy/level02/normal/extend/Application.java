package com.greedy.level02.normal.extend;

public class Application {
	public static void main(String[] args) {
		Circle[] circleArr = new Circle[2];
		Rectangle[] rectangleArr = new Rectangle[2];
		
		circleArr[0] = new Circle(1, 2, 3);
		circleArr[1] = new Circle(3, 3, 4);
		
		rectangleArr[0] = new Rectangle(-1, -2, 5, 2);
		rectangleArr[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		for(Circle circle : circleArr) {
			circle.draw();
		}
		
		System.out.println("===== rectangle =====");
		for(Rectangle rectangle : rectangleArr) {
			rectangle.draw();
		}
	}
}
