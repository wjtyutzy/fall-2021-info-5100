package q1;

import q1.Moody;

public class Sad extends Moody {

    @Override
    public String getMood() {
        return "sad";
    }

    @Override
    public void expressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }

    public String toString(){
        return "cries a lot";
    }
}
