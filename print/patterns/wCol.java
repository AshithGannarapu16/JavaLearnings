import java.util.*;

public class r {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        list.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        list.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        RowCol obj = new RowCol();
        ArrayList<Integer> res = obj.solve(list);
        System.out.println(res);
    }

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> list) {
        int n = list.size();
        int m = list.get(0).size();
        ArrayList<Integer> res = new ArrayList<>();

        // Sum of rows
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += list.get(i).get(j);
            }
            res.add(sum);
        }

        // Sum of columns
        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += list.get(i).get(j);
            }
            res.add(sum);
        }
        return res;
    }
}
