import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    GreenfootSound frogSound = new GreenfootSound("frogEffect.mp3"); 
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3); 
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(3); 
        }
        
        eat(); 
    }
    
    public void eat()
    {
        if (isTouching(Bug.class))
        {
            removeTouching(Bug.class);
            Game game = (Game) getWorld(); 
            game.createBug();
            game.increaseScore(); 
            frogSound.play();
        } 
    }

}
