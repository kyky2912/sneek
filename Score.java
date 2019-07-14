import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    Font font = new Font("Dialog", Font.BOLD, 20);
    Color darkGreen = new Color(0, 51, 0);
    Color green = new Color(0, 255, 0 , 150);
    GreenfootImage image = new GreenfootImage(100, 30);
    private int score = 0;

    /**
     * Score - sets up the score object
     */
    public Score()
    {
        image.setFont(font);
        setText();
        setImage(image);
    }

    /**
     * setText - sets the text of the score
     */
    private void setText()
    {
        image.clear();
        image.setColor(green);

        image.drawString("Score: " + score, ShiftSouth(1, 2), ShiftEast(15, 2));
        image.setColor(darkGreen);

        image.drawString("Score: " + score, 1, 15);

    }

    /**
     * updateScore - adds score then runs setText
     */
    public void updateScore()
    {
        score++;
        setText();
        setImage(image);
    }

    /**
     * ShiftSouth - shifts the coordinates down by the distance handed to it
     * @param int p
     * @param int distance
     */
    public int ShiftSouth(int p, int distance) {
        return (p + distance);
    }

    /**
     * ShiftEast - shifts the coordinates down by the distance handed to it
     * @param int p
     * @param int distance
     */
    public int ShiftEast(int p, int distance) {
        return (p + distance);
    }

    public void setSpeed()
    {
        if(score>20)
        {
           Greenfoot.setSpeed(30);
        }
    }
}
