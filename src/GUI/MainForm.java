package GUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import GUI.Component.Card;
import GUI.Component.DButton;
import GUI.Component.DRoundPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Component;

public class MainForm extends JFrame {
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

        //Panel food
        DRoundPanel contentPn1 = new DRoundPanel();
        contentPn1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
        contentPn1.setPadding(220, 440);
        contentPn1.setColorBg(new Color(255, 118, 117));
        contentPn1.setRadius(30);
        JLabel contentFood = new JLabel("Thức ăn");
        contentPn1.add(contentFood);

        Card food1 = new Card("Sushi cá ngon lắm", "27000", ".\\picture\\sushica.png");
        contentPn1.add(food1);

        Card food2 = new Card("Hotpot giá cao", "30000", ".\\picture\\hotpot.png");
        contentPn1.add(food2);

        Card food3 = new Card("Salad cải xoăn", "25000", ".\\picture\\salad.png");
        contentPn1.add(food3);

        Card food4 = new Card("Sandwich gà", "40000", ".\\picture\\sanwid.png");
        contentPn1.add(food4);

        Card food5 = new Card("Bún đậu mắm tôm", "50000", ".\\picture\\bundau.png");
        contentPn1.add(food5);

        Card food6 = new Card("Bánh bao sữa bắp", "8000", ".\\picture\\banhbao.png");
        contentPn1.add(food6);

        //Panel Drink
        DRoundPanel contentPn2 = new DRoundPanel();
        JLabel contentDrink = new JLabel("Đồ uống");
        contentPn2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
        contentPn2.setPadding(220, 440);
        contentPn2.setColorBg(new Color(255, 118, 117));
        contentPn2.setRadius(30);
        contentPn2.add(contentDrink);

        Card drink1 = new Card("Nước suối Aquafina", "8000", ".\\picture\\aqua.png");
        contentPn2.add(drink1);

        Card drink2 = new Card("Coca Cola", "10000", ".\\picture\\coca.png");
        contentPn2.add(drink2);

        Card drink3 = new Card("Pepsi", "10000", ".\\picture\\pepsi.png");
        contentPn2.add(drink3);

        Card drink4 = new Card("Mirinda", "12000", ".\\picture\\mirinda.png");
        contentPn2.add(drink4);

        Card drink5 = new Card("Sting", "12000", ".\\picture\\sting.png");
        contentPn2.add(drink5);

        //Panel 3 Payment
        DRoundPanel contentPn3 = new DRoundPanel();
        contentPn3.setLayout(new FlowLayout(FlowLayout.CENTER,10, 15));
        contentPn3.setPadding(250, 440);
        contentPn3.setColorBg(new Color(255, 118, 117));
        contentPn3.setRadius(30);
        JLabel contentPayment = new JLabel("Thanh toán");
        contentPn3.add(contentPayment);

        JLabelMoney money = new JLabelMoney(0);
        contentPn3.add(money);

        addEventChoice(contentPn1, contentPn3, money);
        addEventChoice(contentPn2, contentPn3, money);


        contentPanel.add(contentPn1);
        contentPanel.add(contentPn2);
        contentPanel.add(contentPn3);

        

    }

    public void addEventChoice(JPanel pn, JPanel des, JLabelMoney money) {
        for (Component c : pn.getComponents()) {
            if (c instanceof Card) {
                Card card = (Card) c;
                JCheckBox cb = card.getCheckBox();
                cb.addItemListener(new ChangeStateEvent(card, des, money));
            }
        }
    }
    

    // public void addCode(JPanel contentPn2, JPanel contentPn3) {
    //     for (Component c : contentPn2.getComponents()) {
    //         if (c instanceof Card) {
    //             Card card = (Card) c;
    //             Card newC = new Card(card.getLabel().getText(), card.getLbprice().getText(), card.getImageSource());
    //             contentPn3.add(newC);
    //         }
    //     }
    // }

}

class ChangeStateEvent implements ItemListener {

    private JPanel des;
    private Card card;
    private JLabelMoney money;

    // public ChangeStateEvent(Card card, JPanel des) {
    //     this.des = des;
    //     this.card = card;
    // }

    public ChangeStateEvent(Card card, JPanel des, JLabelMoney money) {
        this.des = des;
        this.card = card;
        this.money = money;
    }

    public JPanel getDes() {
        return this.des;
    }

    public void setDes(JPanel des) {
        this.des = des;
    }

    public Card getCard() {
        return this.card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            // add to list
            String img = card.getImageSource();
            String text = card.getLabel().getText();
            String price = card.getLbprice().getText();
            Card nCard = new Card(text, price, img);
            money.setMoney(money.getMoney() + Integer.parseInt(price));
            des.add(nCard);
            des.revalidate();
        } else {
            // remove from list
            for (Component c : des.getComponents()) {
                if (c instanceof Card) {
                    Card card1 = (Card) c;
                    if (card1.getLabel().getText().equals(card.getLabel().getText())) {
                        des.remove(c);
                        des.revalidate();
                        money.setMoney(money.getMoney() - Integer.parseInt(card.getLbprice().getText()));
                        des.repaint();
                        break;
                    }
                }
            }
        }
        System.out.println("Component count: " + des.getComponentCount());
    }

}


class JLabelMoney extends JLabel{
    private int money;

    public JLabelMoney(int money) {
        this.money = money;
        this.setText("Tổng tiền : " + money);
    }
    
    //get set money
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
        this.setText("Tổng tiền : " + money);
    }
}