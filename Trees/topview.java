/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class topview {
    public ArrayList<Integer> solve(TreeNode A) {
        if(A==null) return new ArrayList<>();
        Queue <pair> q=new ArrayQueue<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        int minvl=0,maxvl=0;
        q.add(new pair(A, 0));
        while(q.size()!=0){
            pair rp=q.remove();
            minvl=Math.min(minvl, rp.vl);
            maxvl=Math.max(maxvl, rp.vl);
            if(!map.containsKey(rp.vl)){
                map.put(rp.vl, new ArrayList<>());
            }
            map.get(rp.vl).add(rp.TreeNode);
            if(rp.TreeNode.left!=null){
                q.add(new pair(rp.TreeNode.left, rp.vl-1));
            }

            if(rp.TreeNode.right!=null){
                q.add(new pair(rp.TreeNode.right, rp.vl+1));
            }
        }
        for(int i=minvl;i<=maxvl;i++){
            System.out.println(map.get(i).get(0));
        }

    }
}
