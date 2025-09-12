package util;

public class RollCompare implements Compare {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        return Integer.compare(s1.getRollnum(), s2.getRollnum());
    }
}
