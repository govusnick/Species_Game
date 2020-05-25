//import java.awt.*;
//import java.awt.image.*;
import java.io.*;
//import java.util.*;
import javax.imageio.*;
//import javax.swing.*;

public class Turtle extends Species
{
    public int turtleHealth=10;
    public int turtleSize=50;
    public int turtleSpeed=10;

    public Turtle()
    {
        super.name= "turtle";
        super.health=turtleHealth;
        super.size=turtleSize;
        super.isAlive=true;
        super.danger=false; //turtles arent dangerous
        super.damage=2;//chomp chomp
        super.position = new Pair(10,10);
        super.speed=turtleSpeed;
        try
        {
            super.image=ImageIO.read(new File("turtle.png"));
        }
        catch (IOException e){}
    }
    public Turtle(String nameIn, boolean isalivein, Pair positionIn, String imageFilein, int speedin)
    {
        super.name= nameIn;
        super.health=turtleHealth;
        super.size=turtleSize;
        super.isAlive=isalivein;
        super.danger=false; //turtles arent dangerous
        super.damage=2;//chomp chomp
        super.position =positionIn;
        super.speed=speedin;
        try
        {
            super.image=ImageIO.read(new File(imageFilein));
        } catch (IOException e){}
    }

    public void update(Pair lowBnds, Pair highBnds)
    {
        super.position=getNextPos();

    }
    public Pair getNextPos()
    {
        //current movement is random?
        Pair pos=new Pair(super.position.x,super.position.y);
        pos.x = pos.x + (int)(Math.random()*4.0 - 2.0)*super.speed;
        pos.y = pos.y + (int)(Math.random()*4.0 - 2.0)*super.speed;
        //debug
        System.out.println("updated position for "+name+" is "+pos);
        return pos;
    }
}