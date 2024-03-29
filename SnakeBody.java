import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class SnakeBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeBody  extends Actor
{
    private int x_speed=1;
    private int y_speed=0;
    private int bodyPos;
    private Point snakeCoords;
    
    /**
     * SnakeBody constructor
     * sets the image for the snakeBody
     * @param int bodyPosition
     */
    public SnakeBody(int bodyPosition)
    {
        GreenfootImage image = new GreenfootImage(10, 10);
        image.setColor(Color.GRAY);
        image.fillRect(0, 0, 10, 10);
        setImage(image);
        bodyPos = bodyPosition;
    }

    /**
     * Act - do whatever the SnakeBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveBody();
    }    

    /**
     * moveBody
     * moves the snake body 
     */
    public void moveBody()
    {
      SnakeWorld world = (SnakeWorld)getWorld();
      snakeCoords = world.getBodyPosition(bodyPos);
      setLocation(snakeCoords.getX(), snakeCoords.getY());
    }
}
