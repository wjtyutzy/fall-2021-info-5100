package Q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0){
            return res;
        }

        for(int i = 0; i < strs.length; i++){
            String code = myHash(strs[i]);
            if(!map.containsKey(code)){
                map.put(code, new ArrayList<>());
            }
            map.get(code).add(strs[i]);
        }

        for(List<String> idxs : map.values()){
            res.add(idxs);
        }

        return res;
    }


    private String myHash(String word){
        if(word == null || word.length() == 0){
            return word;
        }
        int[] dic = new int[26];
        for(int i = 0; i < word.length(); i++){
            dic[word.charAt(i) -'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(dic[i] != 0){
                sb.append((char)(i + 'a')).append(dic[i]);
            }
        }
        //System.out.println(sb);
        return sb.toString();
    }

}
