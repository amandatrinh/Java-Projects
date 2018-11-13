import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Paint extends JPanel
{
      
      public void paintComponent(Graphics g) 
      {
         super.paintComponent(g);
         g.setColor(Color.WHITE);
         super.setBackground(Color.BLACK);
         //words
         g.drawString( "Player 1", 150, 20 );
         g.drawString( "Sheriff", 150, 35 );
         g.drawString( "Player 2", 450, 20);
         g.drawString( "Outlaw", 450, 35 );
         g.drawString( "Player 3", 750, 20 );
         g.drawString( "Outlaw", 750, 35 );
         g.drawString( "Player 4", 1050, 20 );
         g.drawString( "Renegade", 1050, 35 );
         //g.drawString( player.getLife(player1),)
         g.drawString( "bullets:" , 10, 65 );
         g.drawString( "bullets:", 310, 65 );
         g.drawString( "bullets:", 610, 65 );
         g.drawString( "bullets:", 910, 65 );
         //linesss
         // possibly(if time) make method that looked at the window size and set everything accordingly
         g.drawLine( 300, 0, 300, 500); // first vertical line  
         g.drawLine( 600, 0, 600, 500); // second vertical line
         g.drawLine( 900, 0, 900, 500); // thrid vertical line
         g.drawLine( 0, 50, 1200, 50); // top horizontal line
         g.drawLine( 0, 500, 1200, 500); // lower horizontal line
      }
}

