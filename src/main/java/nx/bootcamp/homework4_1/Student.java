package nx.bootcamp.homework4_1;

public class Student {
    private String name;
    private int age;
    private String university;
    private int groupNumber;
    private double averageScore;
    private String favoriteSubject;

    public Student(
            String name, int age, String university, int groupNumber,
            double averageScore, String favoriteSubject) {
        this.name = name;
        this.age = age;
        this.university = university;
        this.groupNumber = groupNumber;
        this.averageScore = averageScore;
        this.favoriteSubject = favoriteSubject;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }
}

