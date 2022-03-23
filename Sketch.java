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
  
   // Quadrant 2
   fill(255, 242, 0);
   for (int circleY = ((height)/14); circleY <= ((height/14)*7); circleY += ((height)/11)) {
     for (int circleX = ((width)/14)+250; circleX <= ((width/14)*7)+250; circleX += ((width)/11)) {
       ellipse(circleX, circleY, 25, 25);
     }

}}}