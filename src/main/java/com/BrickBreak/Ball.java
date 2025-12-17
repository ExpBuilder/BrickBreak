package com.BrickBreak;
import java.awt.*;

//  Class author:  Joe Jiao
//  Date created:  12/5/2025
//  General description:   This class defines a ball for the game along with various methods to interact with the ball.
public class Ball {
	// Instance Variables
	private int x;
	private int y;
	private int xVelocity;
	private int yVelocity;
	private int size;
	
	// Ball constructor
	public Ball (int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}

	// Methods to set and get x and y, respectively
	public void setX (int initX) {
		this.x = initX;
	}
	public void setY (int initY) {
		this.y = initY;
	}
	public int getXpos () {
		return this.x;
	}
	public int getYpos () {
		return this.y;
	}

	// Get ball size
	public int getSize() {
		return size;
	}

	// Methods to set x and y velocities, respectively
	public void setXVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	public void setYVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	
	// Precondition: No inputs
	// Postcondition: xVelocity is reversed
	public void reverseX() {
		xVelocity *= -1;
	}
		
	// Precondition: No inputs
	// Postcondition: yVelocity is reversed
	public void reverseY() {
		yVelocity *= -1;
	}

	// Precondition: No inputs
	// Postcondition: The ball's xVelocity and yVelocity are added to the ball's x and y, respectively
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}

	// Precondition: g is not null
	// Postcondition: The ball is drawn at (x,y)
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.drawOval(x, y, size, size);
	}
}
