package Game;

public class Card {
    CardType value;
    Suit suit;

    public Card(CardType value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public static boolean checkMove(Card topCard, Card newCard){
        //if wild card then move is always valid
        //if the new cards suit or value matches the top cards then move is valid
        //else move is false
        if(newCard.value == CardType.Wild || newCard.value == CardType.WildDraw)
            return true;
        else if(newCard.value == topCard.value || newCard.suit == topCard.suit)
            return true;
        else
            return false;
    }

    public Suit getSuit(){
        return suit;
    }

    public CardType getCardVal(){
        return value;
    }

    public void setSuit(Suit s){
        suit = s;
    }

    @Override
    public String toString(){
        return suit.toString() + " " + value.toString();
    }
}
