import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * WaterWorld is the enviornment our game takes place in. This subclass sets up the score system display, Timer, as well as  
   a variety of conditionals and methods used in creating and implementing Spongebob and  actors from falling objects in the
   game. 
 * @Ishan K, Jaspal Khanujah, Anmol Nayak  
 * June 20, 2021
 */
public class WaterWorld extends World
{

    Counter scoreBoard = new Counter("Score: 0"); //Displays the scoreboard
    private int timer = 10000; //This integer variable sets the timer at 1 minute.
    
    public WaterWorld() //The code in public WaterWorld below sets the size of the background image and alllows for its implementation into the game .
    {
        super(800, 600, 1);   //Sets size of background image 
        GreenfootImage bg = new GreenfootImage("WaterWorld.png"); //Draws the image to be displayed in the world. 
        bg.scale(getWidth(), getHeight()); //Used to change scale of background image.
        setBackground(bg); //Sets the background image to WaterWorld
        prepare();
    }
    
    public void dropGold(){ //Method used for creating gold and setting their starting locations.
        PirateGold g = new PirateGold();
        addObject(g,Greenfoot.getRandomNumber(getWidth()),10);
    }

     public void dropTrap(){ //Method used for creating Crab traps and setting their starting locations.
        CrabTrap t = new CrabTrap();
        addObject(t,50+Greenfoot.getRandomNumber(getWidth()-100),10);
    }
    
     public void dropJellyfish(){ //Method used for creating Jellyfish and setting their starting locations.
        Jellyfish J = new Jellyfish();
        addObject(J,50+Greenfoot.getRandomNumber(getWidth()-100),10);
    }
    
    public void dropAnchor(){ //Method used for creating Anchors and setting their starting locations.
        Anchor A = new Anchor();
        addObject(A,50+Greenfoot.getRandomNumber(getWidth()-100),10);
    }

     public void act(){ 
        if (Greenfoot.getRandomNumber(75)==5){ //Controls how often the "dropGold" method is called
            dropGold(); 
        }
        if (Greenfoot.getRandomNumber(250)==20){ //Controls how often the "droptrap" method is called
            dropTrap();
        }
        if (Greenfoot.getRandomNumber(1000)==20){ //Controls how often the "dropJellyfish" method is called
            dropJellyfish();
        }
        if (Greenfoot.getRandomNumber(500)==20){ //Controls how often the "dropAnchor" method is called
            dropAnchor();
        }
        scoreBoard.setText("Score: "+ Sbob.score); //Displays the text "Score:" and then spongebob's current score. 
        timer--; //Counts down the timer
        if (timer <=0 ){ //Checks to see if the timer has ended.
            Greenfoot.stop(); //Stops the game once the timer is ended.
        }
        showText("Time Left:"+timer, 80, 10); //Displays "Time Left: and the timer counting down, also sets location fo timer.
    }

    private void prepare() 
    {
        Sbob sbob = new Sbob(); //Creates a new Spongebob actor for use in the game 
        addObject(sbob, 328, 537); //Adds spongebob into the game 
        sbob.setLocation(399, 527); //sets spongebob's location in the game
        
        addObject (scoreBoard,80,60); //Sets the scoreboard's location and adds it into the game. 
    }
    
    
}


