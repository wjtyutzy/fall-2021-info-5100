import java.util.Arrays;

public class Ass2q4 {

    public static void main(String[] args){
        Ass2q4 test = new Ass2q4();
        int[][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
        test.rotate(matrix);
        for(int[] i : matrix){
            System.out.println(Arrays.toString(i));
        }

        int[][] matrix1 ={{5,1,9,11}, {2,4,8,10},{13,3,6,7}, {15,14,12,16}};
        test.rotate(matrix1);
        for(int[] i : matrix1){
            System.out.println(Arrays.toString(i));
        }

        int[][] matrix2 = {{1}};
        test.rotate(matrix2);
        for(int[] i : matrix2){
            System.out.println(Arrays.toString(i));
        }

        int[][] matrix3 = {{1,2},{3,4}};
        test.rotate(matrix3);
        for(int[] i : matrix3){
            System.out.println(Arrays.toString(i));
        }

    }



    public void rotate(int[][] grid) {
        int n = grid.length;

        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right= n - 1;

        while(left < right) {
            for(int i = 0; i < right - left; i++) {
                int tmp = grid[top][left + i];
                grid[top][left + i] = grid[bottom - i][left];
                grid[bottom - i][left] = grid[bottom][right - i];
                grid[bottom][right - i] = grid[top + i][right];
                grid[top + i][right] = tmp;
            }
            top++; bottom--;
            left++; right--;
        }
    }
}
