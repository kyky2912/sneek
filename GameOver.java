import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    Font font = new Font("Dialog", Font.BOLD, 40);
    Color darkGreen = new Color(0, 51, 0);
    Color green = new Color(0, 255, 0 , 150);
    public GameOver()
    {
        GreenfootImage image = new GreenfootImage(300, 100);
        image.setFont(font);
        image.setColor(darkGreen);
        image.drawString("Game Over", ShiftEast(1, 2), ShiftSouth(50, 2));
        image.setColor(green);
        image.drawString("Game Over", 1, 50);
        setImage(image);
    }

    /**
     * ShiftSouth -shifts the coordnates down by the distance handed to it
     * @param int p
     * @param int distance
     */
    public int ShiftSouth(int p, int distance) {
        return (p + distance);
    }

    /**
     * ShiftEast - shifts the coordinates right by the distance handed to it
     * @param int p
     * @param int distance
     */
    public int ShiftEast(int p, int distance) {
        return (p + distance);
    }

}
