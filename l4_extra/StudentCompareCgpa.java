package l4_extra;

import java.util.Comparator;

public class StudentCompareCgpa implements Comparator<Student> {
    @Override
    public int compare(Student s1,Student  s2){
        if(s1.getCgpa() == s2.getCgpa())
            return 0;
        else if(s1.getCgpa() > s2.getCgpa())
            return 1;
        else
            return -1;
    }
}
