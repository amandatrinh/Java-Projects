import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
  
public class GameDriver
{    
    public static void main( String args[] )
    {
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add( new Character(4, "Willy the Kid") );//Can play any number of Bang cards
        characters.add( new Character(4, "Vulture Sam") );//Sam takes all the cards of the eliminated Character 
        characters.add( new Character(4, "Suzy Lafayette") );//when she has no cards in her hand, she draws a card from draw pile
        characters.add( new Character(4, "Sid Ketchum") );//May dicard 2 cards to regain one life point
        characters.add( new Character(4, "Kit Carlson") );//looks at the top three crads of the deck and chooses 2
        characters.add( new Character(4, "Bart Cassidy") );//each time he loses a life point he inmediately draws a card from the deck.
        // characters.add( new Character(4, "Slab The Killer") );//Character trying to miss his bang has to play 2 misses
        // characters.add( new Character(4, "Rose Doolan") );//has a scope of decreased distance by 1
        // characters.add( new Character(4, "Pedro Ramirez") );//may draw first card from top of the discard pile or from deck
        // characters.add( new Character(3, "Paul Regret") );//all Characters must have a add 1 to reach him
        // characters.add( new Character(4, "Lucky Duke") );//whenever he has to draw! he flips the top two cards from the deck
        // characters.add( new Character(4, "Jourdonnais") );//Has a barrel at all times
        // characters.add( new Character(4, "Jesse Jones") );//may draw first card from deck or from the hand of another Character
        // characters.add( new Character(3, "El Gringo") );//each time he loses a life point he draws a random card from hand of that Character
        // characters.add( new Character(4, "Calamity Janet") );//she can use bang as missed card and vice versa
        // characters.add( new Character(4, "Black Jack") );//must show second card he draws, if it is heart or diamond he draws and additional card
         
          
        ArrayList<Player> players = new ArrayList<Player>();
        Player P1 = new Player("Kill the Outlaws", "Sheriff", characters.remove( (int)(Math.random()*characters.size()) ));
        Player P2 = new Player("Kill the Sheriff", "Outlaw", characters.remove( (int)(Math.random()*characters.size()) ));
        Player P3 = new Player("Kill the Sheriff", "Outlaw", characters.remove( (int)(Math.random()*characters.size()) ));
        Player P4 = new Player("Be the last one alive", "Renegade", characters.remove( (int)(Math.random()*characters.size()) ));
        players.add( P1 ); players.add( P2 ); players.add( P3 ); players.add( P4 ); 
          
        ArrayList<Cards> cards = new ArrayList<Cards>();
        cards.add( new Cards( "BANG", -1 ) ); // player loses 1 health
        cards.add( new Cards( "BANG", -1 ) ); // player loses 1 health
        cards.add( new Cards( "BANG", -1 ) ); // player loses 1 health
        cards.add( new Cards( "BANG", -1 ) ); // player loses 1 health
        cards.add( new Cards( "BANG", -1 ) ); // player loses 1 health
        cards.add( new Cards( "BANG", -1 ) ); // player loses 1 health
        cards.add( new Cards( "BANG", -1 ) ); // player loses 1 health
        cards.add( new Cards( "BANG", -1 ) ); // player loses 1 health
        cards.add( new Cards( "BEER", +1 ) ); // gives player 1 health
        cards.add( new Cards( "BEER", +1 ) ); // gives player 1 health
        cards.add( new Cards( "BEER", +1 ) ); // gives player 1 health
        cards.add( new Cards( "SALOON", +1 ) ); // gives everyone +1 health
        cards.add( new Cards( "StageCoach", 0 ) ); // player draws two cards
        cards.add( new Cards( "StageCoach", 0 ) ); // player draws two cards
        cards.add( new Cards( "Wells Fargo", 0 ) ); // player draws three cards
        cards.add( new Cards( "General Store", 0 ) ); // player draws as many cards as there are players and then each player picks a card
        cards.add( new Cards( "General Store", 0 ) ); // player draws as many cards as there are players and then each player picks a card
        cards.add( new Cards( "Panic!", 0 ) ); // takes a card from another player
        cards.add( new Cards( "Panic!", 0 ) ); // takes a card from another player
        cards.add( new Cards( "Panic!", 0 ) ); // takes a card from another player
        cards.add( new Cards( "Cat Balou", 0 ) ); // forces a player to discard a card
        cards.add( new Cards( "Cat Balou", 0 ) ); // forces a player to discard a card
        cards.add( new Cards( "Cat Balou", 0 ) ); // forces a player to discard a card
        cards.add( new Cards( "Gatling", -1 ) ); // -1 health on everyone
        cards.add( new Cards( "Indians", -1 ) ); // everyone -1
        // cards.add( new Cards( "Jail", 0 ) ); // puts player in Jail until he draws a Heart Card
        // cards.add( new Cards( "Dynamite", -3 ) ); // if player draws a number between 2 and 9 then dynamite explodes
          
        for ( int i = 0; i < 5; i++ )
        {
            players.get(0).addCard( cards.get((int)(Math.random()*cards.size())) );
            players.get(1).addCard( cards.get((int)(Math.random()*cards.size())) );
            players.get(2).addCard( cards.get((int)(Math.random()*cards.size())) );
            players.get(3).addCard( cards.get((int)(Math.random()*cards.size())) );
        }
          
        boolean hasWinner = false; // is there a winner yet?
          
        while (hasWinner == false)
        {
            for(int x = 0; x < players.size(); x++)
            {
                for ( int i = 0; i < 4; i++ )
                {
                    System.out.println( "Player " + (i+1) + "'s Health is " + players.get(i).getChar().getHealth() );
                } // prints out everyone's current health
                  
                if ( players.get(x).getChar().isAlive() == true )
                {
                    boolean usedbang = false;
                    boolean turn = true;
                    players.get(x).addCard( cards.get((int)(Math.random()*cards.size())) );
                    players.get(x).addCard( cards.get((int)(Math.random()*cards.size())) );
                     
                    while(turn == true)
                    {
                         
                        System.out.println( "\n\nPlayer " + (x+1) + " Cards: " );
                        for ( int i = 0; i < players.get(x).getCardSize(); i++ )
                        {
                            System.out.println( "Card " + (i+1) + ": " + players.get(x).getCard(i).getName() + " " + players.get(x).getCard(i).getAbility() + " " );
                        }
                     
                        Scanner input = new Scanner(System.in);
                        System.out.println( "What card would you like to use?(type -1 to end turn)" );
                        int useCardNum = input.nextInt();
                        Cards useCard;
                        if ( useCardNum == -1 )
                        {
                            while(players.get(x).getCardSize() > players.get(x).getChar().getHealth())
                            {
                                System.out.println("You have too many cards, please select a card to discard");
                                int disCardNum = input.nextInt();
                                players.get(x).drawCard(disCardNum-1);
                                System.out.println( "\nPlayer " + (x+1) + " Cards: " );
                                for ( int i = 0; i < players.get(x).getCardSize(); i++ )
                                {
                                    System.out.println( "Card " + (i+1) + ": " + players.get(x).getCard(i).getName() + " " + players.get(x).getCard(i).getAbility() + " " );
                                }
                            }
                            System.out.print("\n");
                            turn = false;
                            break;
                        }  
                        
                        useCard = players.get(x).drawCard(useCardNum-1); // removes selected Card from deck
                         
                        if ( useCard.getName().equalsIgnoreCase("BANG") && usedbang == false )
                        {
                            boolean shot = false; int PlayerShot = x;
                            while( shot == false )
                            {
                                System.out.println( "Who would you like to shoot (i.e. type 1 to shoot player 1)?" );
                                PlayerShot = input.nextInt() - 1;
                                if ( PlayerShot != x && PlayerShot < 4 ) shot = true; // shoots a valid player
                            } // checks who to shoot
                            players.get(PlayerShot).getChar().calcHealth( useCard.getAbility() );
                            usedbang = true;
                        }
                        else if ( useCard.getName().equalsIgnoreCase("BEER") && players.get(x).getChar().getHealth() <= 4) players.get(x).getChar().calcHealth( useCard.getAbility() );
                        else if ( useCard.getName().equalsIgnoreCase("SALOON") )
                        {
                            for ( int i = 0; i < players.size(); i++ )
                            {
                                if ( players.get(i).getChar().isAlive() == true && players.get(i).getChar().getHealth() <= 4 ) players.get(i).getChar().calcHealth( useCard.getAbility() );
                            }
                        }
                        else if ( useCard.getName().equalsIgnoreCase("StageCoach") && players.get(x).getCardSize() < 9)
                        {
                            players.get(x).addCard( cards.get((int)(Math.random()*cards.size())) );
                            players.get(x).addCard( cards.get((int)(Math.random()*cards.size())) );
                        }
                        else if ( useCard.getName().equalsIgnoreCase("Wells Fargo") && players.get(x).getCardSize() < 8 )
                        {
                            players.get(x).addCard( cards.get((int)(Math.random()*cards.size())) );
                            players.get(x).addCard( cards.get((int)(Math.random()*cards.size())) );
                            players.get(x).addCard( cards.get((int)(Math.random()*cards.size())) );
                        }
                        else if ( useCard.getName().equalsIgnoreCase("General Store") )
                        {
                            if(players.get(0).getCardSize() < 9)players.get(0).addCard( cards.get((int)(Math.random()*cards.size())) );
                            if(players.get(1).getCardSize() < 9)players.get(1).addCard( cards.get((int)(Math.random()*cards.size())) );
                            if(players.get(2).getCardSize() < 9)players.get(2).addCard( cards.get((int)(Math.random()*cards.size())) );
                            if(players.get(3).getCardSize() < 9)players.get(3).addCard( cards.get((int)(Math.random()*cards.size())) );
                        }
                        else if ( useCard.getName().equalsIgnoreCase("Panic!") )
                        {
                            System.out.println( "Who do you want to take a card from (i.e. type 1 to take a random card from player 1)? " );
                            int takeFrom = input.nextInt();
                            Cards taken = players.get(takeFrom-1).drawCard( (int)(Math.random()*(players.get(takeFrom-1).getCardSize())) );
                            players.get(x).addCard( taken );
                        }
                        else if ( useCard.getName().equalsIgnoreCase("Cat Balou") )
                        {
                            System.out.println( "Who do you want to pick for them to discard a card (i.e. type 1 to discard a random card from player 1)? " );
                            int makeDiscard = input.nextInt();
                            Cards discard = players.get(makeDiscard-1).drawCard( (int)(Math.random()*(players.get(makeDiscard-1).getCardSize())) );
                        }
                        else if ( useCard.getName().equalsIgnoreCase("Gatling") || useCard.getName().equalsIgnoreCase("Indians") )
                        {
                            for ( int i = 0; i < players.size(); i++ )
                            {
                                players.get(i).getChar().calcHealth( useCard.getAbility() );
                            }
                        }
                        
                        /**
                        * Check for winner HERE
                        * Once the Sheriff is killed, the game is over. If the only player left is a Renegade, the Renegade wins. 
                        * However, if two or more players are still alive or the only remaining player is an Outlaw, all the Outlaws win, dead or alive.
                        * On the other hand, if all Outlaws and Renegades are dead before the Sheriff dies, the Sheriff and all the Deputies win, dead or alive.
                        */
                        if ( (players.get(0).getChar().isAlive() == true) && (players.get(1).getChar().isAlive() == false) &&
                             (players.get(2).getChar().isAlive() == false) && (players.get(3).getChar().isAlive() == false) )
                        {
                            System.out.println( "The only player left is Player 1, the Sheriff. SHERIFF WINS!" );
                            hasWinner = true;
                            break;
                        }
                        else if ( ((players.get(0).getChar().isAlive() == false) && (players.get(3).getChar().isAlive() == false) ) &&
                                  ((players.get(1).getChar().isAlive() == true) || (players.get(2).getChar().isAlive() == true)) )
                        {
                             System.out.println( "Only Outlaw(s) are still alive. OUTLAWS WIN!!!" );
                             hasWinner = true;
                             break;
                        }
                        else if ( (players.get(0).getChar().isAlive() == false) && (players.get(1).getChar().isAlive() == false) &&
                                  (players.get(2).getChar().isAlive() == false) && (players.get(3).getChar().isAlive() == true) )
                        {
                              System.out.println( "The only player left is Player 4, the Renegade. RENEGADE WINS!" );
                              hasWinner = true;
                              break;
                        }
                        else if ( players.get(0).getChar().isAlive() == false )
                        {
                              System.out.println( "Player 1, the Sheriff, has died. GAME OVER!" );
                              hasWinner = true;
                              break;
                        }
                        else if ( players.get(0).getChar().isAlive() == false && players.get(1).getChar().isAlive() == false &&
                                  players.get(2).getChar().isAlive() == false && players.get(3).getChar().isAlive() == false )
                        {
                              System.out.println( "EVERYONE IS DEAD!!! YOU ALL LOSE!" );
                              hasWinner = true;
                              break;
                        }                            
                    }// loops while playing turn
                } // player takes turn only if he/she is still Alive
                  
                 
            } // end for loop that goes through each player's turn
        } // end while loop that "plays" game
    } // end main method
} // end class GameDriver