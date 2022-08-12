package peaksoft7_1oop;

public class Main {
    public static void main(String[] args) {

        School school = new School("Bishkek", 1999, "NurLan", 30);
        JuniorStudent juniorStudent1 = new JuniorStudent("Marsel", 19, "playing Gitar", "male", "Baktugul", "good", "extrovert");
        JuniorStudent juniorStudent2 = new JuniorStudent("Nurel", 22, "football", "male", "Bakyt", "best", "introvert");
        JuniorStudent juniorStudent3 = new JuniorStudent("Nurjamal", 14, "playing chess", "female", "Rashid", "best", "introvert");
        SeniorStudent seniorStudent1 = new SeniorStudent("Burulai", 20, "swimming", "female", "Kulen", "Math");
        SeniorStudent seniorStudent2 = new SeniorStudent("Kulen", 20, "football", "male", "Burulai", "Math");

        school.addStudent(juniorStudent1);
        school.addStudent(juniorStudent2);
        school.addStudent(juniorStudent3);
        school.addStudent(seniorStudent1);
        school.addStudent(seniorStudent2);

        Student[] students = school.getStudents();

        System.out.println("-----------PASSED STUDENTS--------------");
        for (int i=0; i<school.getIndexOfNewStudent(); i++) {
            if (students[i].getSumOfMarks() > 50) {
//            if (students[i] instanceof SeniorStudent) {
                System.out.println("Type of student: " + students[i].getClass().getSimpleName());
                System.out.println("Name: " + students[i].getName());
                System.out.println("Age: " + students[i].getAge());
                System.out.println("Gender: " + students[i].getGender());
                System.out.println("Hobby: " + students[i].getHobby());
                System.out.println("Teacher: " + students[i].getTeacherName());
                System.out.println("Marks: " + students[i].getSumOfMarks());
                System.out.println("--------------------------------------");
            }
        }

        System.out.println("\n-----------REJECTED STUDENTS------------");
        for (int i = 0; i < school.getIndexOfNewStudent(); i++) {
            if (students[i].getSumOfMarks() < 50){
                System.out.println("Type of student: " + students[i].getClass().getSimpleName());
                System.out.println("Name: " + students[i].getName());
                System.out.println("Age: " + students[i].getAge());
                System.out.println("Gender: " + students[i].getGender());
                System.out.println("Hobby: " + students[i].getHobby());
                System.out.println("Teacher: " + students[i].getTeacherName());
                System.out.println("Marks: " + students[i].getSumOfMarks());
                System.out.println("-----------------------------------------");
            }
        }
    }
}
