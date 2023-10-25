import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fabrics {
    public static JLabel myCardLabelFabric(int number){
        Card myCard = Card.getCard();
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.white);
        //set suit
        label1.setText(myCard.getSymbol()+"\u2660");
        label1.setBounds(number*50,0,100,150);
        label1.setFont(new Font("Dialog",Font.BOLD,25));
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setBorder(BorderFactory.createLineBorder(Game.MyColor.GOLD_COLOR,2));
        return label1;
    }
    public class MyLayeredPane{


        //creates panels for cards
        public static JLayeredPane createLayeredPane(Game.Tables tableType){
            JLayeredPane myLayeredPane = new JLayeredPane();

            //if its casino table it will appear on top else on bottom
            int factor = 0;
            switch(tableType){
                case CASINO_TABLE:
                    factor = 1;
                    break;
                case PLAYER_TABLE:
                    factor = 4;
            }

            myLayeredPane.setBounds(Game.WIDTH_OF_GAMING_FIELD/2-Game.WIDTH_OF_BLACKJACK_LABEL/2,Game.LENGTH_OF_GAMING_FIELD/6*factor,500,200);

            return myLayeredPane;

        }
    }
}
