package LE3Q2;

import java.util.Comparator;
class HelperClassCompareFirstNames implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
