package Q1;

public class LuxuryCar extends CarDecorator{
    //private Car car;

    public LuxuryCar(Car car){
        super(car);
    }

    public void assemble(){
        super.assemble();
        addFeatures();
    }

    public void addFeatures(){
        System.out.print("Adding features of Luxury Car.");
    }
}
