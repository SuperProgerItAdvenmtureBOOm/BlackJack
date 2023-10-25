import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fabrics {
    public static JLabel myCardLabelFabric(int number){
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
        label1.setBounds(number*50,0,100,150);
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
