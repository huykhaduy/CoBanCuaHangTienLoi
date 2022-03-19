package GUI.Component;

import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;

public class Card extends DRoundPanel {
    private JLabel lbImg;
    private JLabel label;
    private JLabel lbprice;
    private JCheckBox checkBox;
    private String imageSrc;

    // public Card() {
    //     super();
    //     initialize();
    //     label = new JLabel();
    //     checkBox = new JCheckBox();
    //     lbImg = new JLabel();
    //     lbprice = new JLabel();
    // }
    
    public Card(String text, String price, String imagePath) {
        super();
        initialize();
        label = new JLabel(text);
        label.setToolTipText(text);
        lbprice = new JLabel(price);
        lbImg = new JLabel();
        imageSrc = imagePath;
        ImageIcon imageIcon = new ImageIcon(
                new ImageIcon(imagePath).getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        lbImg.setIcon(imageIcon);
        checkBox = new JCheckBox();
        checkBox.setBackground(Color.WHITE);

        JPanel containerImg = new JPanel();
        containerImg.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
        containerImg.setBackground(Color.WHITE);
        containerImg.add(lbImg);

        JPanel containerLabel = new JPanel();
        containerLabel.setLayout(new GridLayout(2, 1));
        containerLabel.setBackground(Color.WHITE);
        containerLabel.add(label);
        containerLabel.add(lbprice);

        add(containerImg, BorderLayout.WEST);
        add(containerLabel, BorderLayout.CENTER);
        add(checkBox, BorderLayout.EAST);
    }
    
    public void initialize() {
        setLayout(new BorderLayout(10, 10));
        this.setPadding(180, 50);
        this.setColorBg(Color.WHITE);
        this.setRadius(30);
    }


    public JLabel getLbImg() {
        return this.lbImg;
    }

    public JLabel getLabel() {
        return this.label;
    }

    public JLabel getLbprice() {
        return this.lbprice;
    }

    public JCheckBox getCheckBox() {
        return this.checkBox;
    }

    public String getImageSource() {
        return this.imageSrc;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        super.paint(g);
    }

    @Override
    public String toString() {
        return "{" +
            " lbImg='" + getLbImg() + "'" +
            ", label='" + getLabel() + "'" +
            ", lbprice='" + getLbprice() + "'" +
            ", checkBox='" + getCheckBox() + "'" +
            ", imageSrc='" + getImageSource() + "'" +
            "}";
    }



    // @Override
    // protected void paintChildren(Graphics g) {
    //     // TODO Auto-generated method stub
    //     Graphics2D g2d = (Graphics2D) g;
    //     g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
    //     super.paintChildren(g);
    // }
}
