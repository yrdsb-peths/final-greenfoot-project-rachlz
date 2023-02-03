import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    private boolean mouseOver = false; 
    private static int MAX_TRANSPARENCY = 250; 
    public void checkMouse()
    {
        if (Greenfoot.mouseMoved(null))
        {
            mouseOver = Greenfoot.mouseMoved(this); //if mouse not over, then false
        }
        
        if (mouseOver)
        {
            adjTrans(MAX_TRANSPARENCY/2);  
        }
        else
        {
            adjTrans(MAX_TRANSPARENCY); 
        }
    }
    
    public void adjTrans(int adjust)
    {
        GreenfootImage farmMain = getImage(); 
        farmMain.setTransparency(adjust); 
        setImage(farmMain); 
    }
}
