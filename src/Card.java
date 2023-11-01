import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

;
public class Card {
    private final Suit cardSuit;
    private final int number;
    private final String symbol;
    Card(int number,String symbol,Suit cardSuit){
        this.number = number;
        this.symbol = symbol;
        this.cardSuit = cardSuit;
    }
    private static Map<Integer,String> cardMap;
    //map of cards, that are already on the table
    private static ArrayList<Card> usedCards = new ArrayList<>();

    static {
        //initializing the card map? where first argument is number in the game, the second - symbol on the card
        cardMap = new HashMap<>(Map.of(2, "2", 3, "3", 4, "4", 5, "5", 6, "6", 7, "7", 8, "8", 9, "9",10, "10",11,"J"));
        cardMap.put(12,"Q");
        cardMap.put(13,"K");
        cardMap.put(14,"A");
    }
    public static Card getCard(){
        int randnumber = 0;
        Suit suit = null;
        boolean allowFlag = true;
        //if we already have this card, we will remake it
        while(allowFlag){
            allowFlag = false;
            randnumber = (int)(Math.random()*13+2);
            suit = Suit.values()[(int)(Math.random()*4)];
                for (Card card : usedCards) {
                    if (card.getCardSuit() == suit && card.getNumber() == randnumber)
                        allowFlag = true;
                }

        }
        //putting this card into a container of used cards
        Card currentCard = new Card(randnumber,cardMap.get(randnumber),suit);
        usedCards.add(currentCard);
        //int pasteNumber = randnumber < 11?randnumber:randnumber == 14? 11:10;

        return currentCard;
    }

    public int getNumber() {
        return number;
    }
    public String getSymbol(){
        return symbol;
    }
    public Suit getCardSuit(){
        return cardSuit;
    }
}
