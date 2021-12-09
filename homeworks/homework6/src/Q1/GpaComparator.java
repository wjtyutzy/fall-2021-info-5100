package Q1;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        //Double.compare(o2.getGpa(), o1.getGpa());
        if(o1.getGpa() < o2.getGpa()) {
            return 1;
        }else if(o1.getGpa() > o2.getGpa()) {
            return -1;
        }else{
            return 0;
        }
    }
}
