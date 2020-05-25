public class Turtle extends Species
{
    public int turtleHealth=10;
    public int turtleSize=10;
    public Turtle(String nameIn, boolean isalivein, Pair positionIn)
    {
        super.name= nameIn;

        super.health=turtleHealth;
        super.size=turtleSize;

        super.isAlive=isalivein;

        super.danger=false; //turtles arent dangerous
        super.damage=2;//chomp chomp

        super.position =positionIn;
    }

    public void update(Species s)
    {
        System.out.println("Update does not do anything right now");
    }
}