public class Ass2q2 {

    public static void main(String[] args){
        Ass2q2 res1 = new Ass2q2();
        String[] dict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        System.out.println(res1.shortestDistance(dict,word1,word2));

        //Ass2q2 res2 = new Ass2q2();
        String[] dict2 = {"practice", "makes", "perfect", "coding", "makes"};
        String word3 = "makes";
        String word4 = "coding";
        System.out.println(res1.shortestDistance(dict2,word3,word4));


    }

    public int shortestDistance(String[] dict, String word1, String word2) {
        if(dict.length == 1) {
            return 0;
        }

        int p1 = -1;
        int p2 = -1;
        int res = dict.length;
        for(int i = 0; i < dict.length; i++) {
            if(dict[i].equals(word1)) {
                p1 = i;
            }

            if(dict[i].equals(word2)) {
                p2 = i;
            }

            if(p1 >= 0 && p2 >= 0) {
                res = Math.min(res, Math.abs(p1 - p2));
            }
        }

        return res;
    }
}
