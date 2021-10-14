package q1;

public abstract class Moody {
    public abstract String getMood();
    public abstract void expressFeelings();
    public void queryMood(){
        System.out.println("I feel " + this.getMood() + " today");
    };
}
