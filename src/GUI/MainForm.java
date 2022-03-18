package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

import GUI.Component.DButton;
import GUI.Component.DRoundPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class MainForm extends JFrame{
    public MainForm() {
        //set properties for swing frame
        setTitle("Quản lý cửa hàng tiện lợi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        getContentPane().setBackground(Color.WHITE);
        // setUndecorated(true);
        init();
    }

    public void init() {
        DButton bt = new DButton();
        bt.setText("Hello world");
        bt.setBounds(0, 0, 20, 80);
        bt.setBorderColor(new Color(129, 236, 236));
        bt.setColorBg(new Color(255, 118, 117));
        bt.setPadding(30, 30);
        // bt.setIsHideBorder(false);
        
        DRoundPanel pn = new DRoundPanel();
        pn.setPadding(200, 200);
        pn.setColorBg(new Color(255, 118, 117));
        this.add(bt);
        this.add(pn);
    }

}
