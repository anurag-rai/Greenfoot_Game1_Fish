import greenfoot.*;
import java.awt.*;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    public Counter()
    {
        setImage(new GreenfootImage("SCORE: " + score,28,Color.GREEN,Color.BLUE));
    }
    public void act()
    {
        setImage(new GreenfootImage("SCORE: " + score,28,Color.GREEN,Color.BLUE));
    }
    public void setScore(int s)
    {
        score = s;
    }
}
