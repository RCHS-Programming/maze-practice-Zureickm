import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mazeworld here.
 * 
 * @Matthew Zureick (your name) 
 * @version (a version number or a date)
 */
public class Mazeworld extends World
{

    /**
     * Constructor for objects of class Mazeworld.
     * 
     */
    public Mazeworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        for(int i = 0; i < 16; i++)
        {
            addObject( new wall("edge.png"), 25 + 50*i,12);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject( new wall("edge.png"), 25 + 50*i, 587);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject( new wall("edge2.png"), 12, 25 + 50*i);
        }
          for(int i = 0; i < 16; i++)
        {
            addObject( new wall("edge2.png"), 788, 25 + 50*i);
        }
          for(int i = 0; i < 7; i++)
        {
            addObject( new wall("edge.png"), 25 + 50*i, 150);
        }  for(int i = 0; i < 7; i++)
        {
            addObject( new wall("edge2.png"), 125, 300 + 50*i);
        }
    }
}
