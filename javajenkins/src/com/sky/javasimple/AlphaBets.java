package com.sky.javasimple;

public class AlphaBets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet = 65;
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
	}
}
