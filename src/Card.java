import java.util.HashMap;
import java.util.Map;

public class Card {
    private final int number;
    private final String symbol;
    Card(int number,String symbol){
        this.number = number;
        this.symbol = symbol;
    }
    private static Map<Integer,String> cardMap;

    static {
        //initializing the card map? where first argument is number in the game, the second - symbol on the card
        cardMap = new HashMap<>(Map.of(2, "2", 3, "3", 4, "4", 5, "5", 6, "6", 7, "7", 8, "8", 9, "9",10, "10",11,"J"));
        cardMap.put(12,"Q");
        cardMap.put(13,"K");
        cardMap.put(14,"A");
    }
    public static Card getCard(){
        int randnumber = (int)(Math.random()*13+2);
        //converts number in map to number of points in the game;
        int pasteNumber = randnumber <11?randnumber:randnumber == 14? 11:10;

        return new Card(pasteNumber,cardMap.get(randnumber));
    }

    public int getNumber() {
        return number;
    }
    public String getSymbol(){
        return symbol;
    }
}
