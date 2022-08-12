package peaksoft7_1oop;

public class School {
    private String city;
    private int year;
    private String directorName;
    private int numberOfTeachers;
    private Student[] students = new Student[70];
    private int indexOfNewStudent = 0;

    public School(String city, int year, String directorName, int numberOfTeachers) {
        this.city = city;
        this.year = year;
        this.directorName = directorName;
        this.numberOfTeachers = numberOfTeachers;
    }

    public void addStudent(Student student){
        this.students[indexOfNewStudent] = student;
        indexOfNewStudent++;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getIndexOfNewStudent() {
        return indexOfNewStudent;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    public String getDirectorName() {
        return directorName;
    }
}
