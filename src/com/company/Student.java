package com.company;

public class Student extends Person{
    private String schoolName;
    private boolean relationship;

    public Student(String schoolName, boolean relationship, String name, int age, String gender){
        super(name, age, gender);
        this.schoolName = schoolName;
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                "schoolName='" + schoolName + '\'' +
                ", relationship=" + relationship +
                '}';
    }

    public String getSchoolName() {
        return schoolName;
    }

    public boolean isRelationship() {
        return relationship;
    }
}
