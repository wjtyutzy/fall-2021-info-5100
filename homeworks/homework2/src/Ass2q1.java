import java.lang.reflect.Array;
import java.util.Arrays;

public class Ass2q1 {

    public static void main(String[] args){
        int[][] t1 = {{1,2,3},{4,5,6},{7,8,9}};
        //Output: [[1,4,7],[2,5,8],[3,6,9]]
        int[][] t2 = {{1,2,3},{4,5,6}};

        for(int[] i : transpose(t1)){
            System.out.println(Arrays.toString(i));
        }
        for(int[] i : transpose(t2)){
            System.out.println(Arrays.toString(i));
        }

    }


    public static int[][] transpose(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] res  = new int[n][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                res[j][i] = grid[i][j];
            }
        }
        return res;
    }
}
