import java.util.*;

public class Ass2q6 {
    public static void main(String[] args) {
        Ass2q6 test = new Ass2q6();
        String s = "egg";
        String t = "add";
        System.out.println(test.isIsomorphic(s,t));

        String s1 = "foo";
        String t1 = "bar";
        System.out.println(test.isIsomorphic(s1,t1));

        //String s = "paper";
        //String t = "title";
        System.out.println(test.isIsomorphic("paper","title"));
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            //mapping  is s -> t
            char tc = t.charAt(i);
            char sc = s.charAt(i);
            if(map.containsKey(sc)) {
                if(tc != map.get(sc)) {
                    return false;
                }
            } else {
                if(used.contains(tc)) {
                    return false;
                } else {
                    map.put(sc, tc);
                    used.add(tc);
                }
            }
        }
        return true;
    }
}
