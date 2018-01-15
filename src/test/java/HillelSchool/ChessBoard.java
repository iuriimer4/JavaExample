package HillelSchool;

public class ChessBoard {
  public static void main(String[] args) {
    letsDoIt(5, 5);
  }

  public static void letsDoIt(int numberOfLoops, int numberOfSymbols) {
    for (int x = 1; x <= numberOfLoops; x++) {
      for (int n = 1; n <= numberOfLoops; n++) {
        System.out.println("#");
      }
      System.out.println();
    }
  }
}

