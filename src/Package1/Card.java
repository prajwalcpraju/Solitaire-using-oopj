
package Package1;

public class Card {    
	
    
	private final String suit, value, colour;
    private final char suitChar, valueChar;
    private boolean hidden;
    private static final String ANSI_RESET = " RESET",
                                ANSI_BLACK = "BLK ",
                                ANSI_RED = "RED ",
                                hiddenChar = "##";
    
    public Card(String suit, String value, boolean hidden)  //constructor ,instance variables of different datatype
    {
        this.suit = suit;                 
        this.value = value;            // THIS KEYWORD USED HERE
        this.hidden = hidden;
        
        suitChar = genSuitChar();
        valueChar = genValueChar();
        colour = genColour();
    }

    private char genSuitChar() {
        switch (suit) {
            case "spades":
                return 'S';
            case "hearts":
                return 'H';
            case "diamonds":
                return 'D';
            case "clubs":
                return 'C';
            default:
                System.out.println("ERROR: Suit not recognised");                
                return '?';
        }
    }

    private char genValueChar() {
        switch (value) {
            case "ace":
                return 'A';
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                return value.charAt(0);
            case "10":
                return 'T';
            case "jack":
                return 'J';
            case "queen":
                return 'Q';
            case "king":
                return 'K';                
            default:
                System.out.println("ERROR: Value not recognised");                  
                return '?';            
        }
    }
    
    private String genColour() {
        switch (suit) {
            case "spades":
            case "clubs":
                return "black";
            case "hearts":
            case "diamonds":
                return "red";
            default:
                System.out.println("ERROR: Suit not recognised");
                return "?";
        }
    }
    
    public String getSuit() {
        return suit;
    }
    
    public String getValue() {
        return value;
    }
    
    public String getColour() {
        return colour;
    }
    
    public String getSymbol() {
        if(hidden) {
            return hiddenChar;
        } else {
            if (colour.equals("black")) {
                return ANSI_BLACK + valueChar + suitChar + ANSI_RESET;
            } else {
                return ANSI_RED + valueChar + suitChar + ANSI_RESET;
            }
        }
    }
    
    public void setHidden(boolean cond) {
        hidden = cond;
    }
    
    public boolean getHidden() {
        return hidden;
    }	
}


