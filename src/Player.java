public class Player {

    public int cardValue;
    public boolean isDealer;
    public String name;
    public Card [] hand;
    public int numCards;


    public Player(String pname){
        name = pname;
        hand = new Card[11];
        numCards = 0;

    }

    public void printPlayer(){
        for (int i = 0; i < numCards; i++) {
            hand[i].printCard();
        }
        System.out.println("This player");
    }

    public void addCard(Card newCard){
        hand[numCards] = newCard;
        numCards++;
    }

}
