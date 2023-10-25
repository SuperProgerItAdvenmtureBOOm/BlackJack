import javax.swing.*;
import java.awt.*;

public class Game {
    public enum Tables {CASINO_TABLE, PLAYER_TABLE};
    public final static int WIDTH_OF_GAMING_FIELD = 1000;
    public final static int LENGTH_OF_GAMING_FIELD = 800;
    public final static int HEIGHT_OF_TOOLBAR = 50;
    public static final int WIDTH_OF_BLACKJACK_LABEL = 300;
    public static final int HEIGHT_OF_BLACKJACK_LABEL = 40;

    //private static int numberOfPlayerCards = 0;

    public class MyColor{
        public final static Color TOOLBAR_COLOR = new Color(255,100,100);
        public final static Color GAMING_PANEL_COLOR = new Color(80,150,80);
        //100,185,100

        public final static Color GOLD_COLOR = new Color(230,210,73);
    }

    //public static int getNumberOfPlayerCards() {
    //    return numberOfPlayerCards;
    //}

    //public static void increaseNumberOfPlayerCards() {
    //    Game.numberOfPlayerCards++;
    //}
}
