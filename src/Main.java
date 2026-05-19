import java.util.Scanner;

public class Main {

    int numCards = 0;
    Player playerOne = new Player("player 1");
    Player dealer = new Player("Dealer");

    public Card [] deck;

    public static void main(String[] args) {
        Main blackjack = new Main();
    }

    public Main() {
        deck = new Card[52];
        for (int i = 0; i < deck.length; i++) {
            if (i < 13) {
                deck[i] = new Card(i % 13, "Spades", false);
            } else if (i < 26) {
                deck[i] = new Card(i % 13, "Diamonds", false);
            } else if (i < 39) {
                deck[i] = new Card(i % 13, "Hearts", false);
            } else if (i < 52) {
                deck[i] = new Card(i % 13, "Clubs", false);
            }

        }
        shuffle();
        printDeck();

        playerOne.addCard(deck[numCards]);
        numCards++;
        playerOne.addCard(deck[numCards]);
        numCards++;
        dealer.addCard(deck[numCards]);
        numCards++;
        playerOne.handTotal();
        dealer.handTotal();
        playerOne.printPlayer();
        dealer.printDealer();
        System.out.println("Press h to hit and s to stand");
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("h")) {
                playerOne.addCard(deck[numCards]);
                numCards++;
                playerOne.handTotal();
                playerOne.printPlayer();
                if (playerOne.handTotal > 21) {
                    playerOne.printPlayer();
                    dealer.printDealer();
                    System.out.println("Player One loses!");
                }
                else if(playerOne.handTotal == 21){
                    playerOne.printPlayer();
                    dealer.printDealer();
                    System.out.println("Player One wins!");
                }

            }
            if (input.equals("s")) {
                    System.out.println("Player One chooses to stand!");
                    playerOne.handTotal();
                    playerOne.printPlayer();
                    if (playerOne.handTotal > 21) {
                        System.out.println("Player One loses!");
                    }
                    if (dealer.handTotal < 16){
                        dealer.addCard(deck[numCards]);
                        numCards++;
                        dealer.handTotal();
                        dealer.printDealer();
                     if (dealer.handTotal > 21) {
                         System.out.println("Dealer loses! Player One wins!");
                     }
                     else if (dealer.handTotal > playerOne.handTotal){
                         System.out.println("Dealer Wins! Boohoo!");
                     }
                     else if (dealer.handTotal == playerOne.handTotal){
                         System.out.println("Wow its a tie!");
                     }


                    }
                    break;

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


