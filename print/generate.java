public class generate {
    public int[][] generateMatrix(int A) {
        int[][] mat = new int[A][A];
        int l = 0, r = A-1, t = 0, b = A-1;
        int num = 1;

        while (num <= A*A) {
            // Top row
            for (int j = l; j <= r; j++)
                mat[t][j] = num++;
            t++;

            // Right column
            for (int i = t; i <= b; i++)
                mat[i][r] = num++;
            r--;

            // Bottom row
            if (t <= b) {
                for (int j = r; j >= l; j--)
                    mat[b][j] = num++;
                b--;
            }

            // Left column
            if (l <= r) {
                for (int i = b; i >= t; i--)
                    mat[i][l] = num++;
                l++;
            }
        }

        return mat;
    }
}
