public class LCSBasic {
    static int findLCS(String a, String b, int i, int j) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
            return 1 + findLCS(a, b, i - 1, j - 1);
        }
        return Math.max(findLCS(a, b, i - 1, j), findLCS(a, b, i, j - 1));
    }

    public static void main(String[] args) {
        String s1 = "ACDBE";
        String s2 = "ABCDE";
        int result = findLCS(s1, s2, s1.length(), s2.length());
        System.out.println("LCS length: " + result);
    }
} 


