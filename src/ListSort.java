/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2,"C"));
        studentList.add(new Student(4,"A"));
        studentList.add(new Student(1,"D"));
        studentList.add(new Student(3,"B"));

        Teacher teacher = new Teacher(studentList.get(1));

        System.out.println("比較前:");
        System.out.println(studentList);
        System.out.println("老師:");
        System.out.println(teacher);
        System.out.println(studentList.get(1));

        Collections.sort(studentList);
        System.out.println("比較後:");
        System.out.println(studentList);
        System.out.println("老師:");
        System.out.println(teacher);
        System.out.println(studentList.get(1));

        System.out.println("修改:");
        studentList.get(0).setName("E");
        System.out.println("老師:");
        System.out.println(teacher);
    }
}
