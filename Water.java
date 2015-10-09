import greenfoot.*;

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends World
{

    /**
     * Constructor for objects of class Water.
     * 
     */
    Counter counter = new Counter();
    
    
    public Water()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Fish fish = new Fish();
        addObject(fish, 217, 156);
        fish.setLocation(177, 141);
        fish.setLocation(170, 151);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom, 421, 150);
        Mushroom mushroom2 = new Mushroom();
        addObject(mushroom2, 307, 305);
        Mushroom mushroom3 = new Mushroom();
        addObject(mushroom3, 129, 261);
        Dolphin dolphin = new Dolphin();
        addObject(dolphin, 317, 68);
        Dolphin dolphin2 = new Dolphin();
        addObject(dolphin2, 181, 319);
        dolphin2.setLocation(92, 244);
        mushroom3.setLocation(174, 267);
        mushroom2.setLocation(422, 309);
        Mushroom mushroom4 = new Mushroom();
        addObject(mushroom4, 106, 91);
        Mushroom mushroom5 = new Mushroom();
        addObject(mushroom5, 342, 361);
        mushroom2.setLocation(524, 343);
        mushroom.setLocation(468, 102);
        mushroom3.setLocation(141, 291);
        fish.setLocation(267, 182);
        dolphin2.setLocation(99, 205);
        fish.setLocation(291, 210);
        mushroom4.setLocation(122, 57);
        mushroom5.setLocation(330, 502);
        mushroom2.setLocation(675, 441);
        mushroom3.setLocation(77, 451);
        mushroom.setLocation(603, 129);
        dolphin2.setLocation(136, 325);
        fish.setLocation(396, 280);
        Dolphin dolphin3 = new Dolphin();
        addObject(dolphin3, 520, 434);
        mushroom4.setLocation(148, 117);
        
        addObject(counter, 58, 41);
        counter.setLocation(59, 22);
    }
    
    public Counter getCounter()
    {
        return counter;
    }
}
