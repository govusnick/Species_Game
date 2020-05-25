public abstract class Species
{
    public String name;
    
    public int health;
    public int size;
    public boolean isAlive;

    public boolean danger;
    public int damage;

    public Pair position;

    public abstract void update(Species s);

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