package GUI.Component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.RenderingHints;

public class DRoundPanel extends JPanel{
    private int radius = 50;
    private Color colorBg = new Color(99, 110, 114);

    public DRoundPanel() {
        setBackground(colorBg);
        setFocusable(false);
    }

    public DRoundPanel(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        revalidate();
    }

    public Color getColorBg() {
        return this.colorBg;
    }

    public void setColorBg(Color colorBg) {
        this.colorBg = colorBg;
        setBackground(colorBg);
        revalidate();
    }

    public void setPadding(int paddingY, int paddingX) {
        setPreferredSize(new Dimension(paddingY + getHeight(), paddingX + getWidth()));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        // Graphics2D g2d = (Graphics2D) grphcs;
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // Paint Border
        // g2d.setColor(getBackground());
        // // Border set 2 Pix
        // g2d.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //  Paint Border
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        // super.paintComponent(grphcs);
    }
}
