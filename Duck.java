import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Duck
 * 
 * Rachel Zhang
 * January 11, 2023
 */
public class Duck extends Actor
{
    /**
     * Act - do whatever the Duck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage drawedImage = new GreenfootImage("pond.png"); 
        getWorld().getBackground().drawImage(drawedImage, 62, 322); 

    }
}
