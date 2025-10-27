import java.util.*;

public class So {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : A) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : B) {
            if (freq.containsKey(num)) {
                int count = freq.get(num);
                for (int i = 0; i < count; i++) {
                    res.add(num);
                }
                freq.remove(num);
            }
        }
        ArrayList<Integer> leftovers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                leftovers.add(num);
            }
        }
        Collections.sort(leftovers);
        res.addAll(leftovers);
        return res;
    }
}