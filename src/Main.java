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
        playerOne.sumCards();
        dealer.sumCards();
        playerOne.printPlayer();
        for (int i = 0; i < numCards; i++) {
            playerOne.hand[i].printCard();
        }
        dealer.printDealer();
        for (int i = 0; i <numCards; i++) {
            dealer.hand[i].printCard();
        }
        System.out.println("Press h to hit and s to stand");
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("h")){
                playerOne.addCard(deck[numCards]);
                numCards ++;
                playerOne.sumCards();
                playerOne.printPlayer();
                if(playerOne.sumCards > 21){
                    System.out.println("Player One loses!");
                }

            }


        }

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


