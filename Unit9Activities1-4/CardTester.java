/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Queen", "Hearts", 12);
		Card card2 = new Card("Ten", "Spades", 10);
		Card card3 = new Card("Four", "Diamonds", 4);
		
		System.out.println(card3.toString());
		System.out.println("Card 1 and Card 2 match? " + card1.matches(card2));
		System.out.println("Card 1 and Card 3 match? " + card1.matches(card3));
	}
}
