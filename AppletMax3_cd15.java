import java.awt.*;
import javax.swing.*;

public class AppletMax3_cd15 extends JFrame {
    int a, b, c, d;

    public AppletMax3_cd15(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a >= b && a >= c)
            d = a;
        else if (b >= a && b >= c)
            d = b;
        else
            d = c;

        setTitle("Max of Three Numbers");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        Font myFont = new Font("Courier", Font.BOLD, 20);
        g.setFont(myFont);
        g.drawString("First Num is " + a, 100, 100);
        g.drawString("Second Num is " + b, 100, 200);
        g.drawString("Third Num is " + c, 100, 300);
        g.drawString("Max of Three Numbers is " + d, 100, 400);
    }

    public static void main(String[] args) {
        // Example inputs
        int a = 42, b = 65, c = 13;
        new AppletMax3_cd15(a, b, c);
    }
}