import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Menu Page (write a description) 
 * 
 * Rachel Zhang 
 * January 11, 2023 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        // Create a menu page background
        MenuPage mp = new MenuPage();
        addObject(mp, 300, 210); 
        
        // Create a pond (for the mini game)
        Duck pond = new Duck();
        addObject(pond,62, 322);
    }
}
