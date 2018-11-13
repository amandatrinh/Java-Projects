// used for font and color here
import java.awt.Font;
import java.awt.Graphics;

// imports necessary classes for GUI
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new GUI());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
    
    public void paint(Graphics g) 
    {
        Font f = new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 14);
        g.setFont (f);
        g.drawString ("Your GPA is... ", 10, 90);
    }
}