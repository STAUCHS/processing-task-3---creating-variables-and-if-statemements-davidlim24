import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(900, 900);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
   
    // background
    
    background(135, 206, 235);
   
    // draw ellipse random location
   
    fill (255, 255, 0);
    float ellipseX = random(0,600);
    float ellipseY = random(0, 600);
    float ellipseWidth = random(120, 120);
    float ellipseHeight = random(120, 120);
    ellipse(ellipseX, ellipseY, ellipseWidth, ellipseHeight);}

   
  public void draw() {
      // define time variables
   
      int hr = hour();
      int min = minute();
  
      // print time on screen 
     
      fill(0);
      textSize(100);
      text(hr, 130, 150);
      text(min, 130, 225);
	  
    
       // create the grass
       fill(0, 128, 0);
       rect(0, 600, 895, 775); 
       
       fill(196, 164, 132);
       rect(400,350,360,360);
    
       fill(165, 42, 42);
       triangle(400, 350, 580, 150, 760, 350);
    
       rect(540, 550, 80, 160);
      
    
	
   
  }
  
  // define other methods down here.

  
}