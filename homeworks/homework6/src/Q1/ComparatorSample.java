package Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ComparatorSample {
    public static void main(String[] args) {
        List<Student> test = new ArrayList<>();
        test.add(new Student("Jack",3.8, new Date(123)));
        test.add(new Student("Rose", 3.6, new Date(99)));
        test.add(new Student("John", 3.5, new Date(105)));
        test.add(new Student("Amy", 3.2, new Date(89)));
        test.add(new Student("Zack", 4.0, new Date(111)));

        Collections.sort(test, new NameComparator());
        System.out.println(test);

        System.out.println("------------------");

        Collections.sort(test, new GpaComparator());
        System.out.println(test);

        System.out.println("-----------------");

        Collections.sort(test, new DateOfBirthComparator());
        System.out.println(test);

    }

}
