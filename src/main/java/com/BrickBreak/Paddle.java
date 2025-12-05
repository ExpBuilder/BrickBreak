package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	private int x;
	private int y;
	private int velocity;
	private int width;
	private int height;
	
	public Paddle (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Methods to set and get x and y, respectively
	public void setX (int initX) {
		x = initX;
	}
	public void setY (int initY) {
		x = initY;
	}
	public int getX () {
		return x;
	}
	public int getY () {
		return y;
	}

	// Methods to get width and height, respectively
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

	// Methods to set and get velocities, respectively
	public void setVelocity(int initVelocity) {
		velocity = initVelocity;
	}
	public void addVelocity(int change) {
		velocity += change;
	}
	public int getVelocity() {
		return velocity;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
	
	public void move() {
		y += velocity;
	}
}
