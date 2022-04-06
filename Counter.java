import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
  
/**
 * The counter class is used for setting up the game's score system.
 * 
  @Ishan K, Jaspal Khanujah, Anmol Nayak  
 * June 20, 2021
 */
public class Counter extends Actor
{
    int score = 0; //Variable integer that records score. 
    public Counter(String text)
    {
        GreenfootImage img = new GreenfootImage(text.length()*20,30); //Sets the text size
        img.setColor(Color.BLACK);  //Sets text color
        img.drawString(text, 10, 20);  //
        
        setImage(img); //Makes Greenfoot image a parameter, not a file name.  
        
    }
    
    public void setText(String text)
    {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text, 10, 20);
    
    
    }
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
