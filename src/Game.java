import javax.swing.*;
import java.awt.*;

public class Game {
    private static int counterOfPlayerCards = 0;
    private static int counterOfCasinoCards = 0;


    public enum Tables {CASINO_TABLE, PLAYER_TABLE}

    ;
    public final static int WIDTH_OF_GAMING_FIELD = 1000;
    public final static int LENGTH_OF_GAMING_FIELD = 800;
    public final static int HEIGHT_OF_TOOLBAR = 50;
    public static final int WIDTH_OF_BLACKJACK_LABEL = 300;
    public static final int HEIGHT_OF_BLACKJACK_LABEL = 40;

    public class MyColor {
        public final static Color TOOLBAR_COLOR = new Color(255, 100, 100);
        public final static Color GAMING_PANEL_COLOR = new Color(80, 150, 80);

        public final static Color GOLD_COLOR = new Color(230, 210, 73);
    }

        public static int getAndIncreaseCounterOfCasinoCards() {
            return counterOfCasinoCards++;
        }
        public static int getAndIncreaseCounterOfPlayerCards(){
            return counterOfPlayerCards++;
        }
        public static int getCounterOfCasinoCards() {
            return counterOfCasinoCards;
        }
        public static int getCounterOfPlayerCards(){
            return counterOfPlayerCards;
        }


}