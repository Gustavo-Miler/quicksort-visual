import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

public class MyPanel extends JPanel{

    MyPanel(){
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.black);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.green);
        Random rand = new Random();
        for (int i = 1; i < 51; i++) {
            g2D.fillRect(i * 10 - 10, 0, 10, rand.nextInt(50) * 10);
        }
        repaint();
    }
}
