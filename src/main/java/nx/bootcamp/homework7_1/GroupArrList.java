package nx.bootcamp.homework7_1;

import java.util.ArrayList;

public class GroupArrList<T> {
    private T groupNumber;
    private String direction;
    private ArrayList<Student> students;

    public GroupArrList(T groupNumber, String direction) {
        this.groupNumber = groupNumber;
        this.direction = direction;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                break;
            }
        }
    }

    public void printGroup() {
        System.out.println("Group " + groupNumber + " (" + direction + "):");
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
    }
}
