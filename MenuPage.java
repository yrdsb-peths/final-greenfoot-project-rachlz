import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Menu page of the program.
 * 
 * Rachel Zhang
 * January 11, 2023
 */
public class MenuPage extends Actor
{
    /**
     * Act - do whatever the MenuPage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage drawedImage = new GreenfootImage("farmMain.jpg"); 
        getWorld().getBackground().drawImage(drawedImage, 300, 210); 

    }
}
