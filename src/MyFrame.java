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
                    startNewGame();


                    JLabel playerScoreLabel = Fabrics.scoreLabelFabric(Game.Tables.PLAYER_TABLE);
                    JLabel casinoScoreLabel = Fabrics.scoreLabelFabric(Game.Tables.CASINO_TABLE);

            this.setLayout(null);
            this.add(playerCardsPane);
            this.add(casinoCardsPane);
            this.add(playerScoreLabel);
            this.add(casinoScoreLabel);
            this.getContentPane().setBackground(Game.MyColor.GAMING_PANEL_COLOR);
            this.add(moreButton);
            this.add(myToolPanel);
            this.add(BlackJackLabel);

        moreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        //blocks the button, when 9 card are already on the table
                        if(Game.getCounterOfPlayerCards() <9) {
                            if (Game.getCounterOfPlayerCards() == 8)
                                moreButton.setEnabled(false);
                            playerCardsPane.add(Fabrics.myCardLabelFabric(Game.getAndIncreaseCounterOfPlayerCards(), Game.Tables.PLAYER_TABLE));
                        }
                        //
                                //sets score of player label
                                playerScoreLabel.setText(Integer.toString(AdditionalTools.Score.getScore(Game.Tables.PLAYER_TABLE)));
    //variants of the ending of the game
                if(AdditionalTools.Score.getScore(Game.Tables.PLAYER_TABLE) > 21) {
                    //lose
                        int choise = JOptionPane.showConfirmDialog(null,"You Lose((((.\nDont you want to continue?","",JOptionPane.YES_NO_OPTION);
                        if(choise == 1) {
                            //exit the program
                            System.exit(0);
                        }

                            playerCardsPane.removeAll();
                            casinoCardsPane.removeAll();
                                    repaint();
                                    Game.newGame();
                                    startNewGame();
                        playerScoreLabel.setText(Integer.toString(AdditionalTools.Score.getScore(Game.Tables.PLAYER_TABLE)));
                        casinoScoreLabel.setText(Integer.toString(AdditionalTools.Score.getScore(Game.Tables.PLAYER_TABLE)));

                }

                if(AdditionalTools.Score.getScore(Game.Tables.PLAYER_TABLE) == 21) {
                    //win

                }

            }
        });


        this.setVisible(true);

    }
    public void startNewGame(){
        //sets to null all scores
        AdditionalTools.Score.newGame();
            //deal cards in the begging
            playerCardsPane.add(Fabrics.myCardLabelFabric(Game.getAndIncreaseCounterOfPlayerCards(),Game.Tables.PLAYER_TABLE));
            casinoCardsPane.add(Fabrics.myCardLabelFabric(Game.getAndIncreaseCounterOfCasinoCards(),Game.Tables.CASINO_TABLE));
    }

}
