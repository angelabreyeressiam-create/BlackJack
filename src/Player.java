public class Player {

    public int cardValue;
    public boolean isDealer;
    public String name;
    public Card [] hand;
    public int numCards;
    public int sum = 0;


    public Player(String pname){
        name = pname;
        hand = new Card[11];
        numCards = 0;


    }

    public void printPlayer(){
        for (int i = 0; i < numCards; i++) {
            hand[i].printCard();
        }
        System.out.println("Player One has"+  + numCards + "cards");
    }
    public void printDealer(){
        for (int i = 0; i < numCards; i++) {
            hand[i].printCard();
        }
        System.out.println("Dealer has"+  + numCards + "cards");
    }

    public void addCard(Card newCard){
        hand[numCards] = newCard;
        numCards++;
    }

//    public int sumCards(){
//        int sum = 0;
//        for (int i = 0; i < numCards; i++) {
//
//        }
//    }


}
