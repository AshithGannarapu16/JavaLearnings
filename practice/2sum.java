
import java.util.HashMap;

public class 2sum {
  public static void main(String[] args) {
    int[] arr = {11, 3, 7, 9, 14, 2};
    int target = 17;
    int[] ans = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
      int complement = target - arr[i];
      if (map.containsKey(complement)) {
        ans[0] = map.get(complement);
        ans[1] = i;
        found = true;
        break;
      }
      map.put(arr[i], i);
    }
    if (found) {
      System.out.println("Indices: " + ans[0] + ", " + ans[1]);
      System.out.println("Values: " + arr[ans[0]] + ", " + arr[ans[1]]);
    } else {
      System.out.println("No two sum solution found.");
    }
  }
}