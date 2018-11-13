import java.util.ArrayList;
public class Player
{
    String motive, name;
    Character character;
    ArrayList<Cards> playercards = new ArrayList<Cards>();
    public Player(String mot, String nm, Character c)
    {
        motive = mot;
        name = nm;
        character = c;
    }
     
    public Character getChar()
    {
        return character;
    }
     
    public Cards getCard( int index )
    {
        return playercards.get( index );
    }
     
    public Cards drawCard( int index )
    {
        return playercards.remove( index );
    }
     
    public void addCard( Cards c )
    {
        playercards.add( c );
    }
     
    public int getCardSize()
    {
        return playercards.size();
    }
}
