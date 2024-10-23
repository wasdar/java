package lab6;

import javax.swing.*;
import java.awt.*;

public class Match extends JFrame {
    private int mil = 0, mad = 0;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public Match() {
        setTitle("Match AC Milan VS Real Madrid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setPreferredSize(new Dimension(300, 300));

        JButton acMilan = new JButton("AC Milan");
        JButton realMadrid = new JButton("Real Madrid");

        label1 = new JLabel("Result: 0 X 0", JLabel.CENTER);
        label2 = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        label3 = new JLabel("Winner: DRAW", JLabel.CENTER);

        panel.add(acMilan);
        panel.add(realMadrid);

        getContentPane().add(label1, BorderLayout.NORTH);
        getContentPane().add(label2, BorderLayout.CENTER);
        getContentPane().add(label3, BorderLayout.SOUTH);
        getContentPane().add(panel, BorderLayout.PAGE_END);

        acMilan.addActionListener(e -> {
            mil++;
            upd("AC Milan");
        });

        realMadrid.addActionListener(e -> {
            mad++;
            upd("Real Madrid");
        });

        pack();
        setVisible(true);
    }

    private void upd(String last) {
        label1.setText("Result: " + mil + " X " + mad);
        label2.setText("Last Scorer: " + last);

        if (mil > mad) {
            label3.setText("Winner: AC Milan");
        } else if (mad > mil) {
            label3.setText("Winner: Real Madrid");
        } else {
            label3.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new Match();
    }
}

