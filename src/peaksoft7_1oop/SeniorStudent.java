package peaksoft7_1oop;

public class SeniorStudent extends Student{
    private String favoriteSubject;
    private int numberOfClassmates;
    private int examResult;

    public SeniorStudent(String name, int age, String hobby, String gender, String teacherName, String favoriteSubject){
        super(name, age, hobby, gender, teacherName);
        this.favoriteSubject = favoriteSubject;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public int getNumberOfClassmates() {
        return numberOfClassmates;
    }

    public int getExamResult() {
        return examResult;
    }
}
