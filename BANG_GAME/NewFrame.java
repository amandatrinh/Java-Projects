import java.awt.Container;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.Dimension;
public class NewFrame extends JFrame 
{
    JTextField txtItem;
    public class Button extends MouseAdapter implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            System.exit(0);
        } // end method actionPerformed 

    } // end class
    int p1j = 0;
    int p2j = 0;
    int p3j = 0;
    int p4j = 0;
    int length1 = 0;
    int length2 = 0;
    int length3 = 0;
    int length4 = 0;

    public NewFrame()//static void addComponentsToContent(Container content) 
    {
        super("BANG!");
        /*content.*/setLayout(null);
        //super("Class Paint");  
        //Paint display = new Paint();

        //JButton skip = new JButton("Skip");
        //Button listener = new Button();
        //skip.addActionListener(listener);
        //JButton defendp4 = new JButton("Defend");
        JButton okButton = new JButton("End Game");
        Button listener = new Button();
        okButton.addActionListener(listener);
        /*content.*/
        /*content.*///add(defendp1);
        /*content.*/add(okButton);
        /*content.*///add(display);

        //add(defendp2);
        //add(defendp3);
        //add(defendp4);
        //txtItem = new JTextField(10);

        Insets insets = /*content.*/getInsets();

        //size = defendp1.getPreferredSize();
        //defendp1.setBounds(25 + insets.left, 40 + insets.top,
        //size.width, size.height);
        //size = defendp2.getPreferredSize();
        //defendp2.setBounds(325 + insets.left, 40 + insets.top,
        //size.width, size.height);
        //size = defendp3.getPreferredSize();
        //defendp3.setBounds(625 + insets.left, 40 + insets.top,
        //size.width, size.height);
        //size = defendp4.getPreferredSize();
        //defendp4.setBounds(925 + insets.left, 40 + insets.top,
        //size.width, size.height);
        Dimension size = okButton.getPreferredSize();
        okButton.setBounds(550 + insets.left, 700 + insets.top,
            size.width, size.height);
        //size = skip.getPreferredSize();
        //skip.setBounds(550+insets.left, 890 + insets.top,
        //size.width, size.height);
        //size = display.getPreferredSize();
        //*/display.setBounds(1size.height + insets.left,800 + insets.top,
        //size.width, size.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,800);
        setVisible(true);

        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add( new Character(4, "Willy the Kid") );//Can play any number of Bang cards
        characters.add( new Character(4, "Vulture Sam") );//Sam takes all the cards of the eliminated Character 
        characters.add( new Character(4, "Suzy Lafayette") );//when she has no cards in her hand, she draws a card from draw pile
        // characters.add( new Character(4, "Slab The Killer") );//Character trying to miss his bang has to play 2 misses
        characters.add( new Character(4, "Sid Ketchum") );//May dicard 2 cards to regain one life point
        // characters.add( new Character(4, "Rose Doolan") );//has a scope of decreased distance by 1
        // characters.add( new Character(4, "Pedro Ramirez") );//may draw first card from top of the discard pile or from deck
        // characters.add( new Character(3, "Paul Regret") );//all Characters must have a add 1 to reach him
        // characters.add( new Character(4, "Lucky Duke") );//whenever he has to draw! he flips the top two cards from the deck
        characters.add( new Character(4, "Kit Carlson") );//looks at the top three crads of the deck and chooses 2
        // characters.add( new Character(4, "Jourdonnais") );//Has a barrel at all times
        // characters.add( new Character(4, "Jesse Jones") );//may draw first card from deck or from the hand of another Character
        // characters.add( new Character(3, "El Gringo") );//each time he loses a life point he draws a random card from hand of that Character
        // characters.add( new Character(4, "Calamity Janet") );//she can use bang as missed card and vice versa
        // characters.add( new Character(4, "Black Jack") );//must show second card he draws, if it is heart or diamond he draws and additional card
        characters.add( new Character(4, "Bart Cassidy") );//each time he loses a life point he inmediately draws a card from the deck.

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
        cards.add( new Cards( "Panic", 0 ) ); // takes a card from another player
        cards.add( new Cards( "Panic", 0 ) ); // takes a card from another player
        cards.add( new Cards( "Panic", 0 ) ); // takes a card from another player
        cards.add( new Cards( "Cat Balou", 0 ) ); // forces a player to discard a card
        cards.add( new Cards( "Cat Balou", 0 ) ); // forces a player to discard a card
        cards.add( new Cards( "Cat Balou", 0 ) ); // forces a player to discard a card
        cards.add( new Cards( "Gatling", -1 ) ); // -1 health on everyone
        cards.add( new Cards( "Indians", -1 ) ); // everyone -1
        int length = 0;
        int j = 0;

        for ( int i = 0; i < 5; i++ )
        {
            j = (int)(Math.random()*cards.size());
            players.get(0).addCard( cards.get(j) );
            addCardGraphics(p1j, 0, players, length);
            p1j++;

            j = (int)(Math.random()*cards.size());
            players.get(1).addCard( cards.get(j) );
            addCardGraphics(p2j, 1, players,length);
            p2j++;

            j = (int)(Math.random()*cards.size());
            players.get(2).addCard( cards.get(j) );
            addCardGraphics(p3j, 2, players,length);
            p3j++;

            j = (int)(Math.random()*cards.size());
            players.get(3).addCard( cards.get(j) );
            addCardGraphics(p4j, 3, players,length);
            p4j++;

            length+=100;
        }

        boolean hasWinner = false;
        while (hasWinner == false)
        {
            for(int x = 0; x < players.size(); x++)
            {

                if ( players.get(x).getChar().isAlive() == true )
                {
                    boolean usedbang = false;
                    boolean turn = true;
                    j = (int)(Math.random()*cards.size());
                    players.get(x).addCard( cards.get(j) );
                    addCardGraphics(getpj(x),x, players,length);
                    addpj(x);
                    length+=100;
                    j = (int)(Math.random()*cards.size());
                    players.get(x).addCard( cards.get(j) );
                    addCardGraphics(getpj(x),x, players,length);
                    addpj(x);
                    length+=100;

                    while(turn == true)
                    {
                        String data  = JOptionPane.showInputDialog( "What card would you like to use?(type end to end turn)" );
                        Cards useCard;
                        int useCardNum=0;
                        for ( int i = 0; i < players.get(x).getCardSize(); i++ )
                        {
                            if ( data.equalsIgnoreCase(players.get(x).getCard(i).getName()))
                            {
                                useCardNum = i;
                            }

                        } // end for
                        // = input.nextInt();

                        if ( data.equalsIgnoreCase("END") )
                        {
                            /*while(players.get(x).getCardSize() > players.get(x).getChar().getHealth())
                            {
                            System.out.println("You have too many cards, please select a card to discard");
                            int disCardNum = input.nextInt();
                            players.get(x).drawCard(disCardNum-1);
                            System.out.println( "\nPlayer " + (x+1) + " Cards: " );
                            for ( int i = 0; i < players.get(x).getCardSize(); i++ )
                            {
                            System.out.println( "Card " + (i+1) + ": " + players.get(x).getCard(i).getName() + " " + players.get(x).getCard(i).getAbility() + " " );
                            }
                            } */
                            //System.out.print("\n");
                            turn = false;
                            break;
                        }  

                        useCard = players.get(x).drawCard(useCardNum); // removes selected Card from deck

                        if ( data.equalsIgnoreCase("BANG") /*&& usedbang == false*/ )
                        {
                            boolean shot = false; int PlayerShot = x;
                            int playerShoot = 0;
                            while( shot == false )
                            {
                                String shoot = JOptionPane.showInputDialog("Who would you like to shoot (i.e. type p1 to shoot player 1)?" );

                                if ( shoot.equalsIgnoreCase("p1")) playerShoot=1;
                                else if ( shoot.equalsIgnoreCase("p2")) playerShoot=2;
                                else if ( shoot.equalsIgnoreCase("p3")) playerShoot=3;
                                else if ( shoot.equalsIgnoreCase("p4")) playerShoot=4;
                                //PlayerShot = input.nextInt() - 1;
                                if ( playerShoot != x && playerShoot <= 4 ) shot = true; // shoots a valid player
                            } // checks who to shoot
                            players.get(PlayerShot).getChar().calcHealth( useCard.getAbility() );
                            JButton fuckThisStupidFuckingProject = new JButton("health" + players.get(PlayerShot).getChar().getHealth());
                            if ( playerShoot==1)
                            {
                                size = fuckThisStupidFuckingProject.getPreferredSize();
                                fuckThisStupidFuckingProject.setBounds(15 + insets.left, 75 + insets.top,
                                    size.width, size.height);
                                add(fuckThisStupidFuckingProject);
                            } else if ( playerShoot == 2)
                            {
                                size = fuckThisStupidFuckingProject.getPreferredSize();
                                fuckThisStupidFuckingProject.setBounds(15 + insets.left, 245 + insets.top,
                                    size.width, size.height);
                                add(fuckThisStupidFuckingProject);
                            } else if ( playerShoot == 3)
                            {
                                size = fuckThisStupidFuckingProject.getPreferredSize();
                                fuckThisStupidFuckingProject.setBounds(15 + insets.left, 445 + insets.top,
                                    size.width, size.height);
                                add(fuckThisStupidFuckingProject);
                            }else if ( playerShoot == 4)
                            {
                                size = fuckThisStupidFuckingProject.getPreferredSize();
                                fuckThisStupidFuckingProject.setBounds(15 + insets.left, 655 + insets.top,
                                    size.width, size.height);
                                add(fuckThisStupidFuckingProject);
                            }

                            usedbang = true;
                        }
                        else if ( data.equalsIgnoreCase("BEER") && players.get(x).getChar().getHealth() <= 4)
                        {
                            players.get(x).getChar().calcHealth( useCard.getAbility() );
                            JButton fuckThisStupidFuckingProject = new JButton("health" + players.get(x).getChar().getHealth());
                            if ( x==1)
                            {
                                size = fuckThisStupidFuckingProject.getPreferredSize();
                                fuckThisStupidFuckingProject.setBounds(15 + insets.left, 75 + insets.top,
                                    size.width, size.height);
                                add(fuckThisStupidFuckingProject);
                            } else if ( x == 2)
                            {
                                size = fuckThisStupidFuckingProject.getPreferredSize();
                                fuckThisStupidFuckingProject.setBounds(15 + insets.left, 245 + insets.top,
                                    size.width, size.height);
                                add(fuckThisStupidFuckingProject);
                            } else if ( x == 3)
                            {
                                size = fuckThisStupidFuckingProject.getPreferredSize();
                                fuckThisStupidFuckingProject.setBounds(15 + insets.left, 445 + insets.top,
                                    size.width, size.height);
                                add(fuckThisStupidFuckingProject);
                            }else if ( x == 4)
                            {
                                size = fuckThisStupidFuckingProject.getPreferredSize();
                                fuckThisStupidFuckingProject.setBounds(15 + insets.left, 655 + insets.top,
                                    size.width, size.height);
                                add(fuckThisStupidFuckingProject);
                            }
                        }
                        else if ( useCard.getName().equalsIgnoreCase("SALOON") )
                        {
                            for ( int i = 0; i < players.size(); i++ )
                            {
                                if ( players.get(i).getChar().isAlive() == true && players.get(i).getChar().getHealth() <= 4 ) 
                                {
                                    players.get(i).getChar().calcHealth( useCard.getAbility() );
                                    JButton fuckThisStupidFuckingProject = new JButton("health" + players.get(i).getChar().getHealth());
                                    if ( x==1)
                                    {
                                        size = fuckThisStupidFuckingProject.getPreferredSize();
                                        fuckThisStupidFuckingProject.setBounds(15 + insets.left, 75 + insets.top,
                                            size.width, size.height);
                                        add(fuckThisStupidFuckingProject);
                                    } else if ( x == 2)
                                    {
                                        size = fuckThisStupidFuckingProject.getPreferredSize();
                                        fuckThisStupidFuckingProject.setBounds(15 + insets.left, 245 + insets.top,
                                            size.width, size.height);
                                        add(fuckThisStupidFuckingProject);
                                    } else if ( x == 3)
                                    {
                                        size = fuckThisStupidFuckingProject.getPreferredSize();
                                        fuckThisStupidFuckingProject.setBounds(15 + insets.left, 445 + insets.top,
                                            size.width, size.height);
                                        add(fuckThisStupidFuckingProject);
                                    }else if ( x == 4)
                                    {
                                        size = fuckThisStupidFuckingProject.getPreferredSize();
                                        fuckThisStupidFuckingProject.setBounds(15 + insets.left, 655 + insets.top,
                                            size.width, size.height);
                                        add(fuckThisStupidFuckingProject);
                                    }
                                }
                            }
                        }
                        else if ( data.equalsIgnoreCase("StageCoach") && players.get(x).getCardSize() < 9)
                        {
                            j = (int)(Math.random()*cards.size());
                            players.get(x).addCard( cards.get(j) );
                            addCardGraphics(getpj(x),x,players,length);
                            addpj(x);
                            length+=100;

                            j = (int)(Math.random()*cards.size());
                            players.get(x).addCard( cards.get(j) );
                            addCardGraphics(getpj(x),x,players,length);
                            addpj(x);
                            length+=100;

                        }
                        else if ( data.equalsIgnoreCase("Wells Fargo") && players.get(x).getCardSize() < 8 )
                        {
                            j = (int)(Math.random()*cards.size());
                            players.get(x).addCard( cards.get(j) );
                            addCardGraphics(getpj(x),x,players,length);
                            addpj(x);
                            length+=100;

                            j = (int)(Math.random()*cards.size());
                            players.get(x).addCard( cards.get(j) );
                            addCardGraphics(getpj(x),x,players,length);
                            addpj(x);
                            length+=100;

                            j = (int)(Math.random()*cards.size());
                            players.get(x).addCard( cards.get(j) );
                            addCardGraphics(getpj(x),x,players,length);
                            addpj(x);
                            length+=100;

                        }
                        else if ( data.equalsIgnoreCase("General Store") )
                        {
                            if(players.get(0).getCardSize() < 9)
                            {
                                j = (int)(Math.random()*cards.size());
                                players.get(0).addCard( cards.get(j) );
                                addCardGraphics(getpj(0),0,players,length);
                                addpj(0);
                                length+=100;

                            }
                            if(players.get(1).getCardSize() < 9)
                            {
                                j = (int)(Math.random()*cards.size());
                                players.get(1).addCard( cards.get(j) );
                                addCardGraphics(getpj(1),1,players,length);
                                addpj(1);
                                length+=100;

                            }
                            if(players.get(2).getCardSize() < 9)
                            {
                                j = (int)(Math.random()*cards.size());
                                players.get(2).addCard( cards.get(j) );
                                addCardGraphics(getpj(2),2,players,length);
                                addpj(2);
                                length+=100;

                            }
                            if(players.get(3).getCardSize() < 9)
                            {
                                j = (int)(Math.random()*cards.size());
                                players.get(3).addCard( cards.get(j) );
                                addCardGraphics(getpj(3),3,players,length);
                                addpj(3);
                                length+=100;

                            }
                        }
                        else if ( data.equalsIgnoreCase("Panic") )
                        {
                            String take = JOptionPane.showInputDialog( "Who do you want to take a card from (i.e. type p1 to take a random card from player 1)? " );
                            int takeFrom=0;
                            if ( take.equalsIgnoreCase("p1")) takeFrom=1;
                            else if ( take.equalsIgnoreCase("p2")) takeFrom=2;
                            else if ( take.equalsIgnoreCase("p3")) takeFrom=3;
                            else if ( take.equalsIgnoreCase("p4")) takeFrom=4;
                            j = (int)(Math.random()*(players.get(takeFrom-1).getCardSize()));
                            Cards taken = players.get(takeFrom-1).drawCard(j);
                            players.get(x).addCard( taken );
                            addCardGraphics(getpj(x),x,players,length);
                            addpj(x);
                            length+=100;

                        }
                        else if ( data.equalsIgnoreCase("Cat Balou") )
                        {
                            String make = JOptionPane.showInputDialog( "Who do you want to pick for them to discard a card (i.e. type p1 to discard a random card from player 1)? " );
                            int makeDiscard=0;
                            if ( make.equalsIgnoreCase("p1")) makeDiscard=1;
                            else if ( make.equalsIgnoreCase("p2")) makeDiscard=2;
                            else if ( make.equalsIgnoreCase("p3")) makeDiscard=3;
                            else if ( make.equalsIgnoreCase("p4")) makeDiscard=4;
                            Cards discard = players.get(makeDiscard-1).drawCard( (int)(Math.random()*(players.get(makeDiscard-1).getCardSize())) );
                        }
                        else if ( data.equalsIgnoreCase("Gatling") || data.equalsIgnoreCase("Indians") )
                        {
                            for ( int i = 0; i < players.size(); i++ )
                            {
                                players.get(i).getChar().calcHealth( useCard.getAbility() );
                                JButton fuckThisStupidFuckingProject = new JButton("health" + players.get(i).getChar().getHealth());
                                if ( x==1)
                                {
                                    size = fuckThisStupidFuckingProject.getPreferredSize();
                                    fuckThisStupidFuckingProject.setBounds(15 + insets.left, 75 + insets.top,
                                        size.width, size.height);
                                    add(fuckThisStupidFuckingProject);
                                } else if ( x == 2)
                                {
                                    size = fuckThisStupidFuckingProject.getPreferredSize();
                                    fuckThisStupidFuckingProject.setBounds(15 + insets.left, 245 + insets.top,
                                        size.width, size.height);
                                    add(fuckThisStupidFuckingProject);
                                } else if ( x == 3)
                                {
                                    size = fuckThisStupidFuckingProject.getPreferredSize();
                                    fuckThisStupidFuckingProject.setBounds(15 + insets.left, 445 + insets.top,
                                        size.width, size.height);
                                    add(fuckThisStupidFuckingProject);
                                }else if ( x == 4)
                                {
                                    size = fuckThisStupidFuckingProject.getPreferredSize();
                                    fuckThisStupidFuckingProject.setBounds(15 + insets.left, 655 + insets.top,
                                        size.width, size.height);
                                    add(fuckThisStupidFuckingProject);
                                }
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
                            JOptionPane.showMessageDialog(null, "The only player left is Player 1, the Sheriff. SHERIFF WINS!" );
                            hasWinner = true;
                            break;
                        }
                        else if ( ((players.get(0).getChar().isAlive() == false) && (players.get(3).getChar().isAlive() == false) ) &&
                        ((players.get(1).getChar().isAlive() == true) || (players.get(2).getChar().isAlive() == true)) )
                        {
                            JOptionPane.showMessageDialog(null, "Only Outlaw(s) are still alive. OUTLAWS WIN!!!" );
                            hasWinner = true;
                            break;
                        }
                        else if ( (players.get(0).getChar().isAlive() == false) && (players.get(1).getChar().isAlive() == false) &&
                        (players.get(2).getChar().isAlive() == false) && (players.get(3).getChar().isAlive() == true) )
                        {
                            JOptionPane.showMessageDialog(null, "The only player left is Player 4, the Renegade. RENEGADE WINS!" );
                            hasWinner = true;
                            break;
                        }
                        else if ( players.get(0).getChar().isAlive() == false )
                        {
                            JOptionPane.showMessageDialog(null, "Player 1, the Sheriff, has died. GAME OVER!" );
                            hasWinner = true;
                            break;
                        }
                        else if ( players.get(0).getChar().isAlive() == false && players.get(1).getChar().isAlive() == false &&
                        players.get(2).getChar().isAlive() == false && players.get(3).getChar().isAlive() == false )
                        {
                            JOptionPane.showMessageDialog(null,"EVERYONE IS DEAD!!! YOU ALL LOSE!" );
                            hasWinner = true;
                            break;
                        }                       
                    }// loops while playing turn
                } // player takes turn only if he/she is still Alive

            } // end for loop that goes through each player's turn
        } // end while loop that "plays" game

        //ArrayList<JButton> p1cards = new ArrayList<JButton>();
        //ArrayList<JButton> p2cards = new ArrayList<JButton>();
        //ArrayList<JButton> p3cards = new ArrayList<JButton>();
        //ArrayList<JButton> p4cards = new ArrayList<JButton>();
        //ArrayList<JButton> pcards = new ArrayList<JButton>();
        // is there a winner yet?

        //Paint display = new Paint();
        //  window.add(display,BorderLayout.CENTER);

    } // end method add ComponentsToContent
    public int getpj(int x)
    {
        if ( x == 0 ) return p1j;
        else if ( x==1) return p2j;
        else if (x==2) return p3j;
        else  return p4j;

    }

    public int addpj(int x)
    {
        if ( x == 0 ) return p1j++;
        else if ( x==1) return p2j++;
        else if (x==2) return p3j++;
        else  return p4j++;

    }
    
    //public int addlength(int x)
    //{
        //if ( x == 0 ) return length1+=100;
        //else if ( x == 1 ) return length2+=100;
        //else if ( x == 2 ) return length3+=100;
        //else return length4+=100;
    //} 

    public  void addCardGraphics(int j, int x, ArrayList<Player> players, int length)
    {
        Dimension size;
        Insets  insets = /*content.*/getInsets();
        if ( players.get(x).getCard(j).getName().equalsIgnoreCase("BANG") )
        {
            //JButton bang = new JButton();
            /*BufferedImage bangpic;
            //try
            //{
            bangpic = ImageIO.read(new File("pics/bang.jpg"));
            bangpic.getScaledInstance(100, 150, Image.SCALE_DEFAULT);
            //}
            //catch(IOException e){
            //System.out.println(e.getMessage());
            //}*/ 

            ImageIcon bangIcon = new ImageIcon(getClass().getResource("pics/Bang.png"));
            Image bangimage = bangIcon.getImage();
            bangimage = bangimage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            bangIcon.setImage(bangimage);
            JButton bang = new JButton(bangIcon);

            if ( x == 0 )
            {
                size = bang.getPreferredSize();
                bang.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150); 
                add(bang);
            }
            else if ( x == 1 )
            {
                size = bang.getPreferredSize();
                bang.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150); 
                add(bang);
            } 
            else if ( x == 2 )
            {
                size = bang.getPreferredSize();
                bang.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(bang);
            } 
            else if ( x == 3 )
            {
                size = bang.getPreferredSize();
                bang.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(bang);
            } 

        } else if ( players.get(x).getCard(j).getName().equalsIgnoreCase("GATLING") )
        {

            ImageIcon cIcon = new ImageIcon(getClass().getResource("pics/Catling.png"));
            Image cImage = cIcon.getImage();
            cImage = cImage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            cIcon.setImage(cImage);
            JButton catling = new JButton(cIcon);

            if ( x == 0 )
            {
                size = catling.getPreferredSize();
                catling.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150); 
                add(catling);
            }
            else if ( x == 1 )
            {
                size = catling.getPreferredSize();
                catling.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150); 
                add(catling);
            } 
            else if ( x == 2 )
            {
                size = catling.getPreferredSize();
                catling.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(catling);
            } 
            else if ( x == 3 )
            {
                size = catling.getPreferredSize();
                catling.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(catling);
            } 

        } else if ( players.get(x).getCard(j).getName().equalsIgnoreCase("CAT BALOU") )
        {
            ImageIcon caIcon = new ImageIcon(getClass().getResource("pics/CatBalou.png"));
            Image caImage = caIcon.getImage();
            caImage = caImage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            caIcon.setImage(caImage);
            JButton catBalou = new JButton(caIcon);

            if ( x == 0 )
            {
                size = catBalou.getPreferredSize();
                catBalou.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150); 
                add(catBalou);
            }
            else if ( x == 1 )
            {
                size = catBalou.getPreferredSize();
                catBalou.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150 ); 
                add(catBalou);
            } 
            else if ( x == 2 )
            {
                size = catBalou.getPreferredSize();
                catBalou.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(catBalou);
            } 
            else if ( x == 3 )
            {
                size = catBalou.getPreferredSize();
                catBalou.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(catBalou);
            } 

        } else if ( players.get(x).getCard(j).getName().equalsIgnoreCase("SALON") )
        {
            ImageIcon sIcon = new ImageIcon(getClass().getResource("pics/Salon.png"));
            Image sImage = sIcon.getImage();
            sImage = sImage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            sIcon.setImage(sImage);
            JButton salon = new JButton(sIcon);

            if ( x == 0 )
            {
                size = salon.getPreferredSize();
                salon.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150); 
                add(salon);
            }
            else if ( x == 1 )
            {
                size = salon.getPreferredSize();
                salon.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150); 
                add(salon);
            } 
            else if ( x == 2 )
            {
                size = salon.getPreferredSize();
                salon.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(salon);

            } 
            else if ( x == 3 )
            {
                size = salon.getPreferredSize();
                salon.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(salon);
            } 

        } else if ( players.get(x).getCard(j).getName().equalsIgnoreCase("STAGECOACH") )
        {
            ImageIcon scIcon = new ImageIcon(getClass().getResource("pics/StageCoach.png"));
            Image scImage = scIcon.getImage();
            scImage = scImage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            scIcon.setImage(scImage);
            JButton stageCoach = new JButton(scIcon);
            if ( x == 0 )
            {
                size = stageCoach.getPreferredSize();
                stageCoach.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150); 
                add(stageCoach);
            }
            else if ( x == 1 )
            {
                size = stageCoach.getPreferredSize();
                stageCoach.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150); 
                add(stageCoach);
            } 
            else if ( x == 2 )
            {
                size = stageCoach.getPreferredSize();
                stageCoach.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(stageCoach);
            } 
            else if ( x == 3 )
            {
                size = stageCoach.getPreferredSize();
                stageCoach.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(stageCoach);
            } 

        } else if ( players.get(x).getCard(j).getName().equalsIgnoreCase("WELLS FARGO") )
        {
            ImageIcon wfIcon = new ImageIcon(getClass().getResource("pics/WellsFargo.png"));
            Image wfImage = wfIcon.getImage();
            wfImage = wfImage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            wfIcon.setImage(wfImage);
            JButton wellsFargo = new JButton(wfIcon);
            if ( x == 0 )
            {
                size = wellsFargo.getPreferredSize();
                wellsFargo.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150); 
                add(wellsFargo);
            }
            else if ( x == 1 )
            {
                size = wellsFargo.getPreferredSize();
                wellsFargo.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150); 
                add(wellsFargo);
            } 
            else if ( x == 2 )
            {
                size = wellsFargo.getPreferredSize();
                wellsFargo.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(wellsFargo);
            } 
            else if ( x == 3 )
            {
                size = wellsFargo.getPreferredSize();
                wellsFargo.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(wellsFargo);
            } 

        } else if ( players.get(x).getCard(j).getName().equalsIgnoreCase("INDIANS") )
        {
            ImageIcon iIcon = new ImageIcon(getClass().getResource("pics/Indians.png"));
            Image iImage = iIcon.getImage();
            iImage = iImage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            iIcon.setImage(iImage);
            JButton indians = new JButton(iIcon);
            if ( x == 0 )
            {
                size = indians.getPreferredSize();
                indians.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150);
                add(indians);
            }
            else if ( x == 1 )
            {
                size = indians.getPreferredSize();
                indians.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150); 
                add(indians);
            } 
            else if ( x == 2 )
            {
                size = indians.getPreferredSize();
                indians.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(indians);
            } 
            else if ( x == 3 )
            {
                size = indians.getPreferredSize();
                indians.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(indians);
            } 

        } else if ( players.get(x).getCard(j).getName().equalsIgnoreCase("PANIC") )
        {
            ImageIcon pIcon = new ImageIcon(getClass().getResource("pics/Panic.png"));
            Image pImage = pIcon.getImage();
            pImage = pImage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            pIcon.setImage(pImage);
            JButton panic = new JButton(pIcon);
            if ( x == 0 )
            {
                size = panic.getPreferredSize();
                panic.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150);
                add(panic);
            }
            else if ( x == 1 )
            {
                size = panic.getPreferredSize();
                panic.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150); 
                add(panic);
            } 
            else if ( x == 2 )
            {
                size = panic.getPreferredSize();
                panic.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(panic);
            } 
            else if ( x == 3 )
            {
                size = panic.getPreferredSize();
                panic.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(panic);
            } 

        } else if ( players.get(x).getCard(j).getName().equalsIgnoreCase("BEER") )
        {
            ImageIcon bIcon = new ImageIcon(getClass().getResource("pics/Beer.png"));
            Image bImage = bIcon.getImage();
            bImage = bImage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            bIcon.setImage(bImage);
            JButton beer = new JButton(bIcon);
            if ( x == 0 )
            {
                size = beer.getPreferredSize();
                beer.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150); 
                add(beer);
            }
            else if ( x == 1 )
            {
                size = beer.getPreferredSize();
                beer.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150 );
                add(beer);
            } 
            else if ( x == 2 )
            {
                size = beer.getPreferredSize();
                beer.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(beer);
            } 
            else if ( x == 3 )
            {
                size = beer.getPreferredSize();
                beer.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(beer);
            } 

        } else if ( players.get(x).getCard(j).getName().equalsIgnoreCase("GENERAL STORE") )
        {
            ImageIcon bIcon = new ImageIcon(getClass().getResource("pics/GeneralStore.png"));
            Image bImage = bIcon.getImage();
            bImage = bImage.getScaledInstance( 100, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
            bIcon.setImage(bImage);
            JButton generalStore = new JButton(bIcon);
            if ( x == 0 )
            {
                size = generalStore.getPreferredSize();
                generalStore.setBounds(80 + length + insets.left, 5 + insets.top,
                    100,150); 
                add(generalStore);
            }
            else if ( x == 1 )
            {
                size = generalStore.getPreferredSize();
                generalStore.setBounds(80 + length + insets.left, 205 + insets.top,
                    100,150); 
                add(generalStore);
            } 
            else if ( x == 2 )
            {
                size = generalStore.getPreferredSize();
                generalStore.setBounds(80 + length + insets.left, 405 + insets.top,
                    100,150); 
                add(generalStore);
            } 
            else if ( x == 3 )
            {
                size = generalStore.getPreferredSize();
                generalStore.setBounds(80 + length + insets.left, 605 + insets.top,
                    100,150); 
                add(generalStore);
            } 
        } 

    } // end method addCardGraphics


    /*public static void addComponentsToContent(Container content)
    {
    new NewFrame();
    }*/
    public void paint(Graphics g) 
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        super.setBackground(Color.WHITE);
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add( new Character(4, "Willy the Kid") );//Can play any number of Bang cards
        characters.add( new Character(4, "Vulture Sam") );//Sam takes all the cards of the eliminated Character 
        characters.add( new Character(4, "Suzy Lafayette") );//when she has no cards in her hand, she draws a card from draw pile
        characters.add( new Character(4, "Sid Ketchum") );//May dicard 2 cards to regain one life point
        characters.add( new Character(4, "Kit Carlson") );//looks at the top three crads of the deck and chooses 2
        characters.add( new Character(4, "Bart Cassidy") );//each time he loses a life point he inmediately draws a card from the deck.

        ArrayList<Player> players = new ArrayList<Player>();
        Player P1 = new Player("Kill the Outlaws", "Sheriff", characters.remove( (int)(Math.random()*characters.size()) ));
        Player P2 = new Player("Kill the Sheriff", "Outlaw", characters.remove( (int)(Math.random()*characters.size()) ));
        Player P3 = new Player("Kill the Sheriff", "Outlaw", characters.remove( (int)(Math.random()*characters.size()) ));
        Player P4 = new Player("Be the last one alive", "Renegade", characters.remove( (int)(Math.random()*characters.size()) ));
        players.add( P1 ); players.add( P2 ); players.add( P3 ); players.add( P4 ); 

        ArrayList<Cards> cards = new ArrayList<Cards>();
        cards.add( new Cards( "BANG", -1 ) ); // player loses 1 health
        cards.add( new Cards( "BEER", +1 ) ); // gives player 1 health
        cards.add( new Cards( "SALOON", +1 ) ); // gives everyone +1 health
        cards.add( new Cards( "StageCoach", 0 ) ); // player draws two cards
        cards.add( new Cards( "Wells Fargo", 0 ) ); // player draws three cards
        cards.add( new Cards( "General Store", 0 ) ); // player draws as many cards as there are players and then each player picks a card
        cards.add( new Cards( "Panic", 0 ) ); // takes a card from another player
        cards.add( new Cards( "Cat Balou", 0 ) ); // forces a player to discard a card
        cards.add( new Cards( "Gatling", -1 ) ); // -1 health on everyone
        cards.add( new Cards( "Indians", -1 ) ); // everyone -1
        for ( int i = 0; i < 5; i++ )
        {
            players.get(0).addCard( cards.get((int)(Math.random()*cards.size())) );
            players.get(1).addCard( cards.get((int)(Math.random()*cards.size())) );
            players.get(2).addCard( cards.get((int)(Math.random()*cards.size())) );
            players.get(3).addCard( cards.get((int)(Math.random()*cards.size())) );
        }

        //words
        g.drawString( "Player 1", 15, 45 );
        g.drawString( "Sheriff", 15, 60 );
        g.drawString( "Player 2", 15, 215);
        g.drawString( "Outlaw", 15, 230 );
        g.drawString( "Player 3", 15, 415 );
        g.drawString( "Outlaw", 15, 430 );
        g.drawString( "Player 4", 15, 615 );
        g.drawString( "Renegade", 15, 630 );
        //g.drawString( player.getLife(player1),)
        //g.drawString( "health: 4" , 15, 75 );
        //g.drawString( "health: 4", 15, 245 );
        //g.drawString( "health: 4", 15, 445 );
        //g.drawString( "health: 4", 15, 655 );
        //linesss
        // possibly(if time) make method that looked at the window size and set everything accordingly
        g.drawLine( 75, 0, 75, 800);
        g.drawLine( 0, 190, 1200, 190);
        g.drawLine( 0, 390, 1200, 390);
        g.drawLine( 0, 590, 1200, 590);
        //g.drawLine( 300, 0, 300, 800); // first vertical line  
        //g.drawLine( 600, 0, 600, 800); // second vertical line
        //g.drawLine( 900, 0, 900, 800); // thrid vertical line
        //g.drawLine( 0, 80, 1200, 80); // top horizontal line
    }

    /*private static void createAndShowGUI() 
    {
    JFrame window = new JFrame("BANG");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    addComponentsToContent(window.getContentPane());

    Insets insets = window.getInsets();
    window.setSize(1size.height,800);
    window.setVisible(true);

    } // end method createAndShowGUI*/
    public static void main(String[] args) 
    {

        new NewFrame();

        /*javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
        public void run() 
        {
        createAndShowGUI();
        }
        });*/

    } // end main method
} // end class
