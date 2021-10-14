package q2;

public class AddOperation implements MathOperation {
    @Override
    public int performOperation(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}
