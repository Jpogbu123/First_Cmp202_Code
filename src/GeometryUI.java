import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI {
    JFrame frame = new JFrame("Geometry");
    JFrame areaOfSquareframe = new JFrame("Area of Square");
    JTextField enterLengthOfSquare = new JTextField("Enter length");
    JButton calculateAreaOfSquare = new JButton("calculate");

    JButton AreaOfSquare = new JButton("Area Of Square");
    public GeometryUI() {
        frame = new JFrame("Geometry");
        frame.getContentPane().setBackground(Color.WHITE);

        areaOfSquareframe = new JFrame("Area of Square");
        areaOfSquareframe.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Change button colors
        AreaOfSquare.setBackground(Color.GRAY);
        AreaOfTriangle.setBackground(Color.GRAY);
        AreaOfRectangle.setBackground(Color.GRAY);
        calculateAreaOfSquare.setBackground(Color.DARK_GRAY);

        // Change text field color
        enterLengthOfSquare.setBackground(Color.GRAY);
        enterLengthOfSquare.setForeground(Color.WHITE);
    }


    public void drawAreaOfSquareUI(){
        areaOfSquareframe.add(enterLengthOfSquare);
        areaOfSquareframe.add(calculateAreaOfSquare);
        areaOfSquareframe.setLayout(new GridLayout(2,1));
        areaOfSquareframe.setSize(150,200);
        areaOfSquareframe.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Geometry mycmp = new Geometry();

        calculateAreaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float area = mycmp.areaOfSquare(Float.parseFloat(enterLengthOfSquare.getText()));
                System.out.println("Calculate area of square");
                JOptionPane.showMessageDialog(null, area);
            }
        });
    }
    JButton AreaOfTriangle = new JButton("Area Of Triangle");
    JButton AreaOfRectangle = new JButton("Area Of Rectangle");


    public void mainUI() {
        frame.add(AreaOfSquare);
        frame.add(AreaOfTriangle);
        frame.add(AreaOfRectangle);
        frame.setSize(150,200);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
        AreaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawAreaOfSquareUI();

                System.out.println("Calculate area of Rectangle");
                JOptionPane.showMessageDialog(null, "calculate area of Rectangle");

            }
        });
    }
    
}