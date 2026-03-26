package com.ex;

public class ShortestPath {
	public static float shortestPath(String dir) {
		int x=0;
		int y=0;
		for(int i=0 ; i<dir.length() ; i++) {
			char path = dir.charAt(i);
			if(path == 'N') {
				y++;
			}
			else if(path == 'S') {
				y--;
			}
			else if(path == 'E'){
				x++;
			}
			else {
				x--;
			}
		}
		int X = x*x;
		int Y = y*y;
		return (float)Math.sqrt(X+Y);
	}
	
	public static void main(String[] args) {
		String dir = "WNEEENESENNNN";
		System.out.println(shortestPath(dir));
	}

}
