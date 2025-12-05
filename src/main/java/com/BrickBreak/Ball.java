package com.BrickBreak;
import java.awt.*;

public class Ball {
	private int x;
	private int y;
	private int xVelocity;
	private int yVelocity;
	private int size;
	
	public Ball (int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}

	// Methods to set and get x and y, respectively
	public void setX (int initX) {
		x = initX;
	}
	public void setY (int initY) {
		x = initY;
	}
	public int getXpos () {
		return x;
	}
	public int getYpos () {
		return y;
	}

	// Get ball size
	public int getSize() {
		return size;
	}

	// Methods to set x and y velocities, respectively
	public void setXVelocity(int initXVelocity) {
		xVelocity = initXVelocity;
	}
	public void setYVelocity(int initYVelocity) {
		xVelocity = initYVelocity;
	}
	
	// Methods to reverse x and y velocities, respectively
	public void reverseX() {
		xVelocity *= -1;
	}
	public void reverseY() {
		yVelocity *= -1;
	}

	
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}

	//precondition: g is not null
	//postcondition: The ball is drawn at (x,y)
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.drawOval(x, y, size, size);
	}
}
