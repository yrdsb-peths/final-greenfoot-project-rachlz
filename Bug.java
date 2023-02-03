import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug extends Actor
{
    int speed = 1; 
    /**
     * Act - do whatever the Bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()+1); 
        int x = getX(); 
        int y = getY() + speed; 
        setLocation(x, y); 
        
        Game game = (Game) getWorld();
        if (getY() >= game.getHeight())
        {
            game.gameOver(); 
            game.removeObject(this); 
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd; 
    }
}
