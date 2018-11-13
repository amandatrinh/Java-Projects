public class Character
{
    int health; String name;
     
    public Character( int lifePoints, String nm )
    {
        health = lifePoints;
        name = nm;
    }
     
    public int calcHealth(int effect)
    {
        health += effect;
        return health;
    }
     
    public boolean isAlive()
    {
        if ( health <= 0 ) return false;
        else return true;
    }
     
    public String getName()
    {
        return name;
    }
     
    public int getHealth()
    {
        return health;
    }
 
    
}