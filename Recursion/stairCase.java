import java.util.*;
public class stairCase {
    public ArrayList<ArrayList<Integer>> WaysToClimb(int A) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        WaysToClimb(A, ans, res);
        return res;
        
    }
    public static void WaysToClimb(int A,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> res){
        if(A==0){
            res.add(new ArrayList<>(ans));
            return;
        }

        if(A>=1){
            ans.add(1);
            WaysToClimb(A-1, ans, res);
            ans.remove(ans.size()-1);
        }

        if(A>=2){
            ans.add(2);
            WaysToClimb(A-2, ans, res);
            ans.remove(ans.size()-1);
        }
        
    }
    public static void main(String[] args) {
        stairCase sc = new stairCase();
        int A = 4; 
        ArrayList<ArrayList<Integer>> result = sc.WaysToClimb(A);
        
        for (ArrayList<Integer> way : result) {
            System.out.println(way);
        }
    }
}
