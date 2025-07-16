public class pascal {

  public static int[][] generate(int A) {
    int[][] triangle = new int[A][A];

    for (int i = 0; i < A; i++) { // Valid indices: 0 to A - 1
      triangle[i][0] = 1;

      for (int j = 1; j <= i; j++) {
        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
      }
    }

    return triangle;
  }

  public static void main(String[] args) {
    int[][] result = generate(5); // Example input: A = 5

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}
