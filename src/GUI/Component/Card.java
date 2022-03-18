package GUI.Component;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card extends DRoundPanel {
    private JLabel label;
    private JCheckBox checkBox;

    public Card() {
        super();
    }
    
    public Card(String text, ImageIcon image) {
        super();
        label = new JLabel(text);
        checkBox = new JCheckBox();
        add(label);
        add(checkBox);
    }
}
