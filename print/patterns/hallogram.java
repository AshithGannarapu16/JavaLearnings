public class Hallogram {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 21;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Print border or diagonals for "hallowgram" effect
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1 || i == j || j == cols - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}