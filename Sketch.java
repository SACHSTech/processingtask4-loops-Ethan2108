import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {
	  
   strokeWeight((float)0.006*height);
   stroke(0, 0, 0);

   // Quadrant 1
   for (int i = height/20; i <= height/2; i += height/20) {
     line(i, 0, i, height/2);
     line(0, i, width/2, i);
  }
  
  
}