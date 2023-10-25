import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//\u2660 \u2666 \u2665 \u2663  ♠ ♦ ♥ ♣
public class MyFrame extends JFrame {

    private JButton moreButton;

    private JLayeredPane casinoCardsPane;
    private JLayeredPane playerCardsPane;
    MyFrame() {
        System.out.println("\u2666");
        JPanel myToolPanel = new JPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(Game.WIDTH_OF_GAMING_FIELD, Game.LENGTH_OF_GAMING_FIELD);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

            moreButton = new JButton("one more");
            moreButton.setFocusable(false);
            moreButton.setForeground(Game.MyColor.GOLD_COLOR);
            moreButton.setBackground(Game.MyColor.GAMING_PANEL_COLOR);
            moreButton.setFont(new Font("Serif",Font.BOLD,20));
            moreButton.setLocation(Game.WIDTH_OF_GAMING_FIELD-140,Game.LENGTH_OF_GAMING_FIELD/2);
            moreButton.setSize(120,50);
            moreButton.setBorder(BorderFactory.createLineBorder(Game.MyColor.GOLD_COLOR,2));


                JLabel BlackJackLabel = new JLabel("Black Jack");
                BlackJackLabel.setForeground(Game.MyColor.GOLD_COLOR);
                BlackJackLabel.setFont(new Font("Serif",Font.BOLD,50));
                BlackJackLabel.setSize(Game.WIDTH_OF_BLACKJACK_LABEL,Game.HEIGHT_OF_BLACKJACK_LABEL);
                BlackJackLabel.setLocation(this.getWidth()/2-Game.WIDTH_OF_BLACKJACK_LABEL/2,this.getHeight()/2);


                    myToolPanel.setBackground(Game.MyColor.GOLD_COLOR);
                    myToolPanel.setSize(this.getWidth(),Game.HEIGHT_OF_TOOLBAR);

                casinoCardsPane = Fabrics.MyLayeredPane.createLayeredPane(Game.Tables.CASINO_TABLE);
                playerCardsPane = Fabrics.MyLayeredPane.createLayeredPane( Game.Tables.PLAYER_TABLE);
                //deal cards in the begging
                    playerCardsPane.add(Fabrics.myCardLabelFabric(Game.getAndIncreaseCounterOfPlayerCards()));
                    casinoCardsPane.add(Fabrics.myCardLabelFabric(Game.getAndIncreaseCounterOfCasinoCards()));

            this.setLayout(null);
            this.add(playerCardsPane);
            this.add(casinoCardsPane);
            this.getContentPane().setBackground(Game.MyColor.GAMING_PANEL_COLOR);
            this.add(moreButton);
            this.add(myToolPanel);
            this.add(BlackJackLabel);

        moreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Game.getCounterOfPlayerCards()==9)
                    moreButton.setEnabled(false);
                else
                    playerCardsPane.add(Fabrics.myCardLabelFabric(Game.getAndIncreaseCounterOfPlayerCards()));
            }
        });

        this.setVisible(true);

    }

}
