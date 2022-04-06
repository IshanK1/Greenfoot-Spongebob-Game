import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 
/**
 * Spongebob is an anctor the player controls to play the game. This subclass controls many of the responses the game has 
 when spongebob comes into contact with one of the falling obejct (such as increasing score, playing a noise, or stopping the game),
 *it also controls spongebob's movement and detectsn if spongebob is touching one of the falling objects. 
 @Ishan K, Jaspal Khanujah, Anmol Nayak  
 * June 20, 2021
 */
public class Sbob extends Actor
{
    private int Jellyfish=0;//Integer variable used to measure how many Jellyfish spongebob has collected.
    private int gold=0; //Integer variable used to measure how much gold spongebob has collected. 
    public static int score =0;  //Integer variable used to measure score. 
    private int CrabTrap=0;//Integer variable used to measure how many crabtraps spongeob has intersected with.
    private int Anchor=0; //Integer variable used to measure how many anchors spongeob has intersected with.
    
    /**
     * Act - do whatever the Sbob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        // Add your action code here.
    
        
        if(canCatchGold()){ //Used to Call CatchGold
            CatchGold();  
            gold=gold+1;
        }
        if (Greenfoot.isKeyDown("right")){setLocation(getX()+2,getY()); //checks if the right arrow is pressed down and moves spongebob to the right if it is.
        }
        
        if (Greenfoot.isKeyDown("left")){setLocation(getX()-2,getY());//checks if the left arrow is pressed down and moves spongebob to the left if it is.
        }
        
        if(canCatchJellyfish()){ //Used to Call CatchJellyfish 
            CatchJellyfish();  //Calls CatchJellyfish
            Jellyfish=Jellyfish+1;
        
        }
        
        if(canCatchCrabTrap()){ //Used to Call CrabTrap
            Greenfoot.stop(); //Stops the game.
            
        }
        
        if (canCatchAnchor()){ //Used to Call CallAnchor
            Greenfoot.stop();//Stops the game.
        
        }
    }
    
    private boolean canCatchGold(){  //Checks if any actors in its subclass are intersecting with spongebob, and returns true if there are any.
    Actor gold = getOneObjectAtOffset(0, 0, PirateGold.class); 
    if(gold !=null) { 
        return true;
    }
    
    else {
        return false;
    }
    
    }
    
    private void CatchGold(){ 
        Actor gold = getOneObjectAtOffset(0, 0, PirateGold.class);
    if(gold !=null) {
        Greenfoot.playSound("cha_ching.wav"); //Plays a sound affect from the library.
        getWorld().removeObject(gold); //Removes the intersecting object from the world.
        score = score +1; //Increases score by a given amount
    }
    

}
    private boolean canCatchJellyfish(){ //Checks if any actors in its subclass are intersecting with spongebob, and returns true if there are any.
    Actor Jellyfish = getOneObjectAtOffset(0, 0, Jellyfish.class);
    if(Jellyfish !=null) {
        return true;
    }
    
    else {
        return false;
    }
    
    }
    private void CatchJellyfish(){
        Actor Jellyfish = getOneObjectAtOffset(0, 0, Jellyfish.class);
    if(Jellyfish !=null) {
        Greenfoot.playSound("cha_ching.wav"); //Plays a sound affect from the library.
        getWorld().removeObject(Jellyfish); //Removes the intersecting object from the world.
        score = score +10;//Increases score by a given amount
    }
    
}
        private boolean canCatchCrabTrap(){ //Checks if any actors in its subclass are intersecting with spongebob, and returns true if there are any.
    Actor CrabTrap = getOneObjectAtOffset(0, 0, CrabTrap.class);
    if(CrabTrap !=null) {
        return true;
    }
    
    else {
        return false;
    }
    
    }
      private boolean canCatchAnchor(){ //Checks if any actors in its subclass are intersecting with spongebob, and returns true if there are any.
    Actor Anchor = getOneObjectAtOffset(0, 0, Anchor.class);
    if(Anchor !=null) {
        return true;
    }
    
    else {
        return false;
    }
    
    }
    
     private void CatchAnchor(){
    Actor Anchor = getOneObjectAtOffset(0, 0, Anchor.class);
    if(Anchor !=null) {
        Greenfoot.playSound("bonk.wav");//Plays a sound affect from the library.
        Greenfoot.stop(); //Stops the game.
    
}
}

    private void CatchCrabTrap(){
    Actor CrabTrap = getOneObjectAtOffset(0, 0, CrabTrap.class);
    if(CrabTrap !=null) {
        Greenfoot.playSound("bonk.wav");//Plays a sound affect from the library.
        Greenfoot.stop(); //Stops the game.
    
}
}

    
  
}




 
