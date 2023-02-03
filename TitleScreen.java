import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    private GreenfootSound soundtrack = new GreenfootSound("animalCrossing.mp3"); 
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    private void prepare()
    {
        soundtrack.play();  
    }
    
    public void started()
    {
        soundtrack.play(); 
    }
    
    public void stopped()
    {
        soundtrack.stop(); 
    }
}
