package nx.bootcamp.homework7_1;

import java.util.LinkedList;

public class GroupLinkList<T> {
    private T groupNumber;
    private String direction;
    private LinkedList<Student> students;

    public GroupLinkList(T groupNumber, String direction) {
        this.groupNumber = groupNumber;
        this.direction = direction;
        students = new LinkedList<Student>();
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
