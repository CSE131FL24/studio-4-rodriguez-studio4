package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
			   StdDraw.clear();
			   StdDraw.setXscale(0, 10);
			   StdDraw.setYscale(0, 10);
			   StdDraw.setPenColor(255, 255, 255);
			   StdDraw.filledRectangle(5,0,2,10);
			   StdDraw.setPenColor(255, 155, 0);
			   StdDraw.filledCircle(5,5,2);
			   StdDraw.setPenColor(255, 200, 0);
			   StdDraw.filledCircle(5,5,1.5);
			   StdDraw.setPenColor(255, 255, 0);
			   StdDraw.filledCircle(5,5,1);
			   StdDraw.setPenColor(100, 100, 255);
			   StdDraw.filledRectangle(0,0,10,2);
			   StdDraw.setPenColor(0, 255, 100);
			   StdDraw.filledRectangle(0,9,10,1);
			   StdDraw.setPenColor(255, 0, 0);
			   StdDraw.filledRectangle(0,0,3,10);
			   StdDraw.filledRectangle(9,0,2,10);
			}	
	}