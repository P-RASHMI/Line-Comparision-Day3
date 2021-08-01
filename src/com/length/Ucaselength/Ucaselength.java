package com.length.Ucaselength;

import java.util.Scanner;

public class Ucaselength {
	public static void main(String[] args) {

		int x1, x2, y1, y2;

		double dis;

		Scanner SC = new Scanner(System.in);

		System.out.println("enter x1 point");

		x1 = SC.nextInt();

		System.out.println("enter y1 point");

		y1 = SC.nextInt();

		System.out.println("enter x2 point");

		x2 = SC.nextInt();

		System.out.println("enter y2 point");

		y2 = SC.nextInt();

		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") is :" + "" + dis);

	}
}
