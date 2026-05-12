import java.util.Scanner;

public class Main {

    int numCards = 0;
    Player playerOne = new Player("player 1");
    Player dealer = new Player("Dealer");

    public Card [] deck;

    public static void main(String[] args) {
        Main blackjack = new Main();
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
        shuffle();
        printDeck();

        playerOne.addCard(deck[numCards]);
        numCards ++;
        playerOne.addCard(deck[numCards]);
        numCards ++;
        dealer.addCard(deck[numCards]);
        numCards ++;
        playerOne.printPlayer();
        dealer.printDealer();


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

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


