import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The FallingObjects class controls the falling behavior of objects and detects when objects are at the bottom of the 
 * screen in order to remove them from the world.
  @Ishan K, Jaspal Khanujah, Anmol Nayak  
 * June 20, 2021
 */
public class FalllingObjects extends Actor
{
    private int dropSpeed = 1; //Controls dropspeed of FallingObjects 
    private boolean onBottom=false;  //Set to false becuase initially there are no objects touching the floor. 
    
    /**
     * Act - do whatever the FalllingObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall(); //Calls the fall method 
    }
    
     private void fall() 
    {
        // Add your falling code here.
         if (! onBottom) {
       this.setLocation(getX(),getY()+dropSpeed); //Makes objects fall in a veritical line from where they spawn towards the floor. 
       onBottom=checkBottom(); //When an object is obn the bottom, the check bottom method is called to return 
    }
     
      //remove the falling object once it reaches bottom
     else {
        getWorld().removeObject(this);
     
    }
}
    private boolean checkBottom()
    {
         // Returns true if an abject is still falling, and returns false if it has reached the floor. 
          if (getY()>570){
            return true;
        }
        else {
           return false;
        }
    }    

}
