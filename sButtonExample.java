import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

class PcploginExample extends JButton {
    // overriding paintComponent method to customize button appearance

    protected void paintComponent(Graphics g, Graphics g2) {
        super.paintComponent(g); // call to superclass method to ensure proper button rendering
        g.setColor(Color.BLUE); // setting color for custom drawing
        g.fillRect(20, 20, getWidth() - 40, getHeight() - 40); // filling button background with blue color
        g.setColor(Color.WHITE); // setting color for text
        g.drawString(getText(), getWidth() / 2 - g.getFontMetrics().stringWidth(getText()) / 2, getHeight() / 2 + g.getFontMetrics().getAscent() / 2 - 2);
        g2.setColor(Color.WHITE); // setting color for text
        g.clearRect(40,40, getWidth() - 80, getHeight() - 80);
        g2.drawString(getText(), getWidth() / 2 - g2.getFontMetrics().stringWidth(getText()) / 2, getHeight() / 2 + g2.getFontMetrics().getAscent() / 2 - 2); // drawing button text centered
    }
}

public class sButtonExample { // frame body
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { // ensuring GUI creation on Event Dispatch Thread
            JFrame f = new JFrame();
            f.setLayout(new BorderLayout());
            f.setTitle("PCP Button Test");
            f.setSize(400, 400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            PcploginExample b = new PcploginExample(); // object creation
            b.setText("Click Me");
            PcploginExample b2 = new PcploginExample(); // object creation
            b2.setText("Click Me Too"); // setting text on button

            f.add(b, BorderLayout.NORTH);
            f.add(b2, BorderLayout.SOUTH);

            b.addActionListener(e ->
                JOptionPane.showMessageDialog(f, "Button Clicked!")
            );
            b2.addActionListener(e -> 
                JOptionPane.showMessageDialog(f, "Button 2 Clicked!") );
            f.setVisible(true); // making frame visible
        });
    }
}