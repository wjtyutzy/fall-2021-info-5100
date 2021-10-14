public class Sum {
    public static void main(String[] args){
        Sum sum = new Sum();
        System.out.println(sum.add(2,3));
        System.out.println(sum.add(4,9,12));
        System.out.println(sum.add(4,5.0));
        System.out.println(sum.add(15.5,5));
        System.out.println(sum.add(1.0,6.4));

    }

    public int add(int x, int y){
        int sum = x + y;
        return sum;
    }

    public int add(int x, int y, int z){
        int sum = x + y + z;
        return sum;
    }

    public double add(double x, double y){
        double sum = x + y;
        return sum;
    }
}
