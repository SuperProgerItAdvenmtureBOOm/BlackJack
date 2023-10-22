import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        JPanel myGamingPanel = new JPanel();
        JPanel myToolPanel = new JPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(Game.WIDTH_OF_GAMING_FIELD, Game.LENGTH_OF_GAMING_FIELD);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

            myToolPanel.setBackground(Game.MyColor.GOLD_COLOR);
            myToolPanel.setPreferredSize(new Dimension(this.getWidth(),Game.HEIGHT_OF_TOOLBAR));
            myGamingPanel.setBackground(Game.MyColor.GAMING_PANEL_COLOR);
            myGamingPanel.setLayout(null);

            JLabel BlackJackLabel = new JLabel("Black Jack");
            BlackJackLabel.setForeground(Game.MyColor.GOLD_COLOR);
            BlackJackLabel.setFont(new Font("Serif",Font.BOLD,50));
            BlackJackLabel.setSize(Game.WIDTH_OF_BLACKJACK_LABEL,Game.HEIGHT_OF_BLACKJACK_LABEL);
            BlackJackLabel.setLocation(this.getWidth()/2-Game.WIDTH_OF_BLACKJACK_LABEL/2,150);



                JLabel label1 = new JLabel();
                label1.setOpaque(true);
                label1.setBackground(Color.red);
                label1.setBounds(50,50,50,50);

                JLabel label2 = new JLabel();
                label1.setOpaque(true);
                label1.setBackground(Color.blue);
                label1.setBounds(100,100,50,50);

                JLabel label3 = new JLabel();
                label1.setOpaque(true);
                label1.setBackground(Color.black);
                label1.setBounds(150,150,50,50);

                    JPanel CardPanel = new JPanel();
                    JLayeredPane myLayeredPane = new JLayeredPane();
                        CardPanel.setLayout(null);
                        CardPanel.setBackground(Color.green);


                    myLayeredPane.setBounds(0,0,500,500);
                    myLayeredPane.add(label3);
                    myLayeredPane.add(label2);
                    myLayeredPane.add(label1);
        this.add(CardPanel);
        CardPanel.add(myLayeredPane);

        this.add(BorderLayout.NORTH,myToolPanel);
        //this.getContentPane().add(myGamingPanel);
        //myGamingPanel.add(BlackJackLabel);
        this.setVisible(true);

    }
}
