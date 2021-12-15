package Q1;

public class Roomba implements iRobot{
    int[][] room;
    Main.Direction dir;

    public Roomba(int[][] matrix) {
        this.room = matrix;
        dir = Main.Direction.DOWN;
    }

    final int n = room.length;
    final int m = room[0].length;
    int i = 0;
    int j = 0;

    @Override
    public boolean move() {
        boolean res = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0;j < m; j++) {
                if(room[i][j] == 0) {
                    i++;
                    turnLeft();
                    return res;
                }else{
                    return res = false;
                }
            }
        }
        return res;
    }

    @Override
    public void turnLeft() {
        if(room[i+1][j+1] != -1 && i+1 <=4 && i >= 0) {
            dir = Main.Direction.LEFT;
        }
    }

    @Override
    public void turnRight() {
        if(room[i+1][j+1] != -1 && j+1 < 4 && j >= 0) {
            dir = Main.Direction.RIGHT;
        }
    }

    @Override
    public void clean() {
        room[i][j] = 1;
    }
}
