package Q1;

public class SportsCar extends CarDecorator{
    //private Car car;

    public SportsCar(Car car){
        super(car);
    }

    public void assemble(){
        super.assemble();
        addFeatures();
    }

    public void addFeatures(){
        System.out.print("Adding features of Sports Car.");
    }

}
