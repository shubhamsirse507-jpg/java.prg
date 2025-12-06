import javax.swing.*;
import java.awt.*;

public class MarksCalculatorGUI {

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Marks Calculator - PCP Polytechnic");
        frame.setSize(500, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Gradient Background Panel
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;

                GradientPaint gradient = new GradientPaint(
                        0, 0, new Color(0, 130, 255),
                        getWidth(), getHeight(), new Color(0, 18, 60)
                );
                g2.setPaint(gradient);
                g2.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setLayout(null);

        // Header
        JLabel header = new JLabel("PCP Polytechnic College, Pune", SwingConstants.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 23));
        header.setForeground(Color.WHITE);
        header.setBounds(0, 10, 500, 40);
        panel.add(header);

        // Labels
        Font labelFont = new Font("Segoe UI", Font.BOLD, 16);
        Color white = Color.WHITE;

        JLabel l1 = new JLabel("Subject 1:");
        JLabel l2 = new JLabel("Subject 2:");
        JLabel l3 = new JLabel("Subject 3:");
        JLabel resultLabel = new JLabel("Result will appear here");

        l1.setFont(labelFont); 
        l2.setFont(labelFont);
        l3.setFont(labelFont); 
        resultLabel.setFont(labelFont);

        l1.setForeground(white); 
        l2.setForeground(white);
        l3.setForeground(white);
        resultLabel.setForeground(white);

        l1.setBounds(60, 80, 120, 30);
        l2.setBounds(60, 130, 120, 30);
        l3.setBounds(60, 180, 120, 30);
        resultLabel.setBounds(60, 330, 380, 30);

        panel.add(l1); panel.add(l2); panel.add(l3); panel.add(resultLabel);

        // Text Fields
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        t1.setBounds(180, 80, 200, 30);
        t2.setBounds(180, 130, 200, 30);
        t3.setBounds(180, 180, 200, 30);

        panel.add(t1); panel.add(t2); panel.add(t3);

        // Stylish Buttons
        JButton totalBtn = new JButton("Total");
        JButton avgBtn = new JButton("Average");
        JButton perBtn = new JButton("Percentage");
        JButton clearBtn = new JButton("Clear");
        JButton exitBtn = new JButton("Exit");

        totalBtn.setBounds(40, 240, 100, 35);
        avgBtn.setBounds(150, 240, 110, 35);
        perBtn.setBounds(270, 240, 140, 35);
        clearBtn.setBounds(110, 290, 110, 35);
        exitBtn.setBounds(240, 290, 110, 35);

        JButton[] buttons = { totalBtn, avgBtn, perBtn, clearBtn, exitBtn };
        for (JButton b : buttons) {
            b.setFont(new Font("Segoe UI", Font.BOLD, 14));
            b.setBackground(new Color(255, 255, 255));
            b.setForeground(new Color(0, 55, 120));
            b.setFocusPainted(false);
        }

        panel.add(totalBtn); panel.add(avgBtn); panel.add(perBtn);
        panel.add(clearBtn); panel.add(exitBtn);

        // Button Events
        totalBtn.addActionListener(e -> {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = Integer.parseInt(t3.getText());
                resultLabel.setText("Total Marks = " + (a + b + c));
            } catch (Exception ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        avgBtn.addActionListener(e -> {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = Integer.parseInt(t3.getText());
                float avg = (a + b + c) / 3f;
                resultLabel.setText("Average = " + avg);
            } catch (Exception ex) {
                resultLabel.setText("Invalid input!");
            }
        });

      perBtn.addActionListener(e -> {
    try {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());

        int total = a + b + c;
        double average = total / 3.0;
        double percentage = average;

        // Grade logic
        String grade;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "Fail";

        // Show all results
        resultLabel.setText(
            "<html>Total = " + total +
            " | Average = " + String.format("%.2f", average) +
            " | Percentage = " + String.format("%.2f", percentage) +"</html>"
        );

    } catch (Exception ex) {
        resultLabel.setText("Invalid input!");
    }
});


        clearBtn.addActionListener(e -> {
            t1.setText(""); t2.setText(""); t3.setText("");
            resultLabel.setText("Result will appear here");
        });

        exitBtn.addActionListener(e -> System.exit(0));

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
