package q1;

import q1.Moody;

public class Psychiatrist {
    Moody moody;
    public void examine(Moody moody){
        System.out.println("How are you feeling today?");
        this.moody = moody;
        moody.queryMood();
    }

    public void observe(Moody moody){
        moody.expressFeelings();
    }

    public String toString(){
        //System.out.println("Observation: Subject " + moody.toString());
        return "Observation: Subject " + moody.toString();
    }
}
