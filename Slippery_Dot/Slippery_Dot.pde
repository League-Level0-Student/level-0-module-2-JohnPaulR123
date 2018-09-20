  // 4. create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int x=200;
    int y=200;
    int size=500;
    
    void setup() {
      //1. set the size of your sketch
    size(500,500);
    }
    
    void draw() {
      //2. set the background color of your sketch
      background(0,0,250);
      //3. draw an ellipse. Make sure it fits in the window.
      fill(150,150,150);
      ellipse(x,y,200,200);
      //5. use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      int distance=getDistance(x,y,mouseX,mouseY);
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     
      //7. print the distance variable
    print(distance);
      
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      if(distance<=200){
      x=(int)random(500);
      y=(int)random(500);
      }
        //8b.  set the x and y of the ellipse to a random location on the window
       
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(x2 * x2 + y2 * y2) - (int)Math.sqrt(x1 * x1 + y1 * y1);
    }