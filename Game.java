import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class Game.
     * 
     */
    private GreenfootSound pondSound = new GreenfootSound("pond.mp3"); 
    public int score = 0; 
    Label scoreLabel;
    
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 360,1, false); 
        prepare();
        
        Frog frog = new Frog(); 
        addObject(frog, 450, 300); 
        
        //Create a Label 
        scoreLabel = new Label (0, 60); 
        addObject(scoreLabel, 50, 50);  
        
        //Create a bug
        createBug();  
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game Over", 100);
        addObject(gameOverLabel, 250,150);  
    }
    public void increaseScore()
    {
        score++; 
        scoreLabel.setValue(score); 
    }
    public void createBug()
    {
        Bug bug = new Bug(); 
        int x = Greenfoot.getRandomNumber(540);
        int y = 0;
        addObject(bug, x, y); 
    }
    
    private void prepare()
    {
        pondSound.play();  
        Frog frog = new Frog();
        addObject(frog,323,292);
        frog.setLocation(179,299);
        removeObject(frog);
    }
    
    public void started()
    {
        pondSound.play(); 
    }
    
    public void stopped()
    {
        pondSound.stop(); 
    }
}
