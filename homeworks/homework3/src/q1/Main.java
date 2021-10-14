package q1;

import q1.Happy;

public class Main {

    public static void main(String[] args) {
	    Moody m1 = new Happy();
	    Moody m2 = new Sad();
	    Psychiatrist p = new Psychiatrist();

	    p.examine(m1);
	    p.observe(m1);
		System.out.println(p.toString());

	    p.examine(m2);
	    p.observe(m2);
		System.out.println(p.toString());
    }
}
