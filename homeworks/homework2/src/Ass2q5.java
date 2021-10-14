import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ass2q5 {
    public static void main(String[] args) {
        Ass2q5 test = new Ass2q5();
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(test.spiralOrder(matrix1));


        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println( test.spiralOrder(matrix2));

    }


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return res;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        while(top <= bottom && left <= right){
            int curleft = left;
            while(curleft <= right){
                res.add(matrix[top][curleft++]);
            }
            top++;

            int curtop = top;
            while(curtop <= bottom){
                res.add(matrix[curtop++][right]);
            }
            right--;

            int curright = right;
            if(top <= bottom){
                while(curright >= left  ){
                    res.add(matrix[bottom][curright--]);
                }
                bottom--;
            }

            int curbottom = bottom;
            if(left <= right){
                while(curbottom >= top ){
                    res.add(matrix[curbottom--][left]);
                }
                left++;
            }
        }

        return res;

    }

}
