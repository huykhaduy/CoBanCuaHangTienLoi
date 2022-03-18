package GUI.Component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class DButton extends JButton {
    private boolean isOver;
    private Color colorBg;
    private Color borderColor;
    private Color hoverColor;
    private Color clickColor;

    public DButton() {

    }

    protected void initialize() {
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
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isOver = false;
                setBackground(colorBg);
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(clickColor);
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (isOver) {
                    setBackground(hoverColor);
                } else {
                    setBackground(colorBg);
                }
                repaint();
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
    }

    public Color getHoverColor() {
        return this.hoverColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }

    public Color getClickColor() {
        return this.clickColor;
    }

    public void setClickColor(Color clickColor) {
        this.clickColor = clickColor;
    }

    
}