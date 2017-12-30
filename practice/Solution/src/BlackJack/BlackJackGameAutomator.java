package BlackJack;

public class BlackJackGameAutomator {
	 private Deck deck;
	 private BlackJackHand[] hands;
	 private static final int HIT_UNTIL = 16;
	 public BlackJackGameAutomator(int numPlayers){
		 hands = new BlackJackHand[numPlayers];
		 for(int i = 0 ; i < numPlayers ; i++){
			 hands[i] = new BlackJackHand();
		 }
	 }
	 void initializeDeck(){
		 deck = new Deck();
		 deck.shuffle();
	 }
	 boolean dealInitial(){
		 for(BlackJackHand hand : hands){
			 Card[] cards = deck.dealHand(2);
			 if(cards == null){
				 return false;
			 }
			 hand.addCards(cards);
		 }
		 return true;
	 }
	 boolean playHand(BlackJackHand hand){
		 while(hand.score() < 16){
			 Card card = deck.dealCard();
			 if(card == null){
				 return false;
			 }
			 hand.addCards(new Card[]{card});
		 }
		 return true;
	 }
}
