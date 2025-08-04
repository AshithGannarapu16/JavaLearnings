import java.util.*;
public  class keyvalue{
    public static void main(String[] args) {
        Map<String, Integer> scores=new HashMap<>();
        scores.put("math", 90);
        scores.put("science", 85);
        scores.put("english", 88);
        scores.put("history", 92);

        System.out.println("science score :" + scores.get("science"));
    }
}