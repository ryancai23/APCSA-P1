/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Spades", "Clubs", "Diamonds", "Hearts"};
		int[] pv = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck test = new Deck(rank, suit, pv);
		System.out.println("Deck size is: " + test.size());
		System.out.println("\nThe deck is empty argument is " + test.isEmpty());
		System.out.println("\nThe top card dealt is: " + test.deal().toString() + "\n");
		System.out.println(test.toString());
	}
}
