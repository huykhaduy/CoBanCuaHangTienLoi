package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.Component.DButton;
import GUI.Component.DRoundPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;

public class MainForm extends JFrame{
    public MainForm() {
        //set properties for swing frame
        setTitle("Quản lý cửa hàng tiện lợi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5, 5));
        getContentPane().setBackground(Color.WHITE);
        // setUndecorated(true);
        init();
    }

    public void init() {
        // DButton bt = new DButton();
        // bt.setText("Hello world");
        // bt.setBounds(0, 0, 20, 80);
        // bt.setBorderColor(new Color(129, 236, 236));
        // bt.setColorBg(new Color(255, 118, 117));
        // bt.setPadding(30, 30);
        // // bt.setIsHideBorder(false);
        
        // DRoundPanel pn = new DRoundPanel();
        // pn.setPadding(200, 200);
        // pn.setColorBg(new Color(255, 118, 117));
        // this.add(bt);
        // this.add(pn);


        //TOP PANEL
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.BLUE);
        topPanel.setPreferredSize(new Dimension(0, 50));
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
        this.add(topPanel, BorderLayout.NORTH);

        JLabel lbMenu = new JLabel("MENU CHỌN MÓN ĂN");
        lbMenu.setHorizontalTextPosition(JLabel.CENTER);
        lbMenu.setVerticalTextPosition(JLabel.CENTER);
        lbMenu.setHorizontalAlignment(JLabel.CENTER);
        lbMenu.setVerticalAlignment(JLabel.CENTER);
        lbMenu.setFont(new Font("Arial", Font.BOLD, 20));
        lbMenu.setForeground(Color.WHITE);
        lbMenu.setBounds(0, 100, 200, 50);
        topPanel.add(lbMenu);


        //CONTENT PANEL
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setPreferredSize(new Dimension(0, 100));
        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        this.add(contentPanel, BorderLayout.CENTER);

        DRoundPanel contentPn1 = new DRoundPanel();
        contentPn1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
        contentPn1.setPadding(220, 440);
        contentPn1.setColorBg(new Color(255, 118, 117));
        contentPn1.setRadius(30);
        JLabel contentFood = new JLabel("Thức ăn");
        contentPn1.add(contentFood);
        DRoundPanel ct1Food = new DRoundPanel();
        ct1Food.setPadding(180, 50);
        ct1Food.setColorBg(Color.WHITE);
        ct1Food.setRadius(30);
        contentPn1.add(ct1Food);

        DRoundPanel ct1Food2 = new DRoundPanel();
        ct1Food2.setPadding(180, 50);
        ct1Food2.setColorBg(Color.WHITE);
        ct1Food2.setRadius(30);
        contentPn1.add(ct1Food2);

        

        DRoundPanel contentPn2 = new DRoundPanel();
        contentPn2.setPadding(220, 440);
        contentPn2.setColorBg(new Color(255, 118, 117));
        contentPn2.setRadius(30);
        JLabel contentDrink = new JLabel("Đồ uống");
        contentPn2.add(contentDrink);

        DRoundPanel contentPn3 = new DRoundPanel();
        contentPn3.setPadding(250, 440);
        contentPn3.setColorBg(new Color(255, 118, 117));
        contentPn3.setRadius(30);
        JLabel contentPayment = new JLabel("Thanh toán");
        contentPn3.add(contentPayment);


        contentPanel.add(contentPn1);
        contentPanel.add(contentPn2);
        contentPanel.add(contentPn3);
    }

}
