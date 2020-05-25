//import java.awt.*;
import java.awt.image.*;
//import java.io.*;
///import java.util.*;
//import javax.imageio.*;
//import javax.swing.*;

public abstract class Species
{
    public String name;
    
    public int health;
    public int size;
    public boolean isAlive;
    BufferedImage image;

    public boolean danger;
    public int damage;

    public Pair position;
    public int speed;

    public abstract void update(Pair lowBnds, Pair highBnds);

}
///////////////////////////////////
class Pair{
    int x;
    int y;
    public Pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}