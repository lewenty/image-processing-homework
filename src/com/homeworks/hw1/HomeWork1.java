package com.homeworks.hw1;

import vpt.ByteImage;
import vpt.Image;
import vpt.algorithms.display.Display2D;
import vpt.algorithms.io.Load;


public class HomeWork1 {

	public static void main(String[] args) {
		System.out.println("running");
		
		Image img = Load.invoke("ornekler/lenna.png");
		Display2D.invoke(img);
		
		
	}
}
