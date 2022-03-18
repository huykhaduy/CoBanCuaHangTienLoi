package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

import GUI.Component.DButton;
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
        init();
    }

    public void init() {
        DButton bt = new DButton();
        bt.setText("Hello world");
        bt.setBounds(0, 0, 500, 500);
        bt.setBorderColor(new Color(129, 236, 236));
        bt.setIsHideBorder(false);
        
        // hoverColor = new Color(179, 250, 160);
        // clickColor = new Color(152, 184, 144);
        // borderColor = new Color(129, 236, 236);
        this.add(bt);
        // btn.setBackgroundColor(Color.BLUE);
        // btn.setBorderColor(Color.BLACK);
    }

}
