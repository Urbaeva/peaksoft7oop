package peaksoft7_1oop;

public class JuniorStudent extends Student{
    private String level;
    private String community;

    public JuniorStudent(String name, int age, String hobby, String gender, String teacherName, String level, String community){
        super(name, age, hobby, gender, teacherName);
        this.level = level;
        this.community = community;
    }

    public String getLevel() {
        return level;
    }

    public String getCommunity() {
        return community;
    }
}
