public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card aceDiamonds = new Card("ace", "diamonds", 1);
      Card tenHearts = new Card("ten", "hearts", 10);


      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 1: ace of diamonds ****");
      System.out.println("  rank: " + aceDiamonds.rank());
      System.out.println("  suit: " + aceDiamonds.suit());
      System.out.println("  pointValue: " + aceDiamonds.pointValue());
      System.out.println("  toString: " + aceDiamonds.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 1: ten of hearts ****");
      System.out.println("  rank: " + tenHearts.rank());
      System.out.println("  suit: " + tenHearts.suit());
      System.out.println("  pointValue: " + tenHearts.pointValue());
      System.out.println("  toString: " + tenHearts.toString());
      System.out.println();


      // Test matches() method

   }
}
