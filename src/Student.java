/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
public class Student implements Comparable<Student>
{
    private int id = 0;
    private String Name = "";

    public Student(int id, String name) {
        this.id = id;
        this.Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o)
    {
        return  o.id - this.id;
    }
}
