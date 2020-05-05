package gui;

import gui.tool.CircleButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RightPanel extends JPanel {

    private String[] data;

    public RightPanel() {
        this.setLayout(null);
        Dimension size = getPreferredSize();
        size.width = 500;
        this.setPreferredSize(size);
    }

    public void addData(String[] data) {
        this.data = data;
    }

    public void init() {
        // this.add(new MapGeo(500, 400));
        CircleButton button;

        int width = 500, height = 400;
        int[] xs = { width/4, 5*width/8, 9*width/16, 3*width/8, 5*width/8 };
        int[] ys = { 3*height/8, 5*height/16, 9*height/16, 11*height/16, 11*height/16 };
        for (int i = 0; i < xs.length; i++) {
            button = new CircleButton("");
            button.setToolTipText(data[i]);
            this.add(button);
            button.setBounds(xs[i], ys[i], 20, 20);
            // button.setBounds(x_pos, y_pos, 30, 25);
            // button.setBorder(new RoundedBorder(10)); //10 is the radius
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        // String fileName = "/media/fred/78E842BDE8427A00/Academic/CS/WorkSpace/Java/Intellij/Project/hackathon/chinaMap.png";
        String userDirectory = System.getProperty("user.dir");
        ImageIcon newIcon = new ImageIcon(userDirectory + "/chinaMap.png");
        super.paintComponent(g);
        g.drawImage(newIcon.getImage(), 0, 0, null);
    }
}
