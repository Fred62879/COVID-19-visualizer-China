package gui.tool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MapGeo extends JComponent implements ActionListener {

    private int width;
    private int height;
    // private Map<Date, Map> data;

    public MapGeo(int w, int h) {
        width = w; height = h;
    }

    //public MapGeo(Map<Date, Map> data) {
    // this.data = data;
    // }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        JButton res;
        int[] xs = { width/4, width/2, 3*width/4, width/4, 3*width/4 };
        int[] ys = { height/4, height/2, height/4, 3*height/4, 3*height/4 };
        for (int i = 0; i < 5; i++) {
            draw3DCircle(g2, xs[i], ys[i], 25);
            res = new JButton("AAA");
            this.add(res);
            res.setBounds(xs[i], ys[i], 20, 20);
        }
    }

    private void draw3DCircle(Graphics g, int x, int y, int radius) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, radius, radius);
    }
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }

    public static void main(String[] args) {
        int width = 600, height = 300;
        JFrame f = new JFrame("Dial v1.0");
        f.addWindowListener( new WindowAdapter( ) {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        f.setSize(width, height);

        MapGeo map = new MapGeo(width, height);
        JPanel dialPanel = new JPanel();
        dialPanel.add(map);
        f.getContentPane().add(dialPanel, BorderLayout.CENTER);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
