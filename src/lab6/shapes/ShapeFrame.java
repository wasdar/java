package lab6.shapes;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class ShapeFrame extends JFrame {
    List<Shape> shapes = new ArrayList<>();
    Random random = new Random();
    DrawingPanel panel;

   class DrawingPanel extends JPanel{
       @Override
       protected void paintComponent(Graphics g){
           super.paintComponent(g);
           Graphics2D g2d = (Graphics2D) g;
           for (Shape shape : shapes){
               shape.draw(g2d);
           }
       }
   }

    ShapeFrame () {
        setTitle("Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics2D g) {
                super.paintComponents(g);
                if (!shapes.isEmpty()) {
                    Graphics2D g2d = (Graphics2D) g;
                    for (Shape shape : shapes) {
                        shape.draw(g2d);
                    }
                }
            }
        };
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(500, 600));
        add(panel, BorderLayout.CENTER);
        JButton button = new JButton("Start");
        button.setSize(200, 100);
        button.setLocation(0, 0);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                generateRandomShapes(20);
                panel.repaint();
            }
        });

        add(button, BorderLayout.NORTH);
        setVisible(true);
    }
    void generateRandomShapes(int count){
        shapes.clear();
        for(int i = 0; i < count; i ++){
            int choice = random.nextInt(3);
            Color color = new Color(random.nextInt(0x1000000));
            int x = random.nextInt(500);
            int y = random.nextInt(500);

            switch (choice){
                case 0 -> shapes.add(new Circle(color,x,y, random.nextInt(100)+20));
                case 1 -> shapes.add(new Rectangle(color, x, y, random.nextInt(150)+20, random.nextInt(150)+20));
                case 2 -> shapes.add(new Lines(color, x, y, random.nextInt(600), random.nextInt(600)));
            }

        }



    }

    public static void main(String[] args) {
        new ShapeFrame();
    }

}

