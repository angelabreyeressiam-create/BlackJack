public class Main {

    public Card [] deck;

    public static void main(String[] args) {
        Main blackjack = new Main();
        Player playerOne = new Player("player 1");
        Player dealer = new Player("Dealer");
        playerOne.addCard(card.deck);

    }

    public Main(){
        deck = new Card[52];
        for(int i =0; i< deck.length; i ++){
            if (i < 13) {
                deck[i] = new Card(i%13, "Spades", false);
            } else if (i < 26){
                deck[i] = new Card(i%13, "Diamonds", false);
            } else if (i<39){
                deck[i] = new Card(i%13, "Hearts", false);
            } else if (i< 52){
                deck[i] = new Card(i%13, "Clubs", false);
            }

        }
        printDeck();
        shuffle();
    }

    public void printDeck(){
        for(int i = 0; i < deck.length; i++){
            deck[i].printCard();
        }
    }

    public void shuffle(){
        for(int i = 0; i < deck.length; i ++){
            int randNum = (int)(Math.random()* 52);
            Card chosenCard = deck[randNum];
            deck[randNum]= deck[i];
            deck[i] = chosenCard;

        }
    }
}


