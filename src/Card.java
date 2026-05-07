public class Card {

    public int value;
    public String suit;
    public boolean isFaceUp;


    public Card(int pvalue, String psuit, boolean pisFaceUp) {
        value = pvalue;
        suit = psuit;
        isFaceUp = pisFaceUp;
    }

    public void printCard() {
        if (value == 0) {
            System.out.println("Ace of " + suit);
        } else if (value == 10) {
            System.out.println("Jack of " + suit);
        } else if (value == 11) {
            System.out.println("Queen of " + suit);
        } else if (value == 12) {
            System.out.println("King of " + suit);
        }else{
            System.out.println((value+1) + " of "+ suit);
        }

    }
}