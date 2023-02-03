import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @Rachel Zhang 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Animal Farm", 100); 
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    private GreenfootSound soundtrack = new GreenfootSound("animalCrossing.mp3"); 
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, 180);
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Game gameWorld = new Game(); 
            Greenfoot.setWorld(gameWorld);
        }
        
    }
    
    private void prepare()
    {
        soundtrack.play();  
        Label label = new Label("Press <space> to start", 30);
        addObject(label,272,252);
        label.setLocation(351,252);
        Label label2 = new Label("Instruction: Help the ravenous frog by capturing bugs!", 20);
        addObject(label2,260,291);
        label2.setLocation(300,288);
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
