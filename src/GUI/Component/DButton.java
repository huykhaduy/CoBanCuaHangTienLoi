package GUI.Component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class DButton extends JButton {
    private boolean isOver;
    private boolean isHideBorder;
    private Color colorBg;
    private Color borderColor;
    private Color hoverColor;
    private Color clickColor;
    private int radius = 35;

    public DButton() {
        initialize();
        addListenerMouseDisplay();
    }

    protected void initialize() {
        setColorBg(Color.WHITE);
        setContentAreaFilled(false);
        setFocusable(false);
        setBorderPainted(false);
    }
    
    protected void addListenerMouseDisplay() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isOver = true;
                setBackground(hoverColor);
                revalidate();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isOver = false;
                setBackground(colorBg);
                revalidate();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(clickColor);
                revalidate();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (isOver) {
                    setBackground(hoverColor);
                } else {
                    setBackground(colorBg);
                }
                revalidate();
            }
        });
    }
    

    public boolean isIsOver() {
        return this.isOver;
    }

    public boolean getIsOver() {
        return this.isOver;
    }

    public void setIsOver(boolean isOver) {
        this.isOver = isOver;
        revalidate();
    }

    public Color getColorBg() {
        return this.colorBg;
    }

    public void setColorBg(Color colorBg) {
        this.colorBg = colorBg;
        setBackground(colorBg);
    }

    public Color getBorderColor() {
        return this.borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        revalidate();
    }

    public Color getHoverColor() {
        return this.hoverColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
        revalidate();
    }

    public Color getClickColor() {
        return this.clickColor;
    }

    public void setClickColor(Color clickColor) {
        this.clickColor = clickColor;
        revalidate();
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        revalidate();
    }

    public boolean isIsHideBorder() {
        return this.isHideBorder;
    }

    public void setIsHideBorder(boolean isHideBorder) {
        this.isHideBorder = isHideBorder;
        revalidate();
    }

    public void setButtonSize(int width, int height) {
        setPreferredSize(new Dimension(width, height));
    }

    public void setPadding(int paddingY, int paddingX) {
        setPreferredSize(new Dimension(paddingY + this.getHeight(), paddingX + this.getWidth()));
        int a = paddingX + this.getWidth();
        int b = paddingY + this.getHeight();
        System.out.println("paddingX: " + a + " paddingY: " + b);
    }

    @Override 
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Paint Border
        if (isHideBorder == false) {
            g2d.setColor(borderColor);
            g2d.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        }
        g2d.setColor(getBackground());
        // Border set 2 Pix
        g2d.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(g);
    }
}