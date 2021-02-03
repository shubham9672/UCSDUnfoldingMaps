package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet{
	PImage img;
	
	public void setup() {
		size(600,600);
		background(255);
		stroke(0);
		img = loadImage("https://previews.123rf.com/images/batechenkofff/batechenkofff1807/batechenkofff180700572/105385295-tropical-island-palm-trees-sand-ocean-on-background-of-beautiful-blue-sky.jpg","jpg");
	    img.resize(width, height);
	    image(img,0,0);
	}
	public void draw() {
		int[] color = sunColorSec(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/5,width/4,height/5);
	}
	public int[] sunColorSec(float seconds)
	{
		int[] rgb = new int[3];
		float diffFrom30 = Math.abs(30-seconds);
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		return rgb;
	}
public static void main(String[] args) {
	
}

}
