package com.BrickBreak;

import java.awt.Color;
import java.awt.Graphics;

//  Class author:  Joe Jiao
//  Date created:  12/5/2025
//  General description:   This class defines the paddle controlled by the player along with methods to manipulate the paddle. 

public class Paddle {
	private int x;
	private int y;
	private int velocity;
	private int width;
	private int height;
	
	// Paddle constructor
	public Paddle (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Methods to set and get x and y, respectively
	public void setX (int initX) {
		this.x = initX;
	}
	public void setY (int initY) {
		this.y = initY;
	}
	public int getX () {
		return this.x;
	}
	public int getY () {
		return this.y;
	}

	// Methods to get width and height, respectively
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

	// Methods to set, add, and get velocities, respectively
	public void setVelocity(int initVelocity) {
		velocity = initVelocity;
	}
	public void addVelocity(int change) {
		velocity += change;

		int lim = 3;

		if (velocity > lim) velocity = lim;
		if (velocity < -1 * lim) velocity = -1 * lim;
	}
	public int getVelocity() {
		return velocity;
	}

	// Precondition: g is not null
	// Postcondition: The rectangle (the paddle) is drawn at (x,y) with width width and height height
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
	
	// Precondition: No inputs
	// Postcondition: velocity is added to x. If x goes offscreen, x is set to the minimum/maximum x-coordinate to stay onscreen (on the correct side)
	public void move() {
		x += velocity;
		if (x > (int) (750 - (3.0 / 2)  * width)) x = (int) (750 - (3.0 / 2)  * width);
		if (x < 0) x = 0;
	}
}
