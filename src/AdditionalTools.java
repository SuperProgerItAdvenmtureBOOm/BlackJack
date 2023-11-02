public class AdditionalTools {
    public class Score{
        private static int playerScore = 0;
        private static int casinoScore = 0;
        public static void newGame(){
            playerScore = 0;
            casinoScore = 0;
        }
        public static int getScore(Game.Tables table){
            if(table == Game.Tables.CASINO_TABLE)
                return casinoScore;
            else return playerScore;
        }
        public static void increaseScore(Card card, Game.Tables tables){
            int cardNumber = card.getNumber();
            int scoreNumber = cardNumber < 11?cardNumber:cardNumber == 14? 11:10;
            if(tables == Game.Tables.CASINO_TABLE)
                casinoScore += scoreNumber;
            else
                playerScore += scoreNumber;
        }
    }
}
