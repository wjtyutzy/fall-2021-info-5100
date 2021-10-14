package q1;

public class Happy extends Moody {

    @Override
    public String getMood() {
        return "happy";
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeehee…hahahah…HAHAHA!!");
    }

    public String toString(){
        return "laughs a lot";
    }
}
